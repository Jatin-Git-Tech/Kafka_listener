package com.example.demo_listener.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Document(collection = "Project")
public class Project {

    @Id
    private String id;
    private String projectId;
    private String accountName;
    private String projectName;
    private double allocation;
    private String projectStartDate;
    private String projectEndDate;
    private String remarks;

    // Getters and Setters

    public Project () {

    }
}
