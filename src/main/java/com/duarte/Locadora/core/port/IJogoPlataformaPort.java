package com.duarte.Locadora.core.port;

import com.duarte.Locadora.core.domain.entity.Jogo;
import com.duarte.Locadora.core.domain.entity.JogoPlataforma;
import com.duarte.Locadora.core.domain.entity.Plataforma;

public interface IJogoPlataformaPort {
    JogoPlataforma buscar(Jogo jogo, Plataforma plataforma);
}
