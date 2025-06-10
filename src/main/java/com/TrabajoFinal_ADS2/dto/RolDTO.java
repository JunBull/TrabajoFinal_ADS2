package com.TrabajoFinal_ADS2.dto;

public class RolDTO {
    private Long id;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RolDTO(String nombre, Long id) {
        this.nombre = nombre;
        this.id = id;
    }

    public RolDTO(String nombre) {
        this.nombre = nombre;
    }

    public RolDTO() {
    }
}
