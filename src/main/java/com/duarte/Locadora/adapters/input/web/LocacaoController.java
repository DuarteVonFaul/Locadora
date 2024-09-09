package com.duarte.Locadora.adapters.input.web;

import com.duarte.Locadora.adapters.output.ClienteOut;
import com.duarte.Locadora.adapters.output.JogoPlataformaOut;
import com.duarte.Locadora.adapters.output.LocacaoOut;
import com.duarte.Locadora.core.services.LocacaoService;
import com.duarte.Locadora.core.domain.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/locacoes")
public class LocacaoController {

    @Autowired
    private final LocacaoService locacaoService = new LocacaoService(new LocacaoOut(),
                                                                     new ClienteOut());
    @Autowired
    private JogoPlataformaOut jogoPlataformaOut = new JogoPlataformaOut();

    @PostMapping
    public ResponseEntity<Locacao> criarLocacao(@RequestParam Integer idCliente) {
        Locacao locacao = locacaoService.criarLocacao(idCliente);
        return ResponseEntity.ok(locacao);
    }

    @PostMapping("/{id}/jogos")
    public ResponseEntity<Void> adicionarJogoALocacao(@PathVariable Integer id,
                                                      @RequestParam Integer idJogo,
                                                      @RequestParam Integer idPlataforma,
                                                      @RequestParam Integer Dias) {

        var jogoPlataforma = jogoPlataformaOut.buscar(idJogo,idPlataforma);
        locacaoService.adicionarJogoALocacao(id,Dias,jogoPlataforma);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}/custo")
    public ResponseEntity<BigDecimal> calcularCustoTotal(@PathVariable Integer id) {
        BigDecimal custoTotal = locacaoService.calcularCustoTotal(id);
        return ResponseEntity.ok(custoTotal);
    }
}
