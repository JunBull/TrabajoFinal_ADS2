package com.TrabajoFinal_ADS2.dto;

public class PlantaDTO {
    private Long id_Planta;

    private String ubicacion_Planta;

    private int capacidad_Planta;

    public PlantaDTO() {
    }

    public PlantaDTO(String ubicacion_Planta, int capacidad_Planta) {
        this.ubicacion_Planta = ubicacion_Planta;
        this.capacidad_Planta = capacidad_Planta;
    }

    public PlantaDTO(Long id_Planta, String ubicacion_Planta, int capacidad_Planta) {
        this.id_Planta = id_Planta;
        this.ubicacion_Planta = ubicacion_Planta;
        this.capacidad_Planta = capacidad_Planta;
    }

    public Long getId_Planta() {
        return id_Planta;
    }

    public void setId_Planta(Long id_Planta) {
        this.id_Planta = id_Planta;
    }

    public String getUbicacion_Planta() {
        return ubicacion_Planta;
    }

    public void setUbicacion_Planta(String ubicacion_Planta) {
        this.ubicacion_Planta = ubicacion_Planta;
    }

    public int getCapacidad_Planta() {
        return capacidad_Planta;
    }

    public void setCapacidad_Planta(int capacidad_Planta) {
        this.capacidad_Planta = capacidad_Planta;
    }
}
