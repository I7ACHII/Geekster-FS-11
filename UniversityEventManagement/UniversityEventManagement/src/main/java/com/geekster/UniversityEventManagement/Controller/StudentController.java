package com.geekster.UniversityEventManagement.Controller;

import com.geekster.UniversityEventManagement.Model.Student;
import com.geekster.UniversityEventManagement.Model.deptType;
import com.geekster.UniversityEventManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("student/id/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }

    @PutMapping("studentDepartment/id/{studentId}/department/{dept}")
    public String updateStudentDepartment(@PathVariable Long studentId, @PathVariable deptType dept){
        return studentService.updateStudentDepartment(studentId, dept);
    }

    @DeleteMapping("student/id/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        return studentService.deleteStudent(studentId);
    }



}
