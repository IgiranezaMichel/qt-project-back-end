package com.qtprojectbackend.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qtprojectbackend.input.TaskInput;
import com.qtprojectbackend.modal.Project;
import com.qtprojectbackend.modal.Task;
import com.qtprojectbackend.repository.TaskRepository;
@Service
public class TaskService {
@Autowired private TaskRepository taskRepository;
@Autowired private ProjectService projectService;
public String saveTask(TaskInput task){
   try {
    Project project=projectService.findByProjectById(task.getProjectId());
    return taskRepository.save(new Task(task.getId(), task.getTitle(), task.getStartDate(), task.getEndDate(), task.getAssignees(), project, task.getDescription(), task.getTaskPriority(), null)).getTitle()+" saved successful";
   } catch (Exception e) {
    return "Project not found";
   }
}
public String deleteTask(UUID taskId){
    try {
        Task project=this.findByTaskId(taskId);
        taskRepository.delete(project);
        return project.getTitle()+" removed successful";
    } catch (Exception e) {
        return "Task not found";
    }
}
public Task findByTaskId(UUID id){
    return taskRepository.findById(id).orElseThrow();
}
public List<Task> getAllTask(){
    return taskRepository.findAll();
}
}
