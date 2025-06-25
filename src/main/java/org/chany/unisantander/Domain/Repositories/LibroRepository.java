package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
