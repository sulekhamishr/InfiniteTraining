package com.java.jsf.dao;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.jsf.model.Admin;
import com.java.util.EncryptedPassword;
import com.java.util.SessionHelper;

public class AdminDaoImpl implements AdminDao {

    @Override
    public String addAdmin(Admin admin) {
        boolean isValid = true;
        FacesContext context = FacesContext.getCurrentInstance();

        if (admin.getUserName() == null || admin.getUserName().length() < 5 || admin.getUserName().length() > 15) {
            context.addMessage("userName", new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Admin Name Not Valid", "Admin name should be between 5 and 15 characters."));
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
            admin.setPassword(EncryptedPassword.getCode(admin.getPassword()));
            session.save(admin);
            trans.commit();
        } catch (Exception e) {
            if (trans != null) trans.rollback();
            throw e;
        } finally {
            session.close();
        }

        return "Admin Added Successfully";
    }

    @Override
    public String login(String userName, String password) {
		// TODO Auto-generated method stub

        Session session = SessionHelper.getConnection().openSession();

        try {
            Query query = session.getNamedQuery("login");
            query.setParameter("userName", userName);
            query.setParameter("password", EncryptedPassword.getCode(password));

            Admin result = (Admin) query.uniqueResult();

            if (result != null) {
                FacesContext.getCurrentInstance().getExternalContext()
                        .getSessionMap().put("loggedInUser", result);
                return "AdminDashboard?faces-redirect=true";
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Failed", "Invalid credentials"));
                return "Login?faces-redirect=true";
            }
        } finally {
            session.close();
        }
    }


}
