package com.java.facade.example2;

public class MainProg2 {
	


	    public static void main(String[] args) {
	        BloodTest bloodTest = new BloodTest();
	       
	        // For viral fever case only blood test is required
	        ViralFeverPatientFacade viralFacade = new ViralFeverPatientFacade(bloodTest);
	        viralFacade.info();
	    }
	}

