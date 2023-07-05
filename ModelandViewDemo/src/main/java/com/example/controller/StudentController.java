package com.example.controller;

import com.example.demo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/view")
    public ModelAndView getStudents()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<Student> students = Arrays.asList(new Student(1,"Rohit"),new Student(2,"Rahul"));
        modelAndView.addObject("students",students);
        modelAndView.setViewName("list");
        return modelAndView;

    }
}
