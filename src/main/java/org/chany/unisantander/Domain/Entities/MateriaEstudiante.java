package org.chany.unisantander.Domain.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "materia_estudiante", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_alumno", "id_materia", "id_periodo"})
})
public class MateriaEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia_estudiante")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_alumno", nullable = false)
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "id_materia", nullable = false)
    private Materia materia;

    @ManyToOne
    @JoinColumn(name = "id_periodo", nullable = false)
    private Periodo periodo;
}
