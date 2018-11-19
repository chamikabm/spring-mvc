package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class NewHelloWorldController {

    // Need a controller method to show the initial form.
    @RequestMapping("/showForm")
    public String showFrom() {
        return "helloworld-form-v2";
    }

    @RequestMapping("/processFormV2")
    public String letsShoutDude(@RequestParam String studentName, Model model) {

        model.addAttribute("message", "Yo! " + studentName.toUpperCase());
        return "helloworld";
    }
}
