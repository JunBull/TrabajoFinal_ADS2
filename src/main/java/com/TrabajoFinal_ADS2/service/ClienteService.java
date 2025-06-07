package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.ClienteDTO;
import com.TrabajoFinal_ADS2.modelo.Cliente;
import com.TrabajoFinal_ADS2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void guardarCliente(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente(
                clienteDTO.getNombre_Cliente(),
                clienteDTO.getApellido_Cliente(),
                clienteDTO.getTelefono_Cliente(),
                clienteDTO.getEmpresa_Cliente()
        );
        clienteRepository.save(cliente);
    }
}
