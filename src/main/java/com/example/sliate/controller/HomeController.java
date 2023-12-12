package com.example.sliate.controller;

import com.example.sliate.model.Student;
import com.example.sliate.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/student")
public class HomeController {

    @Autowired
    StudentRepository studentRepository;

    List<Student> students = new ArrayList<>();

    @PostMapping()
    public Student createStudent(@RequestBody Student student){
        studentRepository.saveAndFlush(student);
        System.out.println("Student " + student.getName() + " saved successfully!");
        return student;
    }

    @GetMapping()
    public List<Student> getAllStudents(){
        System.out.println("This is the GET method!");
        return students;
    }

    @DeleteMapping("/{id}")
    public List<Student> deleteStudents(@PathVariable int id){
        students.removeIf(student -> student.getId() == id);
        return students;
    }

    @PutMapping()
    public List<Student> updateStudent(@PathVariable Student student){
        System.out.println("Student updated!");
        return students;
    }












}
