package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.MateriaEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MateriaEstudianteRepository extends JpaRepository<MateriaEstudiante, Long> {
    List<MateriaEstudiante> findByMateriaEstudiante_Id(Long idMateriaEstudiante);
}
