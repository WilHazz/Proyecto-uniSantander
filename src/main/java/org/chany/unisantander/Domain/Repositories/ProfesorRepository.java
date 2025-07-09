package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
    Optional<Profesor> findByCorreo(String correo);
    Optional<Profesor> findByIdentificacion(String identificacion);
    boolean existsByCorreo(String correo);
    boolean existsByIdentificacion(String identificacion );
}
