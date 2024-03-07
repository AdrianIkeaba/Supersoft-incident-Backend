package com.supersoft.incident.model.casee;

import jakarta.persistence.*;

@Entity
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;

    @Column(name = "last_edited_date")
    private String lastEditedDate;

    @Column(name = "case_id")
    private String caseId;
    private String organisation;
    private String department;

    @Column(name = "client_name")
    private String clientName;
    private String email;
    private String respondent;

    @Column(name = "case_type")
    private String caseType;

    @Column(name = "case_sub_type")
    private String caseSubType;

    @Column(name = "stage_of_case")
    private String stageOfCase;
    private String urgency;
    private String priority;
    private String title;
    private String description;

    @Column(name = "filling_date")
    private String filingDate;

    @Column(name = "task_assign")
    private String taskAssign;
    private String notify;
    private String status;
    private String support;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLastEditedDate() {
        return lastEditedDate;
    }

    public void setLastEditedDate(String lastEditedDate) {
        this.lastEditedDate = lastEditedDate;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRespondent() {
        return respondent;
    }

    public void setRespondent(String respondent) {
        this.respondent = respondent;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseSubType() {
        return caseSubType;
    }

    public void setCaseSubType(String caseSubType) {
        this.caseSubType = caseSubType;
    }

    public String getStageOfCase() {
        return stageOfCase;
    }

    public void setStageOfCase(String stageOfCase) {
        this.stageOfCase = stageOfCase;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(String filingDate) {
        this.filingDate = filingDate;
    }

    public String getTaskAssign() {
        return taskAssign;
    }

    public void setTaskAssign(String taskAssign) {
        this.taskAssign = taskAssign;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }
}

