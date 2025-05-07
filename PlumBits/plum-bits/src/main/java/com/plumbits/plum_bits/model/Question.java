package com.plumbits.plum_bits.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mode;      // e.g., "norm"
    private String domain;    // e.g., "science"
    private String question;

    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    private String correctOption;  // e.g., "A", "B", "C", "D"

    // Constructors
    public Question() {
    }

    public Question(String mode, String domain, String question, String optionA, String optionB,
                    String optionC, String optionD, String correctOption) {
        this.mode = mode;
        this.domain = domain;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    // Getters and setters
    // (You can generate these automatically in your IDE)
}
