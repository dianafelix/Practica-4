package com.uabc.edu.mx.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name= "contact")
public class Contact {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "version")
    private Date version;

    @ManyToOne
    @JoinColumn(name = "companyId")
    private Company company;

    @OneToMany(mappedBy = "contact")
    private List<ContactDetail> contactDetailList;

    private Contact(int id, String firstName, String lastName, String telephone, String email, Date version, Company company){
        this.id = id;
        this.firstName= firstName;
        this.lastName=lastName;
        this.telephone = telephone;
        this.email= email;
        this.version = version;
        this.company = company;
    }

}
