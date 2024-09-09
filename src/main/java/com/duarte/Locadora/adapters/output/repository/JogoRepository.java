package com.duarte.Locadora.adapters.output.repository;

import com.duarte.Locadora.core.domain.entity.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Integer> {


    @Query("SELECT j FROM Jogo j JOIN j.precosPorPlataforma jp WHERE j.id = :jogoId AND jp.id = :plataformaId")
    Jogo findByJogoIdAndPlataformaId(@Param("jogoId") Integer jogoId, @Param("plataformaId") Integer plataformaId);

}
