package com.duarte.Locadora.core.services;

import com.duarte.Locadora.core.services.strategy.ICalculoCustoStrategy;

import java.math.BigDecimal;

public class CobrancaService {

    public BigDecimal calcularCusto(ICalculoCustoStrategy custoStrategy) {
        return  custoStrategy.calcularCusto();
    }
}
