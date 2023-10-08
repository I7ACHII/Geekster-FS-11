package com.geekster.weekly_Test_7_Mappings.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address ;

    @ManyToMany
    @JoinTable(name = "fk_student_course_table",joinColumns = @JoinColumn(name = "fk_student_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_course_id"))
    private List<Course> Course;

    @OneToOne
    @JoinColumn(name = "fk_laptop_id")
    private Laptop laptop;
}
