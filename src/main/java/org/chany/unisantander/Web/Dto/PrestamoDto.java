package org.chany.unisantander.Web.Dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PrestamoDto {
    private Long id;
    private String codigoEstudiante;
    private Long idLibro;
    private String tituloLibro;

    private LocalDateTime fechaPrestamo;
    private LocalDate fechaDevolucionEstimada;
    private LocalDate fechaDevolucionReal;

    private int renovacion;
    private String estado;
}
