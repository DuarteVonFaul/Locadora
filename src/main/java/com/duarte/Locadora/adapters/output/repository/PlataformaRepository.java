package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.Plataforma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformaRepository  extends JpaRepository<Plataforma, Integer> {
}
