package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.MateriaProfesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MateriaProfesorRepository extends JpaRepository<MateriaProfesor, Long> {
    // Materias de un profesor específico
    List<MateriaProfesor> findByProfesor_Id(Long idProfesor);

    // Materias de un profesor en un período específico
    List<MateriaProfesor> findByProfesor_IdAndPeriodo_Id(Long idProfesor, Long idPeriodo);

    // Query para obtener materias de un profesor por correo
    @Query("SELECT mp FROM MateriaProfesor mp " +
            "JOIN FETCH mp.profesor " +
            "JOIN FETCH mp.materia " +
            "JOIN FETCH mp.periodo " +
            "WHERE mp.profesor.correo = :correo")

    List<MateriaProfesor> findByProfesorCorreoWithDetails(@Param("correo") String correo);
}
