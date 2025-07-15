package org.chany.unisantander.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Materia_profesor", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_profesor", "id_materia", "id_periodo"})
})
public class MateriaProfesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor_materia")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_profesor", nullable = false)
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_materia", nullable = false)
    private Materia materia;

    @ManyToOne
    @JoinColumn(name = "id_periodo", nullable = false)
    private Periodo periodo;
}
