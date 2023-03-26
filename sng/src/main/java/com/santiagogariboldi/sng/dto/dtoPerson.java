package com.santiagogariboldi.sng.dto;

import jakarta.validation.constraints.NotBlank;

public class dtoPerson {

    @NotBlank
    private String name;

    @NotBlank
    private String linkedin_url;

    @NotBlank
    private String instagram_url;

    @NotBlank

    private String github_url;
    @NotBlank
    private String whatsapp_url;

    @NotBlank
    private String banner_url;

    @NotBlank
    private String profile_image_url;

    @NotBlank
    private String ocupation;

    @NotBlank
    private String description;

    public dtoPerson() {
    }

    public dtoPerson(String name, String linkedin_url, String instagram_url, String github_url, String whatsapp_url, String banner_url, String profile_image_url, String ocupation, String description) {
        this.name = name;
        this.linkedin_url = linkedin_url;
        this.instagram_url = instagram_url;
        this.github_url = github_url;
        this.whatsapp_url = whatsapp_url;
        this.banner_url = banner_url;
        this.profile_image_url = profile_image_url;
        this.ocupation = ocupation;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkedin_url() {
        return linkedin_url;
    }

    public void setLinkedin_url(String linkedin_url) {
        this.linkedin_url = linkedin_url;
    }

    public String getInstagram_url() {
        return instagram_url;
    }

    public void setInstagram_url(String instagram_url) {
        this.instagram_url = instagram_url;
    }

    public String getGithub_url() {
        return github_url;
    }

    public void setGithub_url(String github_url) {
        this.github_url = github_url;
    }

    public String getWhatsapp_url() {
        return whatsapp_url;
    }

    public void setWhatsapp_url(String whatsapp_url) {
        this.whatsapp_url = whatsapp_url;
    }

    public String getBanner_url() {
        return banner_url;
    }

    public void setBanner_url(String banner_url) {
        this.banner_url = banner_url;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
