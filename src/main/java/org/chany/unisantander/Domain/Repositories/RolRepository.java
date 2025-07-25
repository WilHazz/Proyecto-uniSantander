package org.chany.unisantander.Domain.Repositories;
import org.chany.unisantander.Domain.Entities.Rol;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByNombreRol(String nombreRol);
}
