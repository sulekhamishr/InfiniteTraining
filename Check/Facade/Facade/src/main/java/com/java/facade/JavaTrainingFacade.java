package com.java.facade;

public class JavaTrainingFacade {

    private Mcq mcq;
    private Practical practical;
    private Project project;
    private HackerRank hackerRank;

    public JavaTrainingFacade(Mcq mcq, Practical practical, Project project, HackerRank hackerRank) {
        this.mcq = mcq;
        this.practical = practical;
        this.project = project;
        this.hackerRank = hackerRank;
    }

    public void trainingInfo() {
        mcq.info();
        mcq.finale();

        practical.info();
        practical.timing();

        project.info();

        hackerRank.info();
    }
}
