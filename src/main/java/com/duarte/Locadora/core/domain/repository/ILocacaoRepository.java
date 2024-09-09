package com.duarte.Locadora.core.domain.repository;

import com.duarte.Locadora.core.domain.entity.Locacao;


public interface ILocacaoRepository {
    void salvar(Locacao locacao);
    void atualizar(Locacao locacao);
    Locacao buscarPorId(Integer id);
}
