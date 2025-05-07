package com.plumbits.plum_bits.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plumbits.plum_bits.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    // Custom method to find questions by domain
    List<Question> findByModeAndDomain(String mode, String domain);
    ;
}
