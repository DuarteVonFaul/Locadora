package com.duarte.Locadora.core.port;

import com.duarte.Locadora.core.domain.entity.Plataforma;

public interface IPlataformaPort {
    Plataforma buscarPorId(Integer id);
}
