package com.uabc.edu.mx.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "companyStatus")
public class CompanyStatus {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "companyStatus")
    private List<Company> companyList;

    private CompanyStatus(int id, String name){
        this.id = id;
        this.name = name;
    }
}