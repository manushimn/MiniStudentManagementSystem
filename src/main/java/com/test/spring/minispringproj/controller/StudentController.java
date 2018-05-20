package com.test.spring.minispringproj.controller;

import com.test.spring.minispringproj.entity.Student;
import com.test.spring.minispringproj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
    public Student deleteStudentById(@PathVariable("id") int id){
        return studentService.deleteStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/student/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student updateSudentById(@RequestBody Student student, @PathVariable("id") int id){
        return studentService.updateStudentById(id, student);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
