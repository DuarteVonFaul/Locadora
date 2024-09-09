package com.duarte.Locadora.core.port;

import com.duarte.Locadora.core.domain.entity.Jogo;

public interface IJogoPort {
    Jogo buscarPorId(Integer id);
}