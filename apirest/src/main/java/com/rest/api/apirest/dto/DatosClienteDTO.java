package com.rest.api.apirest.dto;

import com.rest.api.apirest.models.Cliente;
import lombok.Data;

import java.util.List;

@Data
public class DatosClienteDTO {
    private Boolean error;
    private List<Cliente> dato;
    private String mensaje;

    public DatosClienteDTO(Boolean e, List<Cliente> listado, String mensaje){
        this.error = e;
        this.dato = listado;
        this.mensaje = mensaje;
    }
}
