package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

import java.util.List;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
    // Buscar por nombre del periodo
    //Periodo findByNombre(String nombre);
    //boolean existsByNombre(String nombre);

    //Buscar por fecha:
    //List<Periodo> findByFechaInicioBefore(LocalDate fecha);
    //List<Periodo> findByFechaFinAfter(LocalDate fecha);

}
