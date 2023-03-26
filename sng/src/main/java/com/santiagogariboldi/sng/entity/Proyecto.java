
package com.santiagogariboldi.sng.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String nombre;
    
    @NotNull
    private String descripcion;
    
    private String proyecto_image_url;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String proyecto_image_url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proyecto_image_url = proyecto_image_url;
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
