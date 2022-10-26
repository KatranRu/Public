package com.example.module.Model;

import com.example.module.Model.Enums.SRole;
import com.example.module.Model.Skills.SkillList;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nickName;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(length = 3000)
    private String password;
    @ElementCollection(targetClass = SRole.class)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    private Set<SRole> roles;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    @Cascade({CascadeType.ALL})
    private Set<SkillList> userSkillList;

}
