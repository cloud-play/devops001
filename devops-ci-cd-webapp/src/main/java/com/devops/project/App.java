package com.devops.project;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    // PMD will catch this: Unused private field
    private String secretToken = "KB-12345"; 

    public List<String> getAvailableCourses() {
        List<String> courses = new ArrayList<>();
        courses.add("DevOps Masterclass");
        courses.add("Docker & Kubernetes");
        courses.add("Jenkins CI/CD Pipelines");
        courses.add("AWS Cloud Infrastructure");
        return courses;
    }

    public String getInstituteName() {
        return "Kubebytes DevOps Training Institute";
    }

    public static void main(String[] args) {
        App kubebytes = new App();
        System.out.println("Welcome to " + kubebytes.getInstituteName());
        System.out.println("Our Courses: " + kubebytes.getAvailableCourses());
    }
}