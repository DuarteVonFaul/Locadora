package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
