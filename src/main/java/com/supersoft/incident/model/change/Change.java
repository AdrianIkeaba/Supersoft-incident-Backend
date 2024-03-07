package com.supersoft.incident.model.change;

import jakarta.persistence.*;


@Entity
@Table(name = "changee")
public class Change {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private String date;

    @Column(name = "last_edited_date")
    private String lastEditedDate;

    @Column(name = "change_id")
    private String changeId;

    @Column(name = "organisation")
    private String organisation;

    @Column(name = "department")
    private String department;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "email")
    private String email;

    @Column(name = "help_you_with")
    private String helpYouWith;

    @Column(name = "request_on_behalf")
    private String requestOnBehalf;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "title")
    private String title;

    @Column(name = "description", columnDefinition = "LONGTEXT")
    private String description;

    @Column(name = "impacted")
    private String impacted;

    @Column(name = "change_reason")
    private String changeReason;

    @Column(name = "risk")
    private String risk;

    @Column(name = "urgency")
    private String urgency;

    @Column(name = "priority")
    private String priority;

    @Column(name = "change_start_date")
    private String changeStartDate;

    @Column(name = "change_complete_date")
    private String changeCompleteDate;

    @Column(name = "notify")
    private String notify;

    @Column(name = "status")
    private String status;

    @Column(name = "support")
    private String support;

    // Constructors, getters, and setters

    public Change() {
    }

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

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
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

    public String getHelpYouWith() {
        return helpYouWith;
    }

    public void setHelpYouWith(String helpYouWith) {
        this.helpYouWith = helpYouWith;
    }

    public String getRequestOnBehalf() {
        return requestOnBehalf;
    }

    public void setRequestOnBehalf(String requestOnBehalf) {
        this.requestOnBehalf = requestOnBehalf;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
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

    public String getImpacted() {
        return impacted;
    }

    public void setImpacted(String impacted) {
        this.impacted = impacted;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
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

    public String getChangeStartDate() {
        return changeStartDate;
    }

    public void setChangeStartDate(String changeStartDate) {
        this.changeStartDate = changeStartDate;
    }

    public String getChangeCompleteDate() {
        return changeCompleteDate;
    }

    public void setChangeCompleteDate(String changeCompleteDate) {
        this.changeCompleteDate = changeCompleteDate;
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

