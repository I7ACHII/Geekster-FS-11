package com.geekster.UniversityEventManagement.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Event")
public class Event {

    @Id
    private Long eventId;

    private String eventName;


    private String locationOfEvent;


    private String date;
    private String startTime;
    private String endTime;


}
