package com.java.microservices.demo.repository;
import com.java.microservices.demo.model.Student;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends Repository<Student,Integer>{

    Student save(Student student);
}
