package com.java.facade.example2;

public class MainProg3 {
    public static void main(String[] args) {
        BetaHcg betaHcg = new BetaHcg();
        DopplerTest doppler = new DopplerTest();
        HeartEchoTest echoTest = new HeartEchoTest();

        PregnantFacade pregnantFacade = new PregnantFacade(betaHcg, doppler, echoTest);
        pregnantFacade.fullPregnancyCheckup();
    }
}
