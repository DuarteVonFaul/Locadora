package com.duarte.Locadora.core.services.strategy;

import com.duarte.Locadora.core.domain.entity.UtilizacaoDoConsolePeloCliente;

import java.math.BigDecimal;
import java.time.Duration;

public class CalcularValorUsoDoConsoleStrategy implements ICalculoCustoStrategy {

    private final UtilizacaoDoConsolePeloCliente consoleToCliente;

    public CalcularValorUsoDoConsoleStrategy(UtilizacaoDoConsolePeloCliente consoleToCliente) {
        this.consoleToCliente = consoleToCliente;
    }

    @Override
    public BigDecimal calcularCusto() {
        long horasUtilizadas = Duration.between(consoleToCliente.getInicio(), consoleToCliente.getFim()).toHours();
        return consoleToCliente.getConsole().getPrecoPorHora().multiply(new BigDecimal(horasUtilizadas));
    }
}
