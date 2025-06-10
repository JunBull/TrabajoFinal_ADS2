package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.ReclamoDTO;
import com.TrabajoFinal_ADS2.modelo.Reclamo;
import com.TrabajoFinal_ADS2.repository.ReclamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamoService {

    @Autowired
    ReclamoRepository reclamoRepository;

    public void guardarReclamo(ReclamoDTO reclamoDTO){
        Reclamo reclamo = new Reclamo(
                reclamoDTO.getDescripcion_Reclamo(),
                reclamoDTO.getEstado_Reclamo(),
                reclamoDTO.getTipoReclamo(),
                reclamoDTO.getAtencionAlCliente(),
                reclamoDTO.getCliente()
        );
        reclamoRepository.save(reclamo);
    }
}
