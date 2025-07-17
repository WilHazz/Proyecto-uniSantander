package org.chany.unisantander.Web.Dto;

import lombok.Data;

@Data
public class CalificaionResponseDTO {
    private Long id; // id_calificacion

    private Long idMateriaEstudiante;

    private Long idProfesorMateria;

    private Double corte1;

    private Double corte2;

    private Double corte3;

    private Double notaFinal;

    private String estado; // Aprobado / Reprobado
}
