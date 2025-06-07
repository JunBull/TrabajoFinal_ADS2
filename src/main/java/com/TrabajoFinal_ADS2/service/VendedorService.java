package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.VendedorDTO;
import com.TrabajoFinal_ADS2.modelo.Vendedor;
import com.TrabajoFinal_ADS2.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public void guardarVendedor(VendedorDTO vendedorDTO){
        Vendedor vendedor = new Vendedor(
                vendedorDTO.getNombre_Vendedor(),
                vendedorDTO.getApellido_Vendedor(),
                vendedorDTO.getCorreo_Vendedor(),
                vendedorDTO.getTelefono_Vendedor(),
                vendedorDTO.getDni_Vendedor(),
                vendedorDTO.getUsuario()
        );
        vendedorRepository.save(vendedor);
    }
}
