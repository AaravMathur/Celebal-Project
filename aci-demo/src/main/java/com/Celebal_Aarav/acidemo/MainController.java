package com.Celebal_Aarav.acidemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String redirectToIndex() {
        return "redirect:/index.html";
    }
}

