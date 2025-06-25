package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
