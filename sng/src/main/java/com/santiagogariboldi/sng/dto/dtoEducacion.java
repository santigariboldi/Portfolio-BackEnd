
package com.santiagogariboldi.sng.dto;

import jakarta.validation.constraints.NotBlank;


public class dtoEducacion {
   @NotBlank
   private String nombreE;
   @NotBlank
   private String descripcionE;
   @NotBlank
   private String educacion_image_url;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String educacion_image_url) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.educacion_image_url = educacion_image_url;
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

    public String getEducacion_image_url() {
        return educacion_image_url;
    }

    public void setEducacion_image_url(String educacion_image_url) {
        this.educacion_image_url = educacion_image_url;
    }


   
}
