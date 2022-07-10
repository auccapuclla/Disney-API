package com.alkemy.movies.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "characters")
@Getter
@Setter
public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Integer age;

    private Long weight;

    private String story;

    // Associate movies
    @ManyToMany(mappedBy = "characters", cascade = CascadeType.ALL)
    private List<MoviesEntity> movies = new ArrayList<>();
}
