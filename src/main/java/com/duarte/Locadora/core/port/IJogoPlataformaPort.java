package com.duarte.Locadora.core.port;

import com.duarte.Locadora.core.domain.entity.ChavesCompostas.JogoPlataformaId;
import com.duarte.Locadora.core.domain.entity.Jogo;
import com.duarte.Locadora.core.domain.entity.JogoPlataforma;
import com.duarte.Locadora.core.domain.entity.Plataforma;

public interface IJogoPlataformaPort {
    JogoPlataforma buscar(Integer id_jogo, Integer id_plataforma);
    JogoPlataforma buscarById(Integer id);
}
