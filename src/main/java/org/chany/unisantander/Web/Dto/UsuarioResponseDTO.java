package org.chany.unisantander.Web.Dto;

import java.util.Set;
import lombok.Data;

@Data
public class UsuarioResponseDTO {
    private Long id;
    private String username;
    private String correo;
    private Set<String> roles;
}
