package com.example.ac1.repository;

import java.util.List;

import com.example.ac1.model.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CursoRepository {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Curso inserir(Curso curso) {
        return entityManager.merge(curso);
    }

    @Transactional
    public Curso editar(Curso curso) {
        return entityManager.merge(curso);
    }

    @Transactional
    public void excluir(Curso curso) {
        entityManager.remove(curso);
    }

    public Curso obterPorId(long id) {
        return entityManager.find(Curso.class, id);
    }

    @Transactional
    public void excluir(long id) {
        entityManager.remove(obterPorId(id));
    }

    public List<Curso> obterTodos() {
        return entityManager.createQuery("from Curso", Curso.class).getResultList();
    }
}
