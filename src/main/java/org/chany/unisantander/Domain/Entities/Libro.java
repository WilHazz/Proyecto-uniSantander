package org.chany.unisantander.Domain.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long Id;

    @Column(nullable = false, length = 150)
    private String titulo;
    @Column(nullable = false, length = 100)
    private String autor;
    @Column(nullable = false, length = 100)
    private String editorial;

    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;

    @Column(unique = true, length = 20)
    private String isbn;

    @Column(name = "cantidad_total")
    private Integer cantidadTotal = 1;

    @Column(name = "cantidad_disponible")
    private Integer cantidadDisponible = 1;
}
