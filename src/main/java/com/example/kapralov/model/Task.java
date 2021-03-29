package com.example.kapralov.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tasks")
@Getter
@Setter
@ToString
public class Task extends BaseEntity {

    @Column(name = "name_")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "date_of_resolution")
    private String dateOfResolution;

    @Column(name = "condition_")
    private Boolean condition;

    @Column(name = "type")
    private String type;

    @Column(name = "user")
    private String user;