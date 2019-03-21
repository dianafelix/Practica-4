package com.uabc.edu.mx.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="companyDetail")
public class CompanyDetail {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="employeeStrength")
    private int employeeStrength;

    @Column(name="notes")
    private String notes;

    private CompanyDetail( int id, int employeeStrength, String notes){
        this.id= id;
        this.employeeStrength=employeeStrength;
        this.notes=notes;

    }
}
