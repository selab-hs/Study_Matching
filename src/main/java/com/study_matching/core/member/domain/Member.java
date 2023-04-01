package com.study_matching.core.member.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue()
    private Long id;

    private String name;

    private String position;

    private String image;

    private String birth;

    private String description;
}
