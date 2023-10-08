package com.geekster.weekly_Test_7_Mappings.Service;


import com.geekster.weekly_Test_7_Mappings.Model.Laptop;
import com.geekster.weekly_Test_7_Mappings.Model.Student;
import com.geekster.weekly_Test_7_Mappings.Repository.ILaptopRepo;
import com.geekster.weekly_Test_7_Mappings.Repository.IStudentRepo;
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

    public String changeTitleByStudentId(Long studentId, String phoneNo) {
        Optional<Student> student = iStudentRepo.findById(studentId);
        Student newStudent = null;
        if(student.isPresent()){
            newStudent = student.get();
        }
        else{
            return "Student not found!!";
        }
        newStudent.setPhoneNumber(phoneNo);
        iStudentRepo.save(newStudent);
        return "PhoneNo has been changed!!";
    }

    public String deleteStudentByStudentId(Long studentId) {
        iStudentRepo.deleteById(studentId);
        return "Student has been deleted!";
    }
}
