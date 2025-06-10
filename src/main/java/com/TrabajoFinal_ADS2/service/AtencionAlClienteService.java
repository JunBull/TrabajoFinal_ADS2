package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.AtencionAlClienteDTO;
import com.TrabajoFinal_ADS2.modelo.AtencionAlCliente;
import com.TrabajoFinal_ADS2.repository.AtencionAlClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtencionAlClienteService {

    @Autowired
    AtencionAlClienteRepository atencionAlClienteRepository;

    public void guardarAtencionAlCliente(AtencionAlClienteDTO atencionAlClienteDTO){
        AtencionAlCliente atencionAlCliente = new AtencionAlCliente(
                atencionAlClienteDTO.getNombre_AtencionAlCliente(),
                atencionAlClienteDTO.getApellido_AtencionAlCliente(),
                atencionAlClienteDTO.getCorreo_AtencionAlCliente(),
                atencionAlClienteDTO.getTelefono_AtencionAlCliente(),
                atencionAlClienteDTO.getDni_AtencionAlCliente(),
                atencionAlClienteDTO.getUsuario()
        );
        atencionAlClienteRepository.save(atencionAlCliente);
    }
}
