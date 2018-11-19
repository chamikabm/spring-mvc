package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // Need a controller method to show the initial form.
    @RequestMapping("/showForm")
    public String showFrom() {
        return "helloworld-form";
    }

    // Need a controller method to process the form.
    @RequestMapping("processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        String studentName = request.getParameter("studentName");
        model.addAttribute("message", "Yo! " + studentName.toUpperCase());

        return "helloworld";
    }
}
