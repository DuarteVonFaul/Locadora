package com.duarte.Locadora.adapters.input.web;

import com.duarte.Locadora.adapters.output.repository.LocacaoRepositoryJPA;
import com.duarte.Locadora.core.services.LocacaoService;
import com.duarte.Locadora.core.domain.entity.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/locacoes")
public class LocacaoController {
    private final LocacaoService locacaoService = new LocacaoService(new LocacaoRepositoryJPA());

    @PostMapping
    public ResponseEntity<Locacao> criarLocacao(@RequestBody Cliente cliente) {
        Locacao locacao = locacaoService.criarLocacao(cliente);
        return ResponseEntity.ok(locacao);
    }

    @PostMapping("/{id}/jogos")
    public ResponseEntity<Void> adicionarJogoALocacao(@PathVariable Integer id,
                                                      @RequestBody ItemLocacao request) {
        locacaoService.adicionarJogoALocacao(id,request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}/custo")
    public ResponseEntity<BigDecimal> calcularCustoTotal(@PathVariable Integer id) {
        BigDecimal custoTotal = locacaoService.calcularCustoTotal(id);
        return ResponseEntity.ok(custoTotal);
    }
}
