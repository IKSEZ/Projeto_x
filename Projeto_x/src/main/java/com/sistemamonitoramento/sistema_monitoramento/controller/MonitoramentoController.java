package com.sistemamonitoramento.sistema_monitoramento.controller;

import com.sistemamonitoramento.sistema_monitoramento.dto.MonitoramentoDTO;
import com.sistemamonitoramento.sistema_monitoramento.service.MonitoramentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monitoramento")
public class MonitoramentoController {

    private final MonitoramentoService service;

    public MonitoramentoController(MonitoramentoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> receberDados(@RequestBody MonitoramentoDTO dto) {
        service.salvarDados(dto);
        return ResponseEntity.ok("Dados recebidos com sucesso!");
    }
}
