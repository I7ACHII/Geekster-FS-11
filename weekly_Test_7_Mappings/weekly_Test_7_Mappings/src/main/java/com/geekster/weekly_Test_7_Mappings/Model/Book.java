package com.geekster.weekly_Test_7_Mappings.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String bookTitle;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;
}
