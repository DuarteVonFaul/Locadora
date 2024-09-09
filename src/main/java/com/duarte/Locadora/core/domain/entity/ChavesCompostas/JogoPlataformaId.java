package com.duarte.Locadora.core.domain.entity.ChavesCompostas;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class JogoPlataformaId {

    private Integer jogo;
    private Integer plataforma;

    public JogoPlataformaId() {
    }

    public JogoPlataformaId(Integer jogo, Integer plataforma) {
        this.jogo = jogo;
        this.plataforma = plataforma;
    }

    public Integer getJogo() {
        return jogo;
    }

    public void setJogo(Integer jogo) {
        this.jogo = jogo;
    }

    public Integer getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Integer plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JogoPlataformaId that = (JogoPlataformaId) o;
        return Objects.equals(jogo, that.jogo) &&
                Objects.equals(plataforma, that.plataforma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jogo, plataforma);
    }

}
