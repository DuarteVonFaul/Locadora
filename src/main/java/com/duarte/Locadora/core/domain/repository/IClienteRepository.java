package com.duarte.Locadora.core.domain.repository;

import com.duarte.Locadora.core.domain.entity.Cliente;

public interface IClienteRepository {
    Cliente buscarPorId(Integer id);
}
