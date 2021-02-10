package com.java.microservices.demo.controller;


import com.java.microservices.demo.model.Student;
import com.java.microservices.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @Autowired
    StudentService studentService;
    // call this from service-http-url

    @RequestMapping(value= "/hello", method=RequestMethod.GET)
    public String greeting() {
        return "Hello Springboot from GET";
    }
    @RequestMapping(value= "/hello", method=RequestMethod.POST)
    public String greeting2() {
        return "Hello Springboot from POST";
    }
    @RequestMapping(value="/student",method=RequestMethod.POST)
    public Student save(@RequestBody Student student){
    return studentService.save(student);
    }
}
