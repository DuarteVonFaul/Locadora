package com.duarte.Locadora.adapters.output;


import com.duarte.Locadora.adapters.output.repository.JogoPlataformaRepository;
import com.duarte.Locadora.core.domain.entity.JogoPlataforma;
import com.duarte.Locadora.core.port.IJogoPlataformaPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JogoPlataformaOut implements IJogoPlataformaPort {

    @Autowired
    JogoPlataformaRepository repository;

    @Override
    public JogoPlataforma buscar(Integer id_jogo, Integer id_plataforma) {

        return this.repository.findByJogoIdAndPlataformaId(id_jogo,id_plataforma);
    }

    @Override
    public JogoPlataforma buscarById(Integer id) {

        return this.repository.getReferenceById(id);
    }
}
