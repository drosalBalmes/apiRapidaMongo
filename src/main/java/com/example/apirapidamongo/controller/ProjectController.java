package com.example.apirapidamongo.controller;

import com.example.apirapidamongo.entities.Project;
import com.example.apirapidamongo.repositories.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("api")
public class ProjectController {

    @GetMapping("random")
    public String helloWorld(){
        return "<h1>Hello World! hay " + (new Random(300).nextInt()*(-1)) + " Victors Mongolos</h1>";
    }

    @GetMapping("project")
    public Project projecte(){
        return new Project("David","Perfe");
    }

    @Autowired
    ProjectDAO repPro;

    @GetMapping("projectes")
    public String projectes(Model model){

        model.addAttribute("projectes", repPro.findAll());

        return "projectes/llista-projectes.html";
    }

}