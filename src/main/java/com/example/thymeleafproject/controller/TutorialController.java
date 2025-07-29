package com.example.thymeleafproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thymeleafproject.entity.Tutorial;
import com.example.thymeleafproject.repository.TutorialRepository;

@Controller
@RequestMapping("/tutorials")
public class TutorialController {

    @Autowired
    private TutorialRepository tutorialRepository;

    @GetMapping
    public String listTutorials(Model model, @RequestParam(required = false) String keyword) {
        List<Tutorial> tutorials;
        if (keyword != null && !keyword.isEmpty()) {
            tutorials = tutorialRepository.findByTitleContainingIgnoreCase(keyword);
            model.addAttribute("keyword", keyword);
        } else {
            tutorials = tutorialRepository.findAll();
        }
        model.addAttribute("tutorials", tutorials);
        return "tutorials";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        model.addAttribute("tutorial", new Tutorial());
        model.addAttribute("pageTitle", "Add New Tutorial");
        return "tutorial_form";
    }

    @PostMapping("/save")
    public String saveTutorial(@ModelAttribute("tutorial") Tutorial tutorial) {
        tutorialRepository.save(tutorial);
        return "redirect:/tutorials";
    }

    @GetMapping("/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model) {
        Tutorial tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid tutorial Id:" + id));
        model.addAttribute("tutorial", tutorial);
        model.addAttribute("pageTitle", "Edit Tutorial (ID: " + id + ")");
        return "tutorial_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteTutorial(@PathVariable("id") Integer id) {
        tutorialRepository.deleteById(id);
        return "redirect:/tutorials";
    }

    @GetMapping("/{id}/published/{status}")
    public String updatePublishedStatus(@PathVariable("id") Integer id, @PathVariable("status") boolean status) {
        Tutorial tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid tutorial Id:" + id));
        tutorial.setPublished(status);
        tutorialRepository.save(tutorial);
        return "redirect:/tutorials";
    }
}
