package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.Plataforma;
import com.duarte.Locadora.core.domain.repository.IPlataformaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class PlataformaRepository implements IPlataformaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Plataforma buscarPorId(Integer id) {
        return entityManager.find(Plataforma.class, id);
    }
}
