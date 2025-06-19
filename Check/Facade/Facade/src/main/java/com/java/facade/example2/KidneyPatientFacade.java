package com.java.facade.example2;

public class KidneyPatientFacade {

    private BloodTest bloodTest;
    private Criatine creatinineTest;
    private ScanTest scanTest;

    public KidneyPatientFacade(BloodTest bloodTest, Criatine creatinineTest, ScanTest scanTest) {
    	super();
        this.bloodTest = bloodTest;
        this.creatinineTest = creatinineTest;
        this.scanTest = scanTest;
    }

    public void performKidneyDiagnosis() {
        System.out.println("---- Kidney Patient Diagnostic Process ----");
        bloodTest.show();
        creatinineTest.info();
        scanTest.info();
    }
}
