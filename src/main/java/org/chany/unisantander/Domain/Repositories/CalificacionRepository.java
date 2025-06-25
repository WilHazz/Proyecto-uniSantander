package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.Calificacion;
import org.chany.unisantander.Domain.Entities.MateriaEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    List<Calificacion> findByMateriaEstudiante_Id(Long idMateriaEstudiante);
}
