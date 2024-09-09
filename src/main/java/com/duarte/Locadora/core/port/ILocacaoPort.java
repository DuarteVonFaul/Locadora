package com.duarte.Locadora.core.port;

import com.duarte.Locadora.core.domain.entity.Locacao;
import org.springframework.stereotype.Component;


public interface ILocacaoPort {
    void salvar(Locacao locacao);
    void atualizar(Locacao locacao);
    Locacao buscarPorId(Integer id);
}
