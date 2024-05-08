package com.qtprojectbackend.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.qtprojectbackend.modal.Project;
import com.qtprojectbackend.services.ProjectService;

@Controller
public class ProjectController {
@Autowired private ProjectService projectService;
@MutationMapping
public String createProject(@Argument(name = "projectInput")Project project){
    return projectService.saveProject(project);
}
@MutationMapping
public String deleteProject(@Argument(name = "id")UUID id){
    return projectService.deleteProject(id);
}
@QueryMapping
public List<Project> getAllProject(){
    return projectService.getAllProject();
}
}
