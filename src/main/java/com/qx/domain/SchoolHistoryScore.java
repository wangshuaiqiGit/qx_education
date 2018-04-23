package com.qx.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    //


}
