package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.RolDTO;
import com.TrabajoFinal_ADS2.modelo.Rol;
import com.TrabajoFinal_ADS2.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public void guardarRol(RolDTO rolDTO){
        Rol rol = new Rol(
                rolDTO.getNombre()
        );
        rolRepository.save(rol);
    }
}
