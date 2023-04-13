package com.example.ac1.repository;

import java.util.List;

import com.example.ac1.model.Professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class ProfessorRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Professor inserir(Professor professor) {
        return entityManager.merge(professor);
    }

    @Transactional
    public Professor editar(Professor professor) {
        return entityManager.merge(professor);
    }

    @Transactional
    public void excluir(Professor professor) {
        entityManager.remove(professor);
    }

    public Professor obterPorId(long id) {
        return entityManager.find(Professor.class, id);
    }

    @Transactional
    public void excluir(long id) {
        entityManager.remove(obterPorId(id));
    }

    public List<Professor> obterTodos() {
        return entityManager.createQuery("from Professor", Professor.class).getResultList();
    }
}
