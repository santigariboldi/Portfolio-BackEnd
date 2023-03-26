package com.santiagogariboldi.sng.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreE;
    private String descripcionE;
    private String experiencia_image_url;

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String experiencia_image_url) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.experiencia_image_url = experiencia_image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
