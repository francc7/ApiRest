package com.rest.api.apirest.dto;

import lombok.Data;
import lombok.NonNull;
import javax.validation.constraints.Min;

@Data
public class ClienteDevueltoNoIdDTO {
    @NonNull
    private String nombre;
    @Min(0)
    private Integer tlf;

    public ClienteDevueltoNoIdDTO(){
        this.nombre = "";
        this.tlf = 0;
    }
    public ClienteDevueltoNoIdDTO(String nombre, Integer tlf){
        this.nombre = nombre;
        this.tlf = tlf;
    }
}
