package com.example.controller;

import com.example.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @RequestMapping("/showform")
    public String getForm()
    {
        return "studentform";
    }
    /*
    @RequestMapping(path = "/submitForm",method = RequestMethod.POST)
    public ModelAndView submitForm(@RequestParam("txtRoll") int roll , @RequestParam("txtName") String name)
    {
        Student student = new Student();
        student.setName(name);
        student.setRoll(roll);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student",student);
        modelAndView.setViewName("viewstudent");
        return modelAndView;
    }

     */
    @RequestMapping(path = "/submitForm",method = RequestMethod.POST)
    public ModelAndView submitForm(@ModelAttribute Student student)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student",student);
        modelAndView.setViewName("viewstudent");
        return modelAndView;
    }
}
