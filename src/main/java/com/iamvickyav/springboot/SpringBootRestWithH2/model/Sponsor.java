// Sponsor.java
package com.iamvickyav.springboot.SpringBootRestWithH2.model;

import javax.persistence.*;

@Entity
@Table(name = "sponsors")
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    // getters and setters
}