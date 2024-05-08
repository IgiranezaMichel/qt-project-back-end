package com.qtprojectbackend.services;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qtprojectbackend.modal.Project;
import com.qtprojectbackend.repository.ProjectRepository;

@Service
public class ProjectService {
@Autowired private ProjectRepository projectRepository;
public String saveProject(Project project){
    return projectRepository.save(project).getName()+" saved successful";
}
public String deleteProject(UUID projectId){
    try {
        Project project=this.findByProjectById(projectId);
        projectRepository.delete(project);
        return project.getName()+" removed successful";
    } catch (Exception e) {
        return "Project not found";
    }
}
public Project findByProjectById(UUID id){
    return projectRepository.findById(id).orElseThrow();
}
public List<Project> getAllProject(){
    return projectRepository.findAll();
}
}
