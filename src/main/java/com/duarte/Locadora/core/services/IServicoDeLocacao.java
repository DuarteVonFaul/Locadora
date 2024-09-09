package com.duarte.Locadora.core.services;

import com.duarte.Locadora.core.domain.entity.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IServicoDeLocacao {
    Locacao criarLocacao(Cliente cliente);
    void adicionarJogoALocacao(Integer id, ItemLocacao novoItem);
    BigDecimal calcularCustoTotal(Integer id);

}
