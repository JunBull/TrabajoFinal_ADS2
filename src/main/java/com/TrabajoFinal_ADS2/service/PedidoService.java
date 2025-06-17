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

    public void guardarPedido1(PedidoDTO pedidoDTO){
        Pedido pedido = new Pedido(
                pedidoDTO.getFecha_Pedido(),
                pedidoDTO.getProducto(),
                pedidoDTO.getCantidad_Pedido(),
                pedidoDTO.getMontoTotal_Pedido(),
                pedidoDTO.getVendedor(),
                pedidoDTO.getCliente(),
               null,
                null,
                null,
                null
        );
        pedidoRepository.save(pedido);
    }
}
