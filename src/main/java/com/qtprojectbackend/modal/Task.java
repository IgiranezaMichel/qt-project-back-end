package com.qtprojectbackend.modal;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;

import com.qtprojectbackend.enums.TaskPriority;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
@Id @UuidGenerator(style = Style.AUTO)
private UUID id;
private String title;
private LocalDate startDate;
private LocalDate endDate;
private String assignees;
@ManyToOne(cascade = CascadeType.ALL,targetEntity = Project.class)
private Project project;
private String description;
@Enumerated(EnumType.STRING)
private TaskPriority taskPriority;
@Lob
private byte[] attachment;
public String getAttachment(){
    return "";
}
} 
