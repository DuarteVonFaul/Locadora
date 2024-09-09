package com.duarte.Locadora.core.services;

import com.duarte.Locadora.core.domain.builds.ItemLocacaoBuild;
import com.duarte.Locadora.core.domain.entity.ItemLocacao;
import com.duarte.Locadora.core.domain.entity.JogoPlataforma;
import com.duarte.Locadora.core.domain.entity.Locacao;
import com.duarte.Locadora.core.port.IClientePort;
import com.duarte.Locadora.core.port.ILocacaoPort;
import com.duarte.Locadora.core.services.strategy.CalcularValorLocacaoStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LocacaoService implements IServicoDeLocacao {

    ILocacaoPort locacaoPort;
    IClientePort clientePort;

    @Autowired
    public LocacaoService(ILocacaoPort locacaoRepository,
                          IClientePort clienteRepository){

        this.locacaoPort = locacaoRepository;
        this.clientePort = clienteRepository;
    }

    @Override
    public void adicionarJogoALocacao(Integer id,Integer dias, JogoPlataforma jogoPlataforma) {
        Locacao locacao = this.locacaoPort.buscarPorId(id);
        if(locacao != null){
            var novoItem = new ItemLocacaoBuild().addLocacao(locacao)
                                                .addJogoplataforma(jogoPlataforma)
                                                .addDias(dias)
                                                .build();
            novoItem.setLocacao(locacao);
            locacao.getItens().add(novoItem);
            this.locacaoPort.atualizar(locacao);
        }
    }

    @Override
    public BigDecimal calcularCustoTotal(Integer id) {
        Locacao locacao = this.locacaoPort.buscarPorId(id);
        CalcularValorLocacaoStrategy cobrancaStrategy = new CalcularValorLocacaoStrategy(locacao.getItens());
        return new CobrancaService().calcularCusto(cobrancaStrategy);
    }

    @Override
    public Locacao criarLocacao(Integer id_clientes) {
            Locacao locacao = new Locacao(clientePort.buscarPorId(id_clientes));
            this.locacaoPort.salvar(locacao);
            return locacao;
    }



}
