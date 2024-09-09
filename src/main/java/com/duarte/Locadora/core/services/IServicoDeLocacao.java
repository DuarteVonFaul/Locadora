package com.duarte.Locadora.core.services;

import com.duarte.Locadora.core.domain.entity.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IServicoDeLocacao {
    Locacao criarLocacao(Integer id_clientes);
    void adicionarJogoALocacao(Integer id,Integer dias, JogoPlataforma jogoPlataforma);
    BigDecimal calcularCustoTotal(Integer id);

}
