package com.java.facade.example2;

public class FeverPatientFacade {

    private BloodTest bloodTest;
    private SugarTest sugarTest;
    private ScanTest scanTest;

    

    public FeverPatientFacade() {
		// TODO Auto-generated constructor stub
    	this.bloodTest = bloodTest;
        this.sugarTest = sugarTest;
        this.scanTest = scanTest;
	}

	public void info() {
        System.out.println("---- Fever Patient Test Process ----");
        bloodTest.show();
        sugarTest.fastingTest();
        sugarTest.postTest();
        scanTest.info();
    }
}
