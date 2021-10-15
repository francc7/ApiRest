package com.rest.api.apirest.dto;

import com.rest.api.apirest.models.Cliente;
import lombok.Data;

@Data
public class ClienteDevueltoDTO {
    private Boolean error;
    private Cliente dato;
    private String mensaje;

    public ClienteDevueltoDTO(Boolean e, Cliente dato, String mensaje){
        this.error = e;
        this.dato = dato;
        this.mensaje = mensaje;
    }
}
