package com.example.apirapidamongo.repositories;

import com.example.apirapidamongo.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDAO  extends JpaRepository<Project, Long> {

}
