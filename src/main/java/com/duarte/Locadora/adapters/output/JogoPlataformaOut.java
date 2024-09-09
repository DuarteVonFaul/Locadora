package com.duarte.Locadora.adapters.output;

import com.duarte.Locadora.core.domain.entity.Jogo;
import com.duarte.Locadora.core.domain.entity.JogoPlataforma;
import com.duarte.Locadora.core.domain.entity.Plataforma;
import com.duarte.Locadora.core.port.IJogoPlataformaPort;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class JogoPlataformaOut implements IJogoPlataformaPort {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public JogoPlataforma buscar(Jogo jogo, Plataforma plataforma) {
        String jpql = "SELECT jp.jogo FROM JogoPlataforma jp WHERE jp.jogo.id = :jogoId AND jp.plataforma.id = :plataformaId";
        TypedQuery<JogoPlataforma> query = entityManager.createQuery(jpql, JogoPlataforma.class);
        query.setParameter("jogoId", jogo.getId());
        query.setParameter("plataformaId", plataforma.getId());
        return query.getResultStream().findFirst().orElse(null);
    }
}
