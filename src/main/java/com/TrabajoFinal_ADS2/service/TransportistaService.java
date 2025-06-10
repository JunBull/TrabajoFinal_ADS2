package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.TransportistaDTO;
import com.TrabajoFinal_ADS2.modelo.Transportista;
import com.TrabajoFinal_ADS2.repository.TransportistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportistaService {

    @Autowired
    TransportistaRepository transportistaRepository;

    public void guardarTransportista(TransportistaDTO transportistaDTO){
        Transportista transportista = new Transportista(
                transportistaDTO.getNombre_Transportista(),
                transportistaDTO.getApellido_Transportista(),
                transportistaDTO.getCorreo_Transportista(),
                transportistaDTO.getTelefono_Transportista(),
                transportistaDTO.getDni_Transportista(),
                transportistaDTO.getUsuario()
        );
        transportistaRepository.save(transportista);
    }
}
