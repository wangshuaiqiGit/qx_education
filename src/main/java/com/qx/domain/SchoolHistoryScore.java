package com.qx.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SchoolHistoryScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="year", length = 20)
    private String year;

    @NotNull
    @Column(name = "schoolId")
    private long schoolid;

    private String scinceScoreline;

    private String artsScoreline;

    private String startDate;

    private String startTime;

    @Column(name="overDate",length = 20)
    private String overDate;

    @Column(name = "overTime", length = 30)
    private String overTime;

    //报考学校数量
    @Column(name = "schoolNum" )
    private int schoolNum;

    //专业数量
    private String preType;

    //专业限报
    private  String limitPre;

    //优惠分值
    private String dropScore;

    //选恻要求
    private String limitSubScore;

    //初审公示日期
    private String initialtrialDate;

    //报到时间
    private String checkinTime;

    //考试时间
    private String testTime;

    //资料寄送方式
    private String postType;

    //是否需要推荐信
    private String isRecommendationLetter;

    //考试形式
    private String testType;

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
    @Column(name = "book", length = 50)
    private String book;

    //科创比赛
    @Size(max = 50)
    @Column(name = "newScience", length = 50)
    private String newScience;

    @Size(max = 50)
    @Column(name = "innovationPotential", length = 50)
    private String innovationPotential;

    @Size(max = 50)
    @Column(name = "inventionPatent", length = 50)
    private String inventionPatent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(long schoolid) {
        this.schoolid = schoolid;
    }

    public String getScinceScoreline() {
        return scinceScoreline;
    }

    public void setScinceScoreline(String scinceScoreline) {
        this.scinceScoreline = scinceScoreline;
    }

    public String getArtsScoreline() {
        return artsScoreline;
    }

    public void setArtsScoreline(String artsScoreline) {
        this.artsScoreline = artsScoreline;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getOverDate() {
        return overDate;
    }

    public void setOverDate(String overDate) {
        this.overDate = overDate;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    public int getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(int schoolNum) {
        this.schoolNum = schoolNum;
    }

    public String getPreType() {
        return preType;
    }

    public void setPreType(String preType) {
        this.preType = preType;
    }

    public String getLimitPre() {
        return limitPre;
    }

    public void setLimitPre(String limitPre) {
        this.limitPre = limitPre;
    }

    public String getDropScore() {
        return dropScore;
    }

    public void setDropScore(String dropScore) {
        this.dropScore = dropScore;
    }

    public String getLimitSubScore() {
        return limitSubScore;
    }

    public void setLimitSubScore(String limitSubScore) {
        this.limitSubScore = limitSubScore;
    }

    public String getInitialtrialDate() {
        return initialtrialDate;
    }

    public void setInitialtrialDate(String initialtrialDate) {
        this.initialtrialDate = initialtrialDate;
    }

    public String getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getIsRecommendationLetter() {
        return isRecommendationLetter;
    }

    public void setIsRecommendationLetter(String isRecommendationLetter) {
        this.isRecommendationLetter = isRecommendationLetter;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
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

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getNewScience() {
        return newScience;
    }

    public void setNewScience(String newScience) {
        this.newScience = newScience;
    }

    public String getInnovationPotential() {
        return innovationPotential;
    }

    public void setInnovationPotential(String innovationPotential) {
        this.innovationPotential = innovationPotential;
    }

    public String getInventionPatent() {
        return inventionPatent;
    }

    public void setInventionPatent(String inventionPatent) {
        this.inventionPatent = inventionPatent;
    }
}
