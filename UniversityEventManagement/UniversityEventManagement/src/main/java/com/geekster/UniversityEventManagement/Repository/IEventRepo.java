package com.geekster.UniversityEventManagement.Repository;


import com.geekster.UniversityEventManagement.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEventRepo extends JpaRepository<Event, Long> {

    List<Event> findByDate(String localDate);
}
