package com.plumbits.plum_bits.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.plumbits.plum_bits.model.Question;
import com.plumbits.plum_bits.repository.QuestionRepository;

@Controller
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/norm/science") // The path that the user hits after clicking on Science
    public String scienceQuiz(Model model) {
        // Fetch questions from the database for the "science" domain
        List<Question> questions = questionRepository.findByModeAndDomain("norm", "science");
        
        // Randomizing questions order
        Random rand = new Random();
        for (int i = 0; i < questions.size(); i++) {
            int randomIndex = rand.nextInt(questions.size());
            Question temp = questions.get(i);
            questions.set(i, questions.get(randomIndex));
            questions.set(randomIndex, temp);
        }

        // Pass the questions to the "science.html" view
        model.addAttribute("questions", questions);

        return "norm/science"; // Returns the "norm/science.html" view
    }
}
