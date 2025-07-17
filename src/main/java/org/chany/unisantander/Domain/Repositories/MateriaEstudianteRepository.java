package org.chany.unisantander.Domain.Repositories;

import org.chany.unisantander.Domain.Entities.Materia;
import org.chany.unisantander.Domain.Entities.MateriaEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MateriaEstudianteRepository extends JpaRepository<MateriaEstudiante, Long> {
    //Materias de un estudiante específico

    List<MateriaEstudiante> findByAlumno_Id(Long idAlumno);

    //Materias de un estdiante en un periodo específico
    List<MateriaEstudiante> findByAlumno_IdAndPeriodo_Id(Long idAlumno, Long idPeriodo);

    // Query para obtener materias con información completa
    @Query("SELECT me FROM MateriaEstudiante me " +
            "JOIN FETCH me.alumno " +
            "JOIN FETCH me.materia " +
            "JOIN FETCH me.periodo " +
            "WHERE me.alumno.correo = :correo")

    List<MateriaEstudiante> findByAlumnoCorreoWithDetails(@Param("correo") String correo);

    //SI Desea Filtrar por materias:
    //List<MateriaEstudiante> findByMateria_Id(Long idMateria);
}
