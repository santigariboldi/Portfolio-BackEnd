package com.santiagogariboldi.sng.dto;

import jakarta.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String experiencia_image_url;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String experiencia_image_url) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.experiencia_image_url = experiencia_image_url;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getExperiencia_image_url() {
        return experiencia_image_url;
    }

    public void setExperiencia_image_url(String experiencia_image_url) {
        this.experiencia_image_url = experiencia_image_url;
    }

    
    
    
}
