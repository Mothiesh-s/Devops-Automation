package com.example.devops_pract;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "🚀 Employee Management API is Running Successfully";
    }


    @GetMapping("/get")
    public String getname() {
        return "🚀 Hello this is Mothiesh.S";
    }

    @GetMapping("/health")
    public Map<String, Object> health() {

        return Map.of(
                "application", "Employee Management API",
                "status", "UP",
                "server", "AWS EC2",
                "docker", "Running",
                "jenkins", "Deployment Successful",
                "timestamp", LocalDateTime.now().toString()
        );
    }

    // Employee Data Endpoint
    @GetMapping("/employees")
    public List<Map<String, Object>> employees() {

        return List.of(

                Map.of(
                        "id", 101,
                        "name", "John",
                        "department", "Developer"
                ),

                Map.of(
                        "id", 102,
                        "name", "David",
                        "department", "QA Engineer"
                ),

                Map.of(
                        "id", 103,
                        "name", "Alex",
                        "department", "DevOps Engineer"
                ),

                Map.of(
                        "id", 104,
                        "name", "Sophia",
                        "department", "Cloud Engineer"
                )

        );
    }

    @GetMapping("/deployment")
    public Map<String, Object> deployment() {

        return Map.of(
                "deploymentStatus", "SUCCESS",
                "pipeline", "Jenkins CI/CD",
                "dockerImage", "employee-management:latest",
                "environment", "AWS EC2",
                "message", "Application deployed successfully through automated CI/CD pipeline."
        );
    }

}
