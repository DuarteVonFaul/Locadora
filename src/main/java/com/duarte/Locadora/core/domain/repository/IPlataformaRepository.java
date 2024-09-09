package com.duarte.Locadora.core.domain.repository;

import com.duarte.Locadora.core.domain.entity.Plataforma;

public interface IPlataformaRepository {
    Plataforma buscarPorId(Integer id);
}
