package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/student/{studentNumber}")
    public ResponseEntity<?> getStudent(@PathVariable(name = "studentNumber") String studentNumber){
        Student student  = studentService.getByNumber(studentNumber);
        if(student == null){
            return new ResponseEntity("Student Not Found!",HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(student);
    }

    @GetMapping(value = "/students")
    public ResponseEntity<?> getAllStudents(){
        List<Student> students  = studentService.getAllStudents();
        if(students == null){
            return new ResponseEntity("Students Not Found!",HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(students);
    }

    @PostMapping(value = "/addStudent")
    public ResponseEntity<?> addStudent(@RequestBody Map<String,String > body){
        Student newStudent = new Student(
                body.get("studentNumber"),
                body.get("name"),
                body.get("grade"),
                Integer.parseInt(body.get("age")));
        List<Student> students  = studentService.addStudent(newStudent);
        if(students == null){
            return new ResponseEntity("Students Not Found!",HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(students);
    }

    @PutMapping(value = "/updateStudent/{studentNumber}")
    public ResponseEntity<?> updateStudent(@PathVariable(name = "studentNumber") String studentNumber,@RequestBody Map<String,String > body){
        Student newStudent = new Student(
                body.get("studentNumber"),
                body.get("name"),
                body.get("grade"),
                Integer.parseInt(body.get("age")));
        Student student  = studentService.updateStudent(studentNumber,newStudent);
        if(student == null){
            return new ResponseEntity("Students Not Found!",HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(student);
    }

}
