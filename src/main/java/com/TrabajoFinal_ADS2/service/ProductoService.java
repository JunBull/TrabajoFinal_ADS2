package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.ProductoDTO;
import com.TrabajoFinal_ADS2.modelo.Producto;
import com.TrabajoFinal_ADS2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public void guardarProducto(ProductoDTO productoDTO){
        Producto producto = new Producto(
                productoDTO.getNombre_Producto(),
                productoDTO.getPrecioPorKilo_Producto(),
                productoDTO.getProveedor()
        );
        productoRepository.save(producto);
    }
}
