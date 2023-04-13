package com.example.ac1.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class agenda {
    @Id
    @GeneratedValue(Strategy = GenerationType.INDETITY)
    private Long id;
    @Column(lenght = 150, nullable = false)
    private String nome;
    private double cargaHoraria;
    private String cidade;
    private String uf;

    
}
