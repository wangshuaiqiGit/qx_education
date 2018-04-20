package com.qx.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Profession")
public class Profession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Column(name = "school_id", length = 50)
    private String schoolid;

    @Size(max = 50)
    @Column(name = "proName", length = 50)
    private String proName;

    @Size(max = 20)
    @Column(name = "adminType", length = 20)
    private String adminType;

    @Size(max = 20)
    @Column(name = "subjectType", length = 20)
    private String subjectType;

    @Size(max = 50)
    @Column(name = "firstName", length = 50)
    private String firstName;

    @Size(max = 20)
    @Column(name = "dropPointType", length = 20)
    private String dropPointType;

    @Size(max = 50)
    @Column(name = "evaluationMode", length = 50)
    private String evaluationMode;

    @Size(max = 50)
    @Column(name = "writeTest", length = 50)
    private String writeTest;

    @Size(max = 50)
    @Column(name = "viewTest", length = 50)
    private String viewTest;

    @Size(max = 50)
    @Column(name = "underfindEvent", length = 50)
    private String underfindEvent;

    @Size(max = 50)
    @Column(name = "otherEvent", length = 50)
    private String otherEvent;

    @Size(max = 50)
    @Column(name = "mathEvent", length = 50)
    private String mathEvent;

    @Size(max = 50)
    @Column(name = "physicalEvent", length = 50)
    private String physicalEvent;

    @Size(max = 50)
    @Column(name = "chemistryEvent", length = 50)
    private String chemistryEvent;

    @Size(max = 50)
    @Column(name = "biologyEvent", length = 50)
    private String biologyEvent;

    @Size(max = 50)
    @Column(name = "informationEvent", length = 50)
    private String informationEvent;

    @Size(max = 50)
    @Column(name = "compositionEvent", length = 50)
    private String compositionEvent;

    @Size(max = 50)
    @Column(name = "englishEvent", length = 50)
    private String englishEvent;

    @Size(max = 50)
    @Column(name = "youthEvent", length = 50)
    private String youthEvent;

    @Size(max = 50)
    @Column(name = "newScience", length = 50)
    private String newScience;

    @Size(max = 50)
    @Column(name = "tomorrowScientist", length = 50)
    private String tomorrowScientist;

    @Size(max = 50)
    @Column(name = "book", length = 50)
    private String book;

    @Size(max = 50)
    @Column(name = "innovationPotential", length = 50)
    private String innovationPotential;

    @Size(max = 50)
    @Column(name = "utilityModelpatent", length = 50)
    private String utilityModelpatent;

    @Size(max = 50)
    @Column(name = "inventionPatent", length = 50)
    private String inventionPatent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDropPointType() {
        return dropPointType;
    }

    public void setDropPointType(String dropPointType) {
        this.dropPointType = dropPointType;
    }

    public String getEvaluationMode() {
        return evaluationMode;
    }

    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    public String getWriteTest() {
        return writeTest;
    }

    public void setWriteTest(String writeTest) {
        this.writeTest = writeTest;
    }

    public String getViewTest() {
        return viewTest;
    }

    public void setViewTest(String viewTest) {
        this.viewTest = viewTest;
    }

    public String getUnderfindEvent() {
        return underfindEvent;
    }

    public void setUnderfindEvent(String underfindEvent) {
        this.underfindEvent = underfindEvent;
    }

    public String getOtherEvent() {
        return otherEvent;
    }

    public void setOtherEvent(String otherEvent) {
        this.otherEvent = otherEvent;
    }

    public String getMathEvent() {
        return mathEvent;
    }

    public void setMathEvent(String mathEvent) {
        this.mathEvent = mathEvent;
    }

    public String getPhysicalEvent() {
        return physicalEvent;
    }

    public void setPhysicalEvent(String physicalEvent) {
        this.physicalEvent = physicalEvent;
    }

    public String getChemistryEvent() {
        return chemistryEvent;
    }

    public void setChemistryEvent(String chemistryEvent) {
        this.chemistryEvent = chemistryEvent;
    }

    public String getBiologyEvent() {
        return biologyEvent;
    }

    public void setBiologyEvent(String biologyEvent) {
        this.biologyEvent = biologyEvent;
    }

    public String getInformationEvent() {
        return informationEvent;
    }

    public void setInformationEvent(String informationEvent) {
        this.informationEvent = informationEvent;
    }

    public String getCompositionEvent() {
        return compositionEvent;
    }

    public void setCompositionEvent(String compositionEvent) {
        this.compositionEvent = compositionEvent;
    }

    public String getEnglishEvent() {
        return englishEvent;
    }

    public void setEnglishEvent(String englishEvent) {
        this.englishEvent = englishEvent;
    }

    public String getYouthEvent() {
        return youthEvent;
    }

    public void setYouthEvent(String youthEvent) {
        this.youthEvent = youthEvent;
    }

    public String getNewScience() {
        return newScience;
    }

    public void setNewScience(String newScience) {
        this.newScience = newScience;
    }

    public String getTomorrowScientist() {
        return tomorrowScientist;
    }

    public void setTomorrowScientist(String tomorrowScientist) {
        this.tomorrowScientist = tomorrowScientist;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getInnovationPotential() {
        return innovationPotential;
    }

    public void setInnovationPotential(String innovationPotential) {
        this.innovationPotential = innovationPotential;
    }

    public String getUtilityModelpatent() {
        return utilityModelpatent;
    }

    public void setUtilityModelpatent(String utilityModelpatent) {
        this.utilityModelpatent = utilityModelpatent;
    }

    public String getInventionPatent() {
        return inventionPatent;
    }

    public void setInventionPatent(String inventionPatent) {
        this.inventionPatent = inventionPatent;
    }
}
