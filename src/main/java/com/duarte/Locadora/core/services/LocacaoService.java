package com.duarte.Locadora.core.services;

import com.duarte.Locadora.adapters.output.repository.LocacaoRepositoryJPA;
import com.duarte.Locadora.core.domain.entity.Cliente;
import com.duarte.Locadora.core.domain.entity.ItemLocacao;
import com.duarte.Locadora.core.domain.entity.Locacao;
import com.duarte.Locadora.core.domain.repository.ILocacaoRepository;
import com.duarte.Locadora.core.factory.LocacaoFactory;
import com.duarte.Locadora.core.services.strategy.CalcularValorLocacaoStrategy;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class LocacaoService implements IServicoDeLocacao {

    ILocacaoRepository repository;

    public LocacaoService(ILocacaoRepository repository){
        this.repository = repository;
    }

    @Override
    public void adicionarJogoALocacao(Integer id, ItemLocacao novoItem) {
        Locacao locacao = this.repository.buscarPorId(id);
        if(locacao != null){
            novoItem.setLocacao(locacao);
            locacao.getItens().add(novoItem);
            this.repository.atualizar(locacao);
        }
    }

    @Override
    public BigDecimal calcularCustoTotal(Integer id) {
        Locacao locacao = this.repository.buscarPorId(id);
        CalcularValorLocacaoStrategy cobrancaStrategy = new CalcularValorLocacaoStrategy(locacao.getItens());
        return new CobrancaService().calcularCusto(cobrancaStrategy);
    }

    @Override
    public Locacao criarLocacao(Cliente cliente) {
            Locacao locacao = LocacaoFactory.criarLocacaoSemItens(cliente);
            this.repository.salvar(locacao);
            return locacao;
    }



}
