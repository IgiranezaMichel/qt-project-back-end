package com.qtprojectbackend.modal;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {
@Id @UuidGenerator(style = Style.AUTO)
private UUID id;
private String name;
@OneToMany(mappedBy = "project",cascade = CascadeType.ALL,targetEntity = Task.class)
private List<Task>taskList;
}
