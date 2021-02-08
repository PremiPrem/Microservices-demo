package com.microservices.demo.service;

import com.microservices.demo.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int Id);
}

