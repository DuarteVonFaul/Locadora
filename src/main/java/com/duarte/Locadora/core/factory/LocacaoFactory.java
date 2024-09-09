package com.duarte.Locadora.core.factory;

import com.duarte.Locadora.core.domain.entity.Cliente;
import com.duarte.Locadora.core.domain.entity.ItemLocacao;
import com.duarte.Locadora.core.domain.entity.Locacao;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class LocacaoFactory {

    public static Locacao criarLocacaoSemItens(Cliente cliente) {
        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setData(LocalDate.now());
        locacao.setItens(Collections.emptyList());
        return locacao;
    }

    public static Locacao criarLocacaoComItens(Cliente cliente, List<ItemLocacao> itens) {
        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setData(LocalDate.now());
        itens.forEach(item -> item.setLocacao(locacao));
        locacao.setItens(itens);
        return locacao;
    }
}
