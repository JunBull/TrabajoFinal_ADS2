package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.SupervisorDeLogisticaDTO;
import com.TrabajoFinal_ADS2.modelo.SupervisorDeLogistica;
import com.TrabajoFinal_ADS2.repository.SupervisorDeLogisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupervisorDeLogisticaService {

    @Autowired
    SupervisorDeLogisticaRepository supervisorDeLogisticaRepository;

    public void guardarSupervisorDeLogistica(SupervisorDeLogisticaDTO supervisorDeLogisticaDTO){
        SupervisorDeLogistica supervisorDeLogistica = new SupervisorDeLogistica(
                supervisorDeLogisticaDTO.getNombre_SupervisorDeLogistica(),
                supervisorDeLogisticaDTO.getApellido_SupervisorDeLogistica(),
                supervisorDeLogisticaDTO.getCorreo_SupervisorDeLogistica(),
                supervisorDeLogisticaDTO.getTelefono_SupervisorDeLogistica(),
                supervisorDeLogisticaDTO.getDni_SupervisorDeLogistica(),
                supervisorDeLogisticaDTO.getUsuario()
        );
        supervisorDeLogisticaRepository.save(supervisorDeLogistica);
    }
}
