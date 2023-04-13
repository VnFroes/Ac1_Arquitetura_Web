package com.example.ac1.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (length  = 150, nullable = false)
    private String nome;
    private int cpf;
    private String endereco;
    private int celular;
    private int rg;    

    @ManyToMany(mappedBy = "professor")
    List<Professor> professores;

    @OneToMany(mappedBy = "professor")
    List<Agenda> agenda;
}
