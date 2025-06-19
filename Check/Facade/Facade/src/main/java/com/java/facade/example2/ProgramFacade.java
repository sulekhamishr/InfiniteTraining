package com.java.facade.example2;

public class ProgramFacade {

    private BloodTest bloodTest;
    private DopplerTest dopplerTest;
    private BetaHcg betaHcgTest;

    public ProgramFacade(BloodTest bloodTest, DopplerTest dopplerTest, BetaHcg betaHcgTest) {
        this.bloodTest = bloodTest;
        this.dopplerTest = dopplerTest;
        this.betaHcgTest = betaHcgTest;
    }

    public void fullDiagnosis() {
        System.out.println("---- Full Programmed Diagnosis ----");
        bloodTest.show();
        dopplerTest.info();
        betaHcgTest.info();
    }
}
