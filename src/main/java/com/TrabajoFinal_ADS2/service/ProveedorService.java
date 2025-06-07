package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.ProveedorDTO;
import com.TrabajoFinal_ADS2.modelo.Proveedor;
import com.TrabajoFinal_ADS2.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public void guardarProveedor(ProveedorDTO proveedorDTO){
        Proveedor proveedor = new Proveedor(
                proveedorDTO.getNombre_Proveedor(),
                proveedorDTO.getApellido_Proveedor(),
                proveedorDTO.getUbicacion_Proveedor(),
                proveedorDTO.getEstado_Proveedor(),
                proveedorDTO.getUsuario()
        );
        proveedorRepository.save(proveedor);
    }
}
