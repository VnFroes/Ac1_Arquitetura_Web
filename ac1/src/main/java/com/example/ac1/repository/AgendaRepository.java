package com.example.ac1.repository;

import com.example.ac1.model.Agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class AgendaRepository {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public Agenda inserir(Agenda agenda) {
        return entityManager.merge(agenda);
    }
}
