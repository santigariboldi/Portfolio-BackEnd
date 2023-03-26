package com.santiagogariboldi.sng.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    
    private int porcentaje;
    
    private String skill_image_url;

    public Skills() {
    }

    public Skills(String nombre, int porcentaje, String skill_image_url) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.skill_image_url = skill_image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
