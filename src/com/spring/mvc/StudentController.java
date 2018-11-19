package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

    @RequestMapping("showForm")
    public String submitStudentForm(Model model) {

        /*
        *  We should create a Student model before we load the form as we are using Spring MVC notation inside the form.
        */
        Student theStudent = new Student();
        model.addAttribute("student", theStudent);

        return "student-form";
    }

    @RequestMapping("processForm")
    public String processStudentForm(@ModelAttribute Student student) {

        return "student-conformation";
    }
}
