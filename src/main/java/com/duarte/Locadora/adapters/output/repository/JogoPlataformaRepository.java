package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.JogoPlataforma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface JogoPlataformaRepository extends JpaRepository<JogoPlataforma, Integer> {

    @Query("SELECT jp FROM JogoPlataforma jp WHERE jp.jogo.id = :jogoId AND jp.plataforma.id = :plataformaId")
    JogoPlataforma findByJogoIdAndPlataformaId(@Param("jogoId") Integer jogoId, @Param("plataformaId") Integer plataformaId);

}
