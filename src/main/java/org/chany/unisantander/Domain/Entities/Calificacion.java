package org.chany.unisantander.Domain.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "calificaciones", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_materia_estudiante", "id_profesor_materia"})
})
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "id_materia_estudiante", nullable = false)
    private MateriaEstudiante materiaEstudiante;

    @ManyToOne
    @JoinColumn(name = "id_profesor_materia", nullable = false)
    private MateriaProfesor materiaProfesor;

    @Column(precision = 3, scale = 1)
    private Double corte1;

    @Column(precision = 3, scale = 1)
    private Double corte2;

    @Column(precision = 3, scale = 1)
    private Double corte3;

    @Transient //Es calculada en la BD
    private Double notaFinal;

    @Transient // porque usar Transient en notaFinal y estado porque  la DB los genera
    private String estado; //Para saber si esta aprobado o reprobado
}
