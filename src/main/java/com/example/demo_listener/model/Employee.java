package com.example.demo_listener.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Document(collection = "Employee")
public class Employee {

    @Id
    private String id;
    private String employeeId;
    private String employeeName;
    private String capabilityCentre;
    private String dateOfJoining;
    private String designation;
    private String primarySkill;
    private String secondarySkill;
    private int overallExperience;

    // Getters and Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCapabilityCentre() {
        return capabilityCentre;
    }

    public void setCapabilityCentre(String capabilityCentre) {
        this.capabilityCentre = capabilityCentre;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPrimarySkill() {
        return primarySkill;
    }

    public void setPrimarySkill(String primarySkill) {
        this.primarySkill = primarySkill;
    }

    public String getSecondarySkill() {
        return secondarySkill;
    }

    public void setSecondarySkill(String secondarySkill) {
        this.secondarySkill = secondarySkill;
    }

    public int getOverallExperience() {
        return overallExperience;
    }

    public void setOverallExperience(int overallExperience) {
        this.overallExperience = overallExperience;
    }
}