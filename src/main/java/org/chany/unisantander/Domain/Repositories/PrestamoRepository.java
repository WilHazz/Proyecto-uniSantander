package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    List<Prestamo> findByAlumno_CodigoEstudiante(String codigoEstudiante);
}
