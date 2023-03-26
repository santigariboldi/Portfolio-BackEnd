package com.santiagogariboldi.sng.dto;

import jakarta.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String proyecto_image_url;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombre, String descripcion, String proyecto_image_url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proyecto_image_url = proyecto_image_url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProyecto_image_url() {
        return proyecto_image_url;
    }

    public void setProyecto_image_url(String proyecto_image_url) {
        this.proyecto_image_url = proyecto_image_url;
    }
 
    
    
}
