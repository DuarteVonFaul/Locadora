package com.duarte.Locadora.adapters.output;

import com.duarte.Locadora.core.domain.entity.Locacao;
import com.duarte.Locadora.core.port.ILocacaoPort;
import org.springframework.stereotype.Component;

@Component
public class LocacaoOut implements ILocacaoPort {


    @Override
    public void salvar(Locacao locacao) {}

    @Override
    public void atualizar(Locacao locacao) {}

    @Override
    public Locacao buscarPorId(Integer id) {
        return null;
    }
}
