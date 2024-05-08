package com.qtprojectbackend.modal;

import java.util.UUID;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.annotations.UuidGenerator.Style;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AccountHolder {
@Id @UuidGenerator(style = Style.AUTO)
private UUID id;
private String name;
private String phoneNumber;
@Column(unique = true)
private String email;
private String password;

}
