package com.duarte.Locadora.adapters.output;

import com.duarte.Locadora.adapters.output.repository.ClienteRepository;
import com.duarte.Locadora.core.domain.entity.Cliente;
import com.duarte.Locadora.core.port.IClientePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteOut implements IClientePort {

    @Autowired
    private ClienteRepository repository;

    @Override
    public Cliente buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
