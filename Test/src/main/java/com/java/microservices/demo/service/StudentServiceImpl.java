package com.java.microservices.demo.service;

import com.java.microservices.demo.model.Student;
import com.java.microservices.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
return studentRepository.save(student);
}


}

