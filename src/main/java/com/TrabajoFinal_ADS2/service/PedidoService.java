package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.PedidoDTO;
import com.TrabajoFinal_ADS2.modelo.Pedido;
import com.TrabajoFinal_ADS2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void guardarPedido(PedidoDTO pedidoDTO){
        Pedido pedido = new Pedido(
                pedidoDTO.getFecha_Pedido(),
                pedidoDTO.getCantidad_Pedido(),
                pedidoDTO.getmontoTotal_Pedido(),
                pedidoDTO.getVendedor(),
                pedidoDTO.getCliente(),
                pedidoDTO.getSupervisorDeVenta(),
                pedidoDTO.getFechaAprobacion_Pedido(),
                pedidoDTO.getTipoVariedad()
        );
        pedidoRepository.save(pedido);
    }
}
