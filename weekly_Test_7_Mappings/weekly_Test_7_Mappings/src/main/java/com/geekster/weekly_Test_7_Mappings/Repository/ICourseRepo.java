package com.geekster.weekly_Test_7_Mappings.Repository;


import com.geekster.weekly_Test_7_Mappings.Model.Address;
import com.geekster.weekly_Test_7_Mappings.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course, Long> {
}
