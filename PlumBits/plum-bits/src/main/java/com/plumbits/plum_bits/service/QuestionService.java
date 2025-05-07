package com.plumbits.plum_bits.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plumbits.plum_bits.model.Question;
import com.plumbits.plum_bits.repository.QuestionRepository;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getQuestionsByModeAndDomain(String mode, String domain) {
        List<Question> questions = questionRepository.findByModeAndDomain(mode, domain);
        Collections.shuffle(questions); // Optional: to randomize the question order
        return questions;
    }

    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    // Add more methods as needed (e.g., delete, update)
}
