package com.java.facade.example2;

public class ViralFeverPatientFacade {

    private BloodTest bloodTest;

    public ViralFeverPatientFacade(BloodTest bloodTest) {
        this.bloodTest = bloodTest;
    }

    public void info() {
        System.out.println("---- Viral Fever Diagnosis ----");
        bloodTest.show();
    }
}
