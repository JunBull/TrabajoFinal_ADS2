package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_variedad")
public class TipoVariedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_TipoVariedad;

    @Column(nullable = false)
    private String nombre_TipoVariedad;

    public TipoVariedad() {

    }

    public TipoVariedad(String nombre_TipoVariedad) {
        this.nombre_TipoVariedad = nombre_TipoVariedad;
    }

    public TipoVariedad(String nombre_TipoVariedad, Long id_TipoVariedad) {
        this.nombre_TipoVariedad = nombre_TipoVariedad;
        this.id_TipoVariedad = id_TipoVariedad;
    }

    public Long getId_TipoVariedad() {
        return id_TipoVariedad;
    }

    public void setId_TipoVariedad(Long id_TipoVariedad) {
        this.id_TipoVariedad = id_TipoVariedad;
    }

    public String getNombre_TipoVariedad() {
        return nombre_TipoVariedad;
    }

    public void setNombre_TipoVariedad(String nombre_TipoVariedad) {
        this.nombre_TipoVariedad = nombre_TipoVariedad;
    }
}
