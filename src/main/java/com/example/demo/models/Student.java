package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Student")
public class Student implements Serializable {

    @Id
    private String studentNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "grade")
    private String grade;

    @Column(name = "age")
    private int age;


    public Student() {}

    public Student(String studentNumber,String name, String grade, int age) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Number: "+studentNumber+" Name: "+name+" Grade: "+grade +" Age: "+age;
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
