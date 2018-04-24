package com.qx.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="highschool")
public class HighSchool {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(length = 50, name = "schoolName")
    private String schoolName;

    @NotNull
    @Column(length = 50, name = "province")
    private String province;

    @NotNull
    @Column(length = 50, name = "city")
    private String city;

    //所属大类  （985 211..）
    @NotNull
    @Column(length = 50, name = "bigType")
    private String bigType;

    //隶属
    @NotNull
    @Column(length = 50, name = "membership")
    private String membership;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBigType() {
        return bigType;
    }

    public void setBigType(String bigType) {
        this.bigType = bigType;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
}
