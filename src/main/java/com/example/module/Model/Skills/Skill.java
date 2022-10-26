package com.example.module.Model.Skills;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
}
