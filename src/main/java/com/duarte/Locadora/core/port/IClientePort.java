package com.duarte.Locadora.core.port;

import com.duarte.Locadora.core.domain.entity.Cliente;
import org.springframework.stereotype.Component;


public interface IClientePort {
    Cliente buscarPorId(Integer id);
}
