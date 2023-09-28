package com.geekster.UniversityEventManagement.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student {

    @Id
    private Long studentId;
    private String firstName;
    private String lastName;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private deptType department;

}
