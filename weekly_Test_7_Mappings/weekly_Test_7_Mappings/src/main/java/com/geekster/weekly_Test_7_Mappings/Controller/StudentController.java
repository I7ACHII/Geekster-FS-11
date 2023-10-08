package com.geekster.weekly_Test_7_Mappings.Controller;

import com.geekster.weekly_Test_7_Mappings.Model.Course;
import com.geekster.weekly_Test_7_Mappings.Model.Student;
import com.geekster.weekly_Test_7_Mappings.Service.CourseService;
import com.geekster.weekly_Test_7_Mappings.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("student")
    public String addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("student")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("student/phoneNo/{studentId}/{phoneNo}")
    public String changeTitleByStudentId(@PathVariable Long studentId, @PathVariable String phoneNo) {
        return studentService.changeTitleByStudentId(studentId, phoneNo);
    }

    @DeleteMapping("student/{studentId}")
    public String deleteStudentByStudentId(@PathVariable Long studentId) {
        return studentService.deleteStudentByStudentId(studentId );
    }
}
