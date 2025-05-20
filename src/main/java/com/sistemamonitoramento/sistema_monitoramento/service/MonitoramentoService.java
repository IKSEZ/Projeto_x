package com.sistemamonitoramento.sistema_monitoramento.service;

import com.sistemamonitoramento.sistema_monitoramento.dto.MonitoramentoDTO;
import com.sistemamonitoramento.sistema_monitoramento.entity.Monitoramento;
import com.sistemamonitoramento.sistema_monitoramento.repository.MonitoramentoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MonitoramentoService {

    private final MonitoramentoRepository repository;

    public MonitoramentoService(MonitoramentoRepository repository) {
        this.repository = repository;
    }

    public void salvarDados(MonitoramentoDTO dto) {
        Monitoramento monitoramento = new Monitoramento();
        monitoramento.setCpu(dto.getCpu());
        monitoramento.setRam(dto.getRam());
        monitoramento.setDataHora(LocalDateTime.now());
        repository.save(monitoramento);
    }
}