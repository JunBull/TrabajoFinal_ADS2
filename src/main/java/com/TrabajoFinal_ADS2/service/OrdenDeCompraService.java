package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.OrdenDeCompraDTO;
import com.TrabajoFinal_ADS2.modelo.OrdenDeCompra;
import com.TrabajoFinal_ADS2.repository.OrdenDeCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenDeCompraService {

    @Autowired
    OrdenDeCompraRepository ordenDeCompraRepository;

    public void guardarOrdenDeCompra(OrdenDeCompraDTO ordenDeCompraDTO){
        OrdenDeCompra ordenDeCompra = new OrdenDeCompra(
                ordenDeCompraDTO.getCantidad_OrdenDeCompra(),
                ordenDeCompraDTO.getProducto(),
                ordenDeCompraDTO.getSupervisorDeVenta(),
                ordenDeCompraDTO.getProveedor(),
                ordenDeCompraDTO.isConfirmacionProveedor(),
                ordenDeCompraDTO.getFechaEntrega_OrdenDeCompra(),
                ordenDeCompraDTO.getClpSenasa_OrdenDeCompra(),
                ordenDeCompraDTO.getEstado_OrdenDeCompra()
        );
        ordenDeCompraRepository.save(ordenDeCompra);
    }
}
