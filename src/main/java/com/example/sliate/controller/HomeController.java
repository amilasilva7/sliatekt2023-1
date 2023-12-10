package com.example.sliate.controller;

import com.example.sliate.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/student")
public class HomeController {

    List<Student> students = new ArrayList<>();

    @PostMapping()
    public List<Student> createStudent(@RequestBody Student student){
        students.add(student);
        return students;
    }

    @GetMapping()
    public List<Student> getStudents(){
        System.out.println("This is the GET method!");
        return students;
    }

    @DeleteMapping("/{id}")
    public List<Student> deleteStudents(@PathVariable int id){
        students.removeIf(student -> student.getId() == id);
        return students;
    }












}
