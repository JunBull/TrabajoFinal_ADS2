package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.AdministradorDTO;
import com.TrabajoFinal_ADS2.modelo.Administrador;
import com.TrabajoFinal_ADS2.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {

    @Autowired
    AdministradorRepository administradorRepository;

    public void guardarAdministrador(AdministradorDTO administradorDTO){
        Administrador administrador = new Administrador(
                administradorDTO.getNombre_Administrador(),
                administradorDTO.getApellido_Administrador(),
                administradorDTO.getCorreo_Administrador(),
                administradorDTO.getTelefono_Administrador(),
                administradorDTO.getDni_Administrador(),
                administradorDTO.getUsuario()
        );
        administradorRepository.save(administrador);
    }
}
