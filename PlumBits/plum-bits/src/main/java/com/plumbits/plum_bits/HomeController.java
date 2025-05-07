package com.plumbits.plum_bits;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // Looks for templates/home.html
    }

    @GetMapping("/norm")
    public String norm() {
        return "norm"; // Looks for templates/norm.html
    }

    @GetMapping("/norm/science")
    public String scienceQuiz() {
        return "norm/science"; // Looks for templates/norm/science.html
    }

    // Add more mappings as needed for other quiz pages
}
