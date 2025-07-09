package org.chany.unisantander.Web.Dto;

import lombok.Data;

@Data
public class UsuarioLoginRequestDTO {
    private String correo;
    private String password;
}
