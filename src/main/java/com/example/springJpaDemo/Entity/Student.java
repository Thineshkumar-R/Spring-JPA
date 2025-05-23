package com.example.springJpaDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id

    private Long studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String gaurdianName;
    private String gaurdianEmail;
    private String gaurdianMobile;
}
