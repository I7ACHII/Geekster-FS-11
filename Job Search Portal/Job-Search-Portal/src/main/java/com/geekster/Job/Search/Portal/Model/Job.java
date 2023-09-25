package com.geekster.Job.Search.Portal.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;
    private String companyEmail;
    private String companyName;
    private String employerName;
    private JobType jobType;
    private LocalDate appliedDate;

}
