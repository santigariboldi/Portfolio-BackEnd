package com.santiagogariboldi.sng.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Person {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   
   @NotNull
   @Size(min = 1, max = 50, message = "Debe introducir un nombre válido")
   private String name;
     
   private String linkedin_url;
     
   private String instagram_url;
    
   private String github_url;
   
   private String whatsapp_url;
   
   @NotNull
   private String banner_url;
   
   @NotNull
   private String profile_image_url;
   
   @NotNull
   private String ocupation;
   
   @NotNull
   private String description;
   
   
   
}

