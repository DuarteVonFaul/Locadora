package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Integer> {
}
