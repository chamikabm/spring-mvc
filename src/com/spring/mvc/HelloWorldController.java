package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}