package com.duarte.Locadora.core.domain.builds;


import com.duarte.Locadora.core.domain.entity.ItemLocacao;
import com.duarte.Locadora.core.port.IJogoPlataformaPort;

import com.duarte.Locadora.core.port.ILocacaoPort;



public class ItemLocacaoBuild {

    private ItemLocacao itemLocacao;


    public ItemLocacaoBuild addLocacao (int id, ILocacaoPort locacaoPort){
        this.itemLocacao.setLocacao(locacaoPort.buscarPorId(id));
        return this;
    }

    public ItemLocacaoBuild addJogoplataforma (Integer id_jogo, Integer id_plataforma,IJogoPlataformaPort jogoPlataformaPort){
        var jogoPlataforma = jogoPlataformaPort.buscar(id_jogo, id_plataforma);
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
