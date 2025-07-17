package org.chany.unisantander.Web.Dto;

import lombok.Data;

@Data
public class AlumnoDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String codigo_Estudiante;
    private String identificacion;
}
