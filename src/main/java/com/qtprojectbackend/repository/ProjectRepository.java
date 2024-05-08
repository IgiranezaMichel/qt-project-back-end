package com.qtprojectbackend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qtprojectbackend.modal.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project,UUID>{

}
