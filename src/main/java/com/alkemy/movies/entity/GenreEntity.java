package com.alkemy.movies.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genres")
@Getter
@Setter
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String imagen;

    // Associate movies
    @ManyToMany(mappedBy = "genres", cascade = CascadeType.ALL)
    private List<MoviesEntity> movies = new ArrayList<>();
}
