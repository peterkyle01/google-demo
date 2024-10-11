package com.peterkyle01.googledemo.controller;

import com.peterkyle01.googledemo.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    // Variable with 10 students
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("Peter", 25));
        students.add(new Student("John", 30));
        students.add(new Student("Mary", 20));
        students.add(new Student("Jane", 22));
        students.add(new Student("Bob", 28));
        students.add(new Student("Alice", 22));
        students.add(new Student("Tom", 25));
        students.add(new Student("Lucy", 22));
        students.add(new Student("Mike", 28));
        students.add(new Student("Sarah", 22));
    }

    @GetMapping("/")
    public String greeting() {
        return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }
}
