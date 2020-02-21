package com.example.demo.service;

import com.example.demo.models.Student;

import java.util.List;

public interface StudentService {

    public Student getByNumber(String studentNumber);
    public List<Student> getAllStudents();
    public List<Student> addStudent(Student student);
    public Student updateStudent(String studentNumber, Student student);
    public List<Student> deleteStudent(String studentNumber);

}
