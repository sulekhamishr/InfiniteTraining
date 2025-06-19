package com.java.facade.example2;

public class PregnantFacade {

    private BetaHcg betaHcg;
    private DopplerTest dopplerTest;
    private HeartEchoTest heartEchoTest;

    public PregnantFacade(BetaHcg betaHcg, DopplerTest dopplerTest, HeartEchoTest heartEchoTest) {
        this.betaHcg = betaHcg;
        this.dopplerTest = dopplerTest;
        this.heartEchoTest = heartEchoTest;
    }

    public void fullPregnancyCheckup() {
        System.out.println("---- Pregnancy Diagnostic Process ----");
        betaHcg.info();
        dopplerTest.info();
        heartEchoTest.echo2d();
        heartEchoTest.echo3d();
    }
}
