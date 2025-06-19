package com.java.facade;

public class MainProgram {

    public static void main(String[] args) {

        Mcq mcq = new Mcq();
        Practical practical = new Practical();
        Project project = new Project();
        HackerRank hackerRank = new HackerRank();

        JavaTrainingFacade facade = new JavaTrainingFacade(mcq, practical, project, hackerRank);
        facade.trainingInfo();
    }
}
