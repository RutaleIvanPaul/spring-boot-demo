package com.example.demo.service.impl;

import com.example.demo.models.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    List<Student> studentList = buildStudents();

    @Override
    public Student getByNumber(String studentNumber) {
        return studentList.stream().filter(student -> studentNumber
                .equals(student.getStudentNumber()))
                .findAny().orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public List<Student> addStudent(Student student) {
        studentList.add(student);
        return studentList;
    }

    @Override
    public Student updateStudent(String studentNumber, Student student) {
        return getByNumber(studentNumber).update(student);
    }

    @Override
    public List<Student> deleteStudent(String studentNumber) {
        return null;
    }

    private List<Student> buildStudents(){
        List<Student> studentList = new ArrayList<>();

        for(int x= 1; x<=5;x++){
            Student student = new Student(x+"","Ivan"+ x,"5",20 +x );
            studentList.add(student);
        }
        return studentList;
    }

}
