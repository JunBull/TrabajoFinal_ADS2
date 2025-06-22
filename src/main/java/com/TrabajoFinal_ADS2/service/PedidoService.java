package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.PedidoDTO;
import com.TrabajoFinal_ADS2.modelo.Pedido;
import com.TrabajoFinal_ADS2.modelo.Producto;
import com.TrabajoFinal_ADS2.repository.PedidoRepository;
import com.TrabajoFinal_ADS2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    public void guardarPedido1(PedidoDTO pedidoDTO){
        Producto producto = productoRepository.getReferenceById(pedidoDTO.getId_Pedido());

        double montototal = producto.getPrecioPorKilo_Producto()*1000*pedidoDTO.getCantidad_Pedido();

        Pedido pedido = new Pedido(
                pedidoDTO.getFecha_Pedido(),
                pedidoDTO.getProducto(),
                pedidoDTO.getCantidad_Pedido(),
                montototal,
                pedidoDTO.getVendedor(),
                pedidoDTO.getCliente(),
                pedidoDTO.getSupervisorDeVenta(),
                pedidoDTO.getFechaAprobacion_Pedido(),
                pedidoDTO.getTipoVariedad(),
                pedidoDTO.getPlanta()
        );
        pedidoRepository.save(pedido);
    }
}
