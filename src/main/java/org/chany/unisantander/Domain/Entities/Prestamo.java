package org.chany.unisantander.Domain.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestamo")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "codigo_estudiante", referencedColumnName = "codigoEstudiante")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "id_libro", nullable = false)
    private  Libro libro;

    @Column(name = "fecha_prestamo", nullable = false)
    private LocalDateTime fechaPrestamo = LocalDateTime.now();

    @Column(name = "fecha_devolucion_estimada", nullable = false)
    private LocalDate fechaDevolucionEstimada;

    @Column(name = "fecha_devolucion_real")
    private LocalDate fechaDevolucionReal;

    private Integer renovaciones = 0;

    @Enumerated(EnumType.STRING)
    private EstadoPrestamos estado = EstadoPrestamos.ACTIVO;

    public enum EstadoPrestamos{
        ACTIVO,
        DEVUELTO,
        ATRASADO
    }

}
