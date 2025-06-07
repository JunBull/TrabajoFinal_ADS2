package com.TrabajoFinal_ADS2.dto;

public class TipoVariedadDTO {

    private Long id_TipoVariedad;

    private String nombre_TipoVariedad;

    public TipoVariedadDTO() {

    }

    public TipoVariedadDTO(String nombre_TipoVariedad) {
        this.nombre_TipoVariedad = nombre_TipoVariedad;
    }

    public TipoVariedadDTO(String nombre_TipoVariedad, Long id_TipoVariedad) {
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
