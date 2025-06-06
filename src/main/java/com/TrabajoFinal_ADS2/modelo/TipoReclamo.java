package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_reclamo")
public class TipoReclamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_TipoReclamo;

    @Column(nullable = false)
    private String nombre_TipoReclamo;

    public TipoReclamo() {

    }

    public TipoReclamo(String nombre_TipoReclamo) {
        this.nombre_TipoReclamo = nombre_TipoReclamo;
    }

    public TipoReclamo(String nombre_TipoReclamo, Long id_TipoReclamo) {
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
