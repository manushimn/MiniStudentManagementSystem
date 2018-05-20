package com.test.spring.minispringproj.dao;

import com.test.spring.minispringproj.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "manushi", 10));
                put(2, new Student(2, "Hasanka", 28));
                put(3, new Student(3, "pasindu", 5));
                put(25, new Student(25, "testUser", 50));
            }
        };
    }


    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudent(int id) {
        return students.get(id);
    }

    @Override
    public Student deleteStudentById(int id) {
        return students.remove(id);
    }

    @Override
    public Student updateStudentById(int id, Student student) {
        return students.put(id, student);
    }

    @Override
    public Student createStudent(Student student) {
        return students.put(student.getId(), student);
    }


}
