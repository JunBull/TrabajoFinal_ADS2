package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.SupervisorDeCompraDTO;
import com.TrabajoFinal_ADS2.modelo.SupervisorDeCompra;
import com.TrabajoFinal_ADS2.repository.SupervisorDeCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupervisorDeCompraService {

    @Autowired
    SupervisorDeCompraRepository supervisorDeCompraRepository;

    public void guardarSupervisorDeCompra(SupervisorDeCompraDTO supervisorDeCompraDTO){
        SupervisorDeCompra supervisorDeCompra = new SupervisorDeCompra(
                supervisorDeCompraDTO.getNombre_SupervisorDeCompra(),
                supervisorDeCompraDTO.getApellido_SupervisorDeCompra(),
                supervisorDeCompraDTO.getCorreo_SupervisorDeCompra(),
                supervisorDeCompraDTO.getTelefono_SupervisorDeCompra(),
                supervisorDeCompraDTO.getDni_SupervisorDeCompra(),
                supervisorDeCompraDTO.getUsuario()
        );
        supervisorDeCompraRepository.save(supervisorDeCompra);
    }
}
