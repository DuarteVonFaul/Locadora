package com.duarte.Locadora.core.services.strategy;

import com.duarte.Locadora.core.domain.entity.ItemLocacao;
import com.duarte.Locadora.core.domain.entity.JogoPlataforma;

import java.math.BigDecimal;
import java.util.List;

public class CalcularValorLocacaoStrategy implements ICalculoCustoStrategy {

    private final List<ItemLocacao> itens;

    public CalcularValorLocacaoStrategy(List<ItemLocacao> itens) {
        this.itens = itens;
    }

    @Override
    public BigDecimal calcularCusto() {
        return itens.stream()
                .map(item -> {
                    JogoPlataforma jogoPlataforma = item.getJogo().getPrecosPorPlataforma().stream()
                            .filter(jp -> jp.getPlataforma().equals(item.getPlataforma()))
                            .findFirst()
                            .orElseThrow(() -> new RuntimeException("Preço para a plataforma não encontrado"));
                    return jogoPlataforma.getPrecoDiario().multiply(new BigDecimal(item.getDias()));
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }


}
