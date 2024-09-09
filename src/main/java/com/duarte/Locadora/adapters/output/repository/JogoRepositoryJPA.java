package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.Jogo;
import com.duarte.Locadora.core.domain.repository.IJogoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class JogoRepositoryJPA implements IJogoRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Jogo buscarPorId(Integer id) {
        return entityManager.find(Jogo.class, id);
    }
}