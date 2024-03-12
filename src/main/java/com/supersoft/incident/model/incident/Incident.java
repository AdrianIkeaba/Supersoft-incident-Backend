package com.supersoft.incident.model.incident;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "incident")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Override
    public String toString() {
        return "Incident{" +
                "id=" + id +
                ", date=" + date +
                ", lastEditedDate='" + lastEditedDate + '\'' +
                ", incidentId='" + incidentId + '\'' +
                ", contactType='" + contactType + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", incidentState='" + incidentState + '\'' +
                ", category='" + category + '\'' +
                ", impact='" + impact + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", urgency='" + urgency + '\'' +
                ", service='" + service + '\'' +
                ", product='" + product + '\'' +
                ", priority='" + priority + '\'' +
                ", serviceOffering='" + serviceOffering + '\'' +
                ", assignmentGroup='" + assignmentGroup + '\'' +
                ", notify='" + notify + '\'' +
                ", assignmentTo='" + assignmentTo + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", title='" + title + '\'' +
                ", incidentCause='" + incidentCause + '\'' +
                ", youDid='" + youDid + '\'' +
                ", description='" + description + '\'' +
                ", organisation='" + organisation + '\'' +
                ", department='" + department + '\'' +
                ", photoname='" + photoname + '\'' +
                ", filename='" + filename + '\'' +
                ", status='" + status + '\'' +
                ", support='" + support + '\'' +
                '}';
    }

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "last_edited_date", nullable = false, length = 255)
    private String lastEditedDate;

    @Column(name = "incident_id", nullable = false, length = 255)
    private String incidentId;

    @Column(name = "contact_type", nullable = false, length = 255)
    private String contactType;

    @Column(name = "username", nullable = false, length = 255)
    private String username;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "incident_state", nullable = false, length = 255)
    private String incidentState;

    @Column(name = "category", nullable = false, length = 255)
    private String category;

    @Column(name = "impact", nullable = false, length = 255)
    private String impact;

    @Column(name = "sub_category", nullable = false, length = 255)
    private String subCategory;

    @Column(name = "urgency", nullable = false, length = 255)
    private String urgency;

    @Column(name = "service", nullable = false, length = 255)
    private String service;

    @Column(name = "product", nullable = false, length = 255)
    private String product;

    @Column(name = "priority", nullable = false, length = 255)
    private String priority;

    @Column(name = "service_offering", nullable = false, length = 255)
    private String serviceOffering;

    @Column(name = "assignment_group", nullable = false, length = 255)
    private String assignmentGroup;

    @Column(name = "notify", nullable = false, length = 255)
    private String notify;

    @Column(name = "assignment_to", nullable = false, length = 255)
    private String assignmentTo;

    @Column(name = "short_description", nullable = false, length = 255)
    private String shortDescription;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "incident_cause", nullable = false, length = 255)
    private String incidentCause;

    @Column(name = "you_did", nullable = false, length = 255)
    private String youDid;

    @Column(name = "description", nullable = false, columnDefinition = "LONGTEXT")
    private String description;

    @Column(name = "organisation", nullable = false, length = 255)
    private String organisation;

    @Column(name = "department", nullable = false, length = 255)
    private String department;

    @Column(name = "photoname", nullable = false, length = 255)
    private String photoname;

    @Column(name = "filename", nullable = false, length = 255)
    private String filename;

    @Column(name = "status", nullable = false, length = 255)
    private String status;

    @Column(name = "support", nullable = false, length = 255)
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

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIncidentState() {
        return incidentState;
    }

    public void setIncidentState(String incidentState) {
        this.incidentState = incidentState;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getServiceOffering() {
        return serviceOffering;
    }

    public void setServiceOffering(String serviceOffering) {
        this.serviceOffering = serviceOffering;
    }

    public String getAssignmentGroup() {
        return assignmentGroup;
    }

    public void setAssignmentGroup(String assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public String getAssignmentTo() {
        return assignmentTo;
    }

    public void setAssignmentTo(String assignmentTo) {
        this.assignmentTo = assignmentTo;
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

    public String getIncidentCause() {
        return incidentCause;
    }

    public void setIncidentCause(String incidentCause) {
        this.incidentCause = incidentCause;
    }

    public String getYouDid() {
        return youDid;
    }

    public void setYouDid(String youDid) {
        this.youDid = youDid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getPhotoname() {
        return photoname;
    }

    public void setPhotoname(String photoname) {
        this.photoname = photoname;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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

