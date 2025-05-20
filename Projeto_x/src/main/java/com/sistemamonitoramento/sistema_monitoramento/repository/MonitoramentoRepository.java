package com.sistemamonitoramento.sistema_monitoramento.repository;

import com.sistemamonitoramento.sistema_monitoramento.entity.Monitoramento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitoramentoRepository extends JpaRepository<Monitoramento, Long> {
}
