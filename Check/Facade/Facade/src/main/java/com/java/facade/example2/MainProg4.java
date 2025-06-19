package com.java.facade.example2;

public class MainProg4 {

    public static void main(String[] args) {
        BloodTest bloodTest = new BloodTest();
        Criatine creatinineTest = new Criatine();
        ScanTest scanTest = new ScanTest();

        KidneyPatientFacade kidneyFacade = new KidneyPatientFacade(bloodTest, creatinineTest, scanTest);
        kidneyFacade.performKidneyDiagnosis();
    }
}
