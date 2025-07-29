package com.example.thymeleafproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thymeleafproject.entity.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
    List<Tutorial> findByTitleContainingIgnoreCase(String keyword);
}
