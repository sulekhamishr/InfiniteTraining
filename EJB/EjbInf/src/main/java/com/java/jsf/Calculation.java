package com.java.jsf;

import java.util.Properties;

import javax.faces.event.ActionEvent;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.java.ejb.CalculationBeanRemote;


public class Calculation {
	
	private int firstNo;
	private int secondNo;
	private int result;
	
	
public int getFirstNo() {
		return firstNo;
	}





	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}





	public int getSecondNo() {
		return secondNo;
	}





	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}





	public int getResult() {
		return result;
	}





	public void setResult(int result) {
		this.result = result;
	}





public Calculation() {   //deafault constructor
		// TODO Auto-generated constructor stub
	}



public Calculation(int firstNo, int secondNo, int result) {
	super();
	this.firstNo = firstNo;
	this.secondNo = secondNo;
	this.result = result;
}





public void addition(ActionEvent evt) {

	CalculationBeanRemote statelessRemoteCalculation=null; //remote ejb ra object rakhuchii statelessRemoteCalculation
	try {
		statelessRemoteCalculation = loopupRemoteStatelessCalculation();
		//loopupRemoteStatelessCalculation()-findsz the ejb using jndi and return it's reference
		System.out.println("EJB BUSINESS LOGIC GETTING STARTED");
		this.result=statelessRemoteCalculation.add(this.firstNo, this.secondNo);
		
	}catch(NamingException e) {
		e.printStackTrace();
	}

}

public void substraction(ActionEvent evt) {

	CalculationBeanRemote statelessRemoteCalculation=null;
	try {
		statelessRemoteCalculation = loopupRemoteStatelessCalculation();
		System.out.println("EJB BUSINESS LOGIC GETTING STARTED");
		this.result=statelessRemoteCalculation.subtract(this.firstNo, this.secondNo);
		
	}catch(NamingException e) {
		e.printStackTrace();
	}

}


public void Multiplication(ActionEvent evt) {

	CalculationBeanRemote statelessRemoteCalculation=null;
	try {
		statelessRemoteCalculation = loopupRemoteStatelessCalculation();
		System.out.println("EJB BUSINESS LOGIC GETTING STARTED");
		this.result=statelessRemoteCalculation.multi(this.firstNo, this.secondNo);
		
	}catch(NamingException e) {
		e.printStackTrace();
	}

}

//private is being used here so that we are cant acess everywhere
//static so that we acan we caess directly without creating object.

	private static Context createInitialContext() throws NamingException {
		   Properties jndiProperties = new Properties();
	        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, 
	          "org.jboss.naming.remote.client.InitialContextFactory");
	        jndiProperties.put(Context.URL_PKG_PREFIXES, 
	          "org.jboss.ejb.client.naming");
	        jndiProperties.put(Context.PROVIDER_URL, 
	           "http-remoting://localhost:8080");
	        jndiProperties.put("jboss.naming.client.ejb.context", true);
	        return new InitialContext(jndiProperties);
    }
	
	private static CalculationBeanRemote loopupRemoteStatelessCalculation() throws NamingException{
		
		Context ctx=createInitialContext();
		
		//create JNDI Connection to Ejb container.
        final String distinctName = "";
        
        final String beanName = "CalculationBean";
        System.out.println(beanName);
        final String viewClassName =CalculationBeanRemote.class.getName();
        
        String appName = "";
        String moduleName = "EjbCalculation";
        
        return (CalculationBeanRemote) ctx.lookup("ejb:" 
                + appName + "/" + moduleName 
                + "/" + distinctName + "/" + beanName + "!" + viewClassName);

	}
}



