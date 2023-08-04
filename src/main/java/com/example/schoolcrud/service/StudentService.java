package com.example.schoolcrud.service;

import com.example.schoolcrud.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();
    Student getStudent(int studentId);
    Student addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(int studentId);
    //void deleteAllStudent();

}
