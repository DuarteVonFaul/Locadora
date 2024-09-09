package com.duarte.Locadora.core.domain.repository;

import com.duarte.Locadora.core.domain.entity.Jogo;

public interface IJogoRepository {
    Jogo buscarPorId(Integer id);
}