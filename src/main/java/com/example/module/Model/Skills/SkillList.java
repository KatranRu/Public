package com.example.module.Model.Skills;

import com.example.module.Model.User;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


import javax.persistence.*;

@Data
@Entity
public class SkillList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(insertable = false, updatable = false)
    private Long id;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "id", updatable = false, insertable = false)
    private Long idUser;
    @ManyToOne(targetEntity = Skill.class)
    @Cascade({CascadeType.ALL})
    @JoinColumn(name = "id", updatable = false, insertable = false)
    private Long idSkill;
    private Long value;
}
