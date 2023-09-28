package com.geekster.UniversityEventManagement.Service;


import com.geekster.UniversityEventManagement.Model.Student;
import com.geekster.UniversityEventManagement.Model.deptType;
import com.geekster.UniversityEventManagement.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;
    public String addStudent(Student student) {
        iStudentRepo.save(student);
        return "Student has been added!!";
    }

    public List<Student> getAllStudents() {
        return iStudentRepo.findAll();
    }

    public Optional<Student> getStudentById(Long studentId) {
        return iStudentRepo.findById(studentId);
    }

    public String updateStudentDepartment(Long studentId, deptType dept) {
        Optional<Student> student = iStudentRepo.findById(studentId);
        Student myStudent = null;
        if(student.isPresent()){
            myStudent = student.get();
        }
        else{
            return "Id not found!!";
        }
        myStudent.setDepartment(dept);
        iStudentRepo.save(myStudent);
        return "department has been updated!!";
    }

    public String deleteStudent(Long studentId) {
        iStudentRepo.deleteById(studentId);
        return "student has been deleted!!";
    }
}
