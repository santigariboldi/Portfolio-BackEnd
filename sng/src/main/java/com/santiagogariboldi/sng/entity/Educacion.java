
package com.santiagogariboldi.sng.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String educacion_image_url;

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, String educacion_image_url) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.educacion_image_url = educacion_image_url;
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

    public String getEducacion_image_url() {
        return educacion_image_url;
    }

    public void setEducacion_image_url(String educacion_image_url) {
        this.educacion_image_url = educacion_image_url;
    }

    
    
}
