package org.chany.unisantander.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "profesores")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Long id;
    @Column(nullable = false, unique = true, length = 10)
    private String identificacion;
    @Column(length = 50)
    private String nombres;
    @Column(length = 50)
    private String apellidos;
    @Column(length = 1, nullable = false)
    private String sexo;
    private Integer edad;
    @Column(length = 10)
    private String contacto;
    @Column(unique = true, length = 100)
    private String correo;
}
