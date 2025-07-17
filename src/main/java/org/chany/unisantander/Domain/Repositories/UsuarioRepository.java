package org.chany.unisantander.Domain.Repositories;


import org.chany.unisantander.Domain.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String correo);
    //Metodos para validar existencia por identificación
    boolean existsByUsername(String username);
    boolean existsByCorreo(String correo);

    //Username para auntenticar
    //Optional<Usuario> findByUsername(String username);

    //Buscar Usuarios por correo ignorando mayúsculas/minúsculas
    Optional<Usuario> findByCorreoIgnoreCase(String correo);
}
