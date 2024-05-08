package com.qtprojectbackend.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.qtprojectbackend.input.TaskInput;
import com.qtprojectbackend.modal.Task;
import com.qtprojectbackend.services.TaskService;

@Controller
public class TaskController {
@Autowired private TaskService taskService;
@MutationMapping
public String createTask(@Argument(name = "taskInput")TaskInput task){
    return taskService.saveTask(task);
}
@MutationMapping
public String deleteTask(@Argument(name = "id")UUID id){
    return taskService.deleteTask(id);
}
@QueryMapping
public List<Task> getAllTask(){
    return taskService.getAllTask();
}
}
