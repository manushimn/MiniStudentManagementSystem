package com.test.spring.minispringproj.dao;

import com.test.spring.minispringproj.entity.Student;

import java.util.Collection;
import java.util.Map;

public interface StudentDao {

    Collection<Student> getAllStudents();

    Student getStudent(int id);

    Student deleteStudentById(int id);

    Student updateStudentById(int id, Student student);

    Student createStudent(Student student);
}
