package com.duarte.Locadora.core.domain.repository;

import com.duarte.Locadora.core.domain.entity.Jogo;
import com.duarte.Locadora.core.domain.entity.JogoPlataforma;
import com.duarte.Locadora.core.domain.entity.Plataforma;

public interface IJogoPlataformaRepository {
    JogoPlataforma buscar(Jogo jogo, Plataforma plataforma);
}
