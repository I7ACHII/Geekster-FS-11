package com.geekster.weekly_Test_7_Mappings.Controller;


import com.geekster.weekly_Test_7_Mappings.Model.Book;
import com.geekster.weekly_Test_7_Mappings.Model.Course;
import com.geekster.weekly_Test_7_Mappings.Service.BookService;
import com.geekster.weekly_Test_7_Mappings.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;


    @PostMapping("course")
    public String addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping("courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PutMapping("course/title/{courseId}/{title}")
    public String changeTitleByCourseId(@PathVariable Long courseId, @PathVariable String title) {
        return courseService.changeTitleByCourseId(courseId, title);
    }

    @DeleteMapping("course/{courseId}")
    public String deleteCourseByCourseId(@PathVariable Long courseId) {
        return courseService.deleteCourseByCourseId(courseId );
    }
}
