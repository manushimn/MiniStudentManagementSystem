package com.test.spring.minispringproj.service;

import com.test.spring.minispringproj.entity.Student;

import java.util.Collection;

public interface StudentService {
    Collection<Student> getAllStudents();

    Student getStudent(int id);

    Student deleteStudentById(int id);

    Student updateStudentById(int id, Student student);

    Student createStudent(Student student);
}
