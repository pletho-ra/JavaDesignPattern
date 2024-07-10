package PrototypeDP;

import PrototypeDP.CMS.*;

import javax.print.Doc;

public class Client {
    public static void main(String[] args) {
        DocumentRegistry prototypeRegistry = new DocumentRegistry();

        Article article = new Article();
        article.setTitle("Tech Innovations 2024");
        article.setContent("Latest trends in technology...");
        article.addSection(new Section("Introduction", "An overview of tech trends."));
        article.addSection(new Section("AI", "Advancements in AI technology."));

        Report report = new Report();
        report.setTitle("Annual Financial Report");
        report.setContent("Detailed financial analysis...");
        report.addSection(new Section("Executive Summary", "Summary of financial performance."));
        report.addSection(new Section("Q1 Analysis", "Detailed analysis of Q1 performance."));

        prototypeRegistry.register("article", article);
        prototypeRegistry.register("report", report);

        Document clonedArticle = prototypeRegistry.getRegister("article");
        clonedArticle.setTitle("Tech Innovations 2025");
        clonedArticle.addSection(new Section("Future Trends", "Predictions for future trends."));

        Document clonedReport = prototypeRegistry.getRegister("report");
        clonedReport.setTitle("Quarterly Financial Report");
        clonedReport.addSection(new Section("Q2 Analysis", "Detailed analysis of Q2 performance."));


        System.out.println("Original Article Title: " + article.getTitle());
        for (Section section : article.getSections()) {
            System.out.println("Section: " + section.getHeading() + " - " + section.getText());
        }

        System.out.println("\nCloned Article Title: " + clonedArticle.getTitle());
        for (Section section : clonedArticle.getSections()) {
            System.out.println("Section: " + section.getHeading() + " - " + section.getText());
        }

        System.out.println("\nOriginal Report Title: " + report.getTitle());
        for (Section section : report.getSections()) {
            System.out.println("Section: " + section.getHeading() + " - " + section.getText());
        }

        System.out.println("\nCloned Report Title: " + clonedReport.getTitle());
        for (Section section : clonedReport.getSections()) {
            System.out.println("Section: " + section.getHeading() + " - " + section.getText());
        }
    }
}
