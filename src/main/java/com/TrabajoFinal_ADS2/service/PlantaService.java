package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.PlantaDTO;
import com.TrabajoFinal_ADS2.modelo.Planta;
import com.TrabajoFinal_ADS2.repository.PlantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantaService {

    @Autowired
    private PlantaRepository plantaRepository;

    public void guardarPlanta(PlantaDTO plantaDTO){
        Planta planta = new Planta(
                plantaDTO.getUbicacion_Planta(),
                plantaDTO.getCapacidad_Planta()
        );
        plantaRepository.save(planta);
    }
}
