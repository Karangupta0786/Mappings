package com.example.Mapping.Learning.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_table")
public class Student {

    @Id
    private Integer id;

    @Column(name = "student_name")
    private String name;

    @OneToMany
    @JoinColumn(name = "fk_student_id")
    private Set<Book> books;
}
