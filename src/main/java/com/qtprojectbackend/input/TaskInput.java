package com.qtprojectbackend.input;

import java.util.UUID;

import com.qtprojectbackend.modal.Task;

import lombok.Getter;
import lombok.Setter;

public class TaskInput extends Task{
   @Getter @Setter private UUID projectId;
   @Getter @Setter private String document;
}
