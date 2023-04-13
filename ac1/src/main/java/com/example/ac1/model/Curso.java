package com.example.ac1.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length  = 150, nullable = false)
    private String descricao;
    private double cargaHoraria;
    private String objetivo;
    private String ementa;

    @ManyToMany
    @JoinTable(name= "curso_professor",joinColumns = @JoinColumn(name="curso_id"),inverseJoinColumns=@JoinColumn(name="professor_id"))
    List<Curso> cursos;
}