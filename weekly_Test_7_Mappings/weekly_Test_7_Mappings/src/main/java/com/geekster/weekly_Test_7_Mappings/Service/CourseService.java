package com.geekster.weekly_Test_7_Mappings.Service;

import com.geekster.weekly_Test_7_Mappings.Model.Book;
import com.geekster.weekly_Test_7_Mappings.Model.Course;
import com.geekster.weekly_Test_7_Mappings.Repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CourseService {

    @Autowired
    ICourseRepo iCourseRepo;
    public String addCourse(Course course) {
        iCourseRepo.save(course);
        return "Course has been added!!";
    }

    public List<Course> getAllCourses() {
        return iCourseRepo.findAll();
    }

    public String changeTitleByCourseId(Long courseId, String title) {
        Optional<Course> course = iCourseRepo.findById(courseId);
        Course newCourse = null;
        if(course.isPresent()){
            newCourse = course.get();
        }
        else{
            return "Course not found!!";
        }
        newCourse.setCourseTitle(title);
        iCourseRepo.save(newCourse);
        return "Title has been changed!!";
    }

    public String deleteCourseByCourseId(Long courseId) {
        iCourseRepo.deleteById(courseId);
        return "Course has been deleted!";
    }
}
