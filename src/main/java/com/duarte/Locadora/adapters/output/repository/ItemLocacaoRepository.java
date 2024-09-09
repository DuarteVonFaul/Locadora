package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.ItemLocacao;
import com.duarte.Locadora.core.domain.repository.IItemLocacaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class ItemLocacaoRepository implements IItemLocacaoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void salvar(ItemLocacao itemLocacao) {
        entityManager.persist(itemLocacao);
    }
}
