package com.test.spring.minispringproj.service;

import com.test.spring.minispringproj.dao.StudentDao;
import com.test.spring.minispringproj.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    @Override
    public Student deleteStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public Student updateStudentById(int id, Student student) {
        return studentDao.updateStudentById(id, student);
    }

    @Override
    public Student createStudent(Student student) {
        return studentDao.createStudent(student);
    }
}
