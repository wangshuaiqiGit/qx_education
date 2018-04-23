package com.qx.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "choose_subject")
public class Choosesubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Column(name = "subName", length = 50)
    private String subName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
