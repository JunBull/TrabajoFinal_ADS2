package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.SupervisorDeVentaDTO;
import com.TrabajoFinal_ADS2.modelo.SupervisorDeVenta;
import com.TrabajoFinal_ADS2.repository.SupervisorDeVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupervisorDeVentaService {

    @Autowired
    private SupervisorDeVentaRepository supervisorDeVentaRepository;

    public void guardarSupervisorDeVenta(SupervisorDeVentaDTO supervisorDeVentaDTO){
        SupervisorDeVenta supervisorDeVenta = new SupervisorDeVenta(
                supervisorDeVentaDTO.getNombre_SupervisorDeVenta(),
                supervisorDeVentaDTO.getApellido_SupervisorDeVenta(),
                supervisorDeVentaDTO.getCorreo_SupervisorDeVenta(),
                supervisorDeVentaDTO.getTelefono_SupervisorDeVenta(),
                supervisorDeVentaDTO.getDni_SupervisorDeVenta(),
                supervisorDeVentaDTO.getUsuario()
        );
        supervisorDeVentaRepository.save(supervisorDeVenta);
    }
}
