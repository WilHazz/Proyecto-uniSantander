package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    Optional<Alumno> findByCodigoEstudiante(String codigoEstudiante);
}
