package org.chany.unisantander.Domain.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "periodo", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"nombre"})
})
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_periodo")
    private Long Id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;


}
