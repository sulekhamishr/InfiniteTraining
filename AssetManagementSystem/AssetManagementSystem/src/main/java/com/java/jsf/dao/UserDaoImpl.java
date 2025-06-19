package com.java.jsf.dao;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.jsf.model.User;
import com.java.util.EncryptedPassword;
import com.java.util.SessionHelper;

public class UserDaoImpl implements UserDao {

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		boolean isValid = true;
        FacesContext context = FacesContext.getCurrentInstance();

        if (user.getUserName() == null || user.getUserName().length() < 5 || user.getUserName().length() > 15) {
            context.addMessage("userName", new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "User Name Not Valid", "User name should be between 5 and 15 characters."));
            context.validationFailed();
            isValid = false;
        }

        if (!isValid) {
            return null;
        }

        Session session = SessionHelper.getConnection().openSession();
        Transaction trans = null;

        try {
            trans = session.beginTransaction();
             user.setPassword(EncryptedPassword.getCode(user.getPassword()));
            session.save(user);
            trans.commit();
        } catch (Exception e) {
            if (trans != null) trans.rollback();
            throw e;
        } finally {
            session.close();
        }

        return "User Added Successfully";	}

	@Override
	public String login(String userName, String password) {
		// TODO Auto-generated method stub
		Session session = SessionHelper.getConnection().openSession();

        try {
            Query query = session.getNamedQuery("UserLogin");
            query.setParameter("userName", userName);
            query.setParameter("password", EncryptedPassword.getCode(password));

            User result = (User) query.uniqueResult();

            if (result != null) {
                FacesContext.getCurrentInstance().getExternalContext()
                        .getSessionMap().put("loggedInUser", result);
                return "UserDashboard?faces-redirect=true";
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Failed", "Invalid credentials"));
                return "UserLogin?faces-redirect=true";
            }
        } finally {
            session.close();
        }
    }	}

