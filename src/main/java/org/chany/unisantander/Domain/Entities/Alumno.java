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
    private String identificacion;
    @Column(name = "codigo_estudiante", unique = true, length = 6)
    private String codigoEstudiante;
    private String nombres;
    private String apellidos;
    private String sexo;
    private Integer edad;
    private String contacto;
    private String correo;


}
