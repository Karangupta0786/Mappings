package com.example.Mapping.Learning.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "book_table")
public class Book {

    @Id
    private Integer id;

    @Column(name = "book_name")
    private String name;

}
