
package com.santiagogariboldi.sng.dto;

import jakarta.validation.constraints.NotBlank;

public class dtoSkills {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    @NotBlank
    private String skill_image_url;

    public dtoSkills() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getSkill_image_url() {
        return skill_image_url;
    }

    public void setSkill_image_url(String skill_image_url) {
        this.skill_image_url = skill_image_url;
    }

   
    
}
