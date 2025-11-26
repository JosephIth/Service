package com.backEnd.Service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    
    @Id
    @Column(length = 30, nullable = false)
    private String correo_usuario;           

    @Column(length = 30, nullable = false)
    private String nombre_usuario;

    // img_url removed: we no longer store user images in the Usuario table

    @Column(name = "isAdmin", nullable = false)
    private Boolean isAdmin;
    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(length = 100, nullable = false)
    private String password;
}
