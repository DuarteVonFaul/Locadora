package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.Locacao;
import com.duarte.Locadora.core.domain.repository.ILocacaoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Optional;

public class LocacaoRepositoryJPA implements ILocacaoRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void salvar(Locacao locacao) {
        entityManager.persist(locacao);
    }

    @Override
    public void atualizar(Locacao locacao) {entityManager.merge(locacao);}

    @Override
    public Locacao buscarPorId(Integer id) {
        return entityManager.find(Locacao.class, id);
    }
}
