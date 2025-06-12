package org.chany.unisantander.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "alumnos")
public class Alumno{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id_alumno")
    private Long Id;

    @Column(nullable = false, unique = true, length = 10)
    private String identificacion;

    @Column(name = "codigo_estudiante", unique = true, length = 6)
    private String codigoEstudiante;

    @Column(length = 60)
    private String nombres;

    @Column(length = 60)
    private String apellidos;

    @Column(length = 1)
    private String sexo;

    private Integer edad;
    @Column(length = 20)
    private String contacto;
    @Column(unique = true, length = 100)
    private String correo;


}
