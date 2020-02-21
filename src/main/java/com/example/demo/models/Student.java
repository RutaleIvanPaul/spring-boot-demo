package com.example.demo.models;

import java.io.Serializable;

public class Student implements Serializable {

    private String studentNumber;
    private String name;
    private String grade;
    private int age;


    public Student() {}

    public Student(String studentNumber,String name, String grade, int age) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student update(Student newStudent){
        this.setStudentNumber(newStudent.studentNumber);
        this.setName(newStudent.name);
        this.setGrade(newStudent.grade);
        this.setAge(newStudent.age);

        return this;
    }


}
