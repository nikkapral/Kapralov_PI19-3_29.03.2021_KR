package com.example.kapralov.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "categories")
@Getter
@Setter
@ToString
public class Category extends BaseEntity {

    @Column(name = "name_")
    private String name;
