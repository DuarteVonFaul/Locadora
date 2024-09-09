package com.duarte.Locadora.adapters.output;

import com.duarte.Locadora.core.domain.entity.ChavesCompostas.JogoPlataformaId;
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
    public JogoPlataforma buscar(JogoPlataformaId id) {
        return null;
    }
}
