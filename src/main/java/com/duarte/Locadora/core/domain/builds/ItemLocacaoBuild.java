package com.duarte.Locadora.core.domain.builds;


import com.duarte.Locadora.core.domain.entity.ItemLocacao;
import com.duarte.Locadora.core.domain.entity.JogoPlataforma;
import com.duarte.Locadora.core.domain.entity.Locacao;
import com.duarte.Locadora.core.port.IJogoPlataformaPort;

import com.duarte.Locadora.core.port.ILocacaoPort;
import org.springframework.stereotype.Component;


@Component
public class ItemLocacaoBuild {

    private ItemLocacao itemLocacao = new ItemLocacao();


    public ItemLocacaoBuild addLocacao (Locacao locacao){
        this.itemLocacao.setLocacao(locacao);
        return this;
    }

    public ItemLocacaoBuild addJogoplataforma (JogoPlataforma jogoPlataforma){
        this.itemLocacao.setJogoPlataforma(jogoPlataforma);
        return this;
    }

    public ItemLocacaoBuild addDias (int dias){
        this.itemLocacao.setDias(dias);
        return this;
    }

    public ItemLocacao build(){
        return this.itemLocacao;
    }


}
