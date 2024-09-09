package com.duarte.Locadora.core.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    @OneToMany(mappedBy = "jogo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JogoPlataforma> precosPorPlataforma = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<JogoPlataforma> getPrecosPorPlataforma() {
        return precosPorPlataforma;
    }

    public void setPrecosPorPlataforma(Set<JogoPlataforma> precosPorPlataforma) {
        this.precosPorPlataforma = precosPorPlataforma;
    }

    // Métodos utilitários para adicionar/remover preços
    public void adicionarPrecoPorPlataforma(Plataforma plataforma, BigDecimal preco) {
        JogoPlataforma jogoPlataforma = new JogoPlataforma(this, plataforma, preco);
        precosPorPlataforma.add(jogoPlataforma);
    }

    public void removerPrecoPorPlataforma(Plataforma plataforma) {
        precosPorPlataforma.removeIf(jogoPlataforma -> jogoPlataforma.getPlataforma().equals(plataforma));
    }
}