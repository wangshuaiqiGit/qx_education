package com.qx.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.soap.SAAJResult;

@Entity
public class ShoolHistoryInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="year", length = 20)
    private String year;

    @NotNull
    @Column(name = "schoolId")
    private long schoolid;

    private String startDate;

    private String startTime;

    @Column(name="overDate",length = 20)
    private String overDate;

    @Column(name = "overTime", length = 30)
    private String overTime;

    //报名类型限制
    @Column(name = "resType" ,length = 20)
    private String resType;

    //报考学校数量
    @Column(name = "schoolNum" )
    private int schoolNum;

    //专业数量
    private String preType;

    //专业限报
    private  String limitPre;

    //每个专业限报
    private  String eachPreLimit;

    //专业是否可调剂
    private  String isAdjustPre;

    //是否需要自荐信
    private String isCoverLetter;

    //是否固定格式
    private String isFixedFormat;

    //是否需要上传手写稿
    private String isUploadManuscript;

    //是否需要推荐信
    private String isRecommendationLetter;

    //是否需要学校盖章签字
    private String isSchoolSeal;

    //是否需要学生本人签名
    private String isStuSeal;

    //其他材料是否需要学校盖章
    private String isOtherSchSeal;

    //其他材料是否需要个人签名
    private String isOtherStuSeal;

    //材料是否需要邮寄
    private String isNeedMail;

    public long getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(long schoolid) {
        this.schoolid = schoolid;
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

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
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

    public String getEachPreLimit() {
        return eachPreLimit;
    }

    public void setEachPreLimit(String eachPreLimit) {
        this.eachPreLimit = eachPreLimit;
    }

    public String getIsAdjustPre() {
        return isAdjustPre;
    }

    public void setIsAdjustPre(String isAdjustPre) {
        this.isAdjustPre = isAdjustPre;
    }

    public String getIsCoverLetter() {
        return isCoverLetter;
    }

    public void setIsCoverLetter(String isCoverLetter) {
        this.isCoverLetter = isCoverLetter;
    }

    public String getIsFixedFormat() {
        return isFixedFormat;
    }

    public void setIsFixedFormat(String isFixedFormat) {
        this.isFixedFormat = isFixedFormat;
    }

    public String getIsUploadManuscript() {
        return isUploadManuscript;
    }

    public void setIsUploadManuscript(String isUploadManuscript) {
        this.isUploadManuscript = isUploadManuscript;
    }

    public String getIsRecommendationLetter() {
        return isRecommendationLetter;
    }

    public void setIsRecommendationLetter(String isRecommendationLetter) {
        this.isRecommendationLetter = isRecommendationLetter;
    }

    public String getIsSchoolSeal() {
        return isSchoolSeal;
    }

    public void setIsSchoolSeal(String isSchoolSeal) {
        this.isSchoolSeal = isSchoolSeal;
    }

    public String getIsStuSeal() {
        return isStuSeal;
    }

    public void setIsStuSeal(String isStuSeal) {
        this.isStuSeal = isStuSeal;
    }

    public String getIsOtherSchSeal() {
        return isOtherSchSeal;
    }

    public void setIsOtherSchSeal(String isOtherSchSeal) {
        this.isOtherSchSeal = isOtherSchSeal;
    }

    public String getIsOtherStuSeal() {
        return isOtherStuSeal;
    }

    public void setIsOtherStuSeal(String isOtherStuSeal) {
        this.isOtherStuSeal = isOtherStuSeal;
    }

    public String getIsNeedMail() {
        return isNeedMail;
    }

    public void setIsNeedMail(String isNeedMail) {
        this.isNeedMail = isNeedMail;
    }

    public String getOtherNeed() {
        return otherNeed;
    }

    public void setOtherNeed(String otherNeed) {
        this.otherNeed = otherNeed;
    }

    //其他需求
    private String otherNeed;



}
