package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.Cliente;
import com.duarte.Locadora.core.domain.repository.IClienteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class ClienteRepository implements IClienteRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Cliente buscarPorId(Integer id) {
        return entityManager.find(Cliente.class, id);
    }
}
