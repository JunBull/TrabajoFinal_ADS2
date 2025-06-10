package com.TrabajoFinal_ADS2.dto;

import jakarta.persistence.Column;

public class TipoReclamoDTO {
    private Long id_TipoReclamo;
    private String nombre_TipoReclamo;

    public TipoReclamoDTO() {

    }

    public TipoReclamoDTO(String nombre_TipoReclamo) {
        this.nombre_TipoReclamo = nombre_TipoReclamo;
    }

    public TipoReclamoDTO(String nombre_TipoReclamo, Long id_TipoReclamo) {
        this.nombre_TipoReclamo = nombre_TipoReclamo;
        this.id_TipoReclamo = id_TipoReclamo;
    }

    public Long getId_TipoReclamo() {
        return id_TipoReclamo;
    }

    public void setId_TipoReclamo(Long id_TipoReclamo) {
        this.id_TipoReclamo = id_TipoReclamo;
    }

    public String getNombre_TipoReclamo() {
        return nombre_TipoReclamo;
    }

    public void setNombre_TipoReclamo(String nombre_TipoReclamo) {
        this.nombre_TipoReclamo = nombre_TipoReclamo;
    }
}
