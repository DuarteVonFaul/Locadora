package com.duarte.Locadora.adapters.output;

import com.duarte.Locadora.adapters.output.repository.LocacaoRepository;
import com.duarte.Locadora.core.domain.entity.Locacao;
import com.duarte.Locadora.core.port.ILocacaoPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocacaoOut implements ILocacaoPort {

    @Autowired
    LocacaoRepository repository;

    @Override
    public void salvar(Locacao locacao) {
        this.repository.saveAndFlush(locacao);
    }

    @Override
    public void atualizar(Locacao locacao) {
        this.repository.saveAndFlush(locacao);

    }

    @Override
    public Locacao buscarPorId(Integer id) {

        return this.repository.getReferenceById(id);
    }
}
