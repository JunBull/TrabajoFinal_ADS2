package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.TipoReclamoDTO;
import com.TrabajoFinal_ADS2.modelo.TipoReclamo;
import com.TrabajoFinal_ADS2.repository.TipoReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoReclamoService {

    @Autowired
    TipoReclamoRepository tipoReclamoRepository;

    public void guardarTipoReclamo(TipoReclamoDTO tipoReclamoDTO){
        TipoReclamo tipoReclamo = new TipoReclamo(
                tipoReclamoDTO.getNombre_TipoReclamo()
        );
        tipoReclamoRepository.save(tipoReclamo);
    }
}
