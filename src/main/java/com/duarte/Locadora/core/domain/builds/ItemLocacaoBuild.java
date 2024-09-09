package com.duarte.Locadora.core.domain.builds;

import com.duarte.Locadora.core.domain.entity.ChavesCompostas.JogoPlataformaId;
import com.duarte.Locadora.core.domain.entity.ItemLocacao;
import com.duarte.Locadora.core.port.IJogoPlataformaPort;
import com.duarte.Locadora.core.port.IJogoPort;
import com.duarte.Locadora.core.port.ILocacaoPort;
import com.duarte.Locadora.core.port.IPlataformaPort;


public class ItemLocacaoBuild {

    private ItemLocacao itemLocacao;


    public ItemLocacaoBuild addLocacao (int id, ILocacaoPort locacaoPort){
        this.itemLocacao.setLocacao(locacaoPort.buscarPorId(id));
        return this;
    }

    public ItemLocacaoBuild addJogoplataforma (JogoPlataformaId id, IJogoPlataformaPort jogoPlataformaPort){
        var jogoPlataforma = jogoPlataformaPort.buscar(id);
        this.itemLocacao.setJogo(jogoPlataforma.getJogo());
        this.itemLocacao.setPlataforma(jogoPlataforma.getPlataforma());
        return this;
    }

    public ItemLocacaoBuild addPlataforma (int id, IPlataformaPort plataformaPortPort){
        this.itemLocacao.setPlataforma(plataformaPortPort.buscarPorId(id));
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
