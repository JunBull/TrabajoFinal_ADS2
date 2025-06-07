package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.TipoVariedadDTO;
import com.TrabajoFinal_ADS2.modelo.TipoVariedad;
import com.TrabajoFinal_ADS2.repository.TipoVariedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoVariedadService {

    @Autowired
    private TipoVariedadRepository tipoVariedadRepository;

    public void guardarTipoVariedad(TipoVariedadDTO tipoVariedadDTO){
        TipoVariedad tipoVariedad = new TipoVariedad(
                tipoVariedadDTO.getNombre_TipoVariedad()
        );
        tipoVariedadRepository.save(tipoVariedad);
    }
}
