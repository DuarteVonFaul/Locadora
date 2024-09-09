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
        BigDecimal value = new BigDecimal(0);

        for( ItemLocacao item : this.itens){
            value = value.add(new BigDecimal(item.getDias()).multiply(item.getJogoPlataforma().getPrecoDiario()));
        }

        return value;
    }


}
