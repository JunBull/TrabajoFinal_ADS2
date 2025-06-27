package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.PedidoDTO;
import com.TrabajoFinal_ADS2.modelo.*;
import com.TrabajoFinal_ADS2.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private VendedorRepository vendedorRepository;
    @Autowired
    private SupervisorDeVentaRepository supervisorDeVentaRepository;
    @Autowired
    private TipoVariedadRepository tipoVariedadRepository;
    @Autowired
    private PlantaRepository plantaRepository;

    public void editarPedido1(Long id, PedidoDTO pedidoDTO){
        Producto producto = productoRepository.findById(pedidoDTO.getIdProducto()).orElse(null);
        Cliente cliente = clienteRepository.findById(pedidoDTO.getIdCliente()).orElse(null);
        Vendedor vendedor = vendedorRepository.findById(pedidoDTO.getIdVendedor()).orElse(null);

        Optional<Pedido> pedidoOpt = pedidoRepository.findById(id);

        if (pedidoOpt.isPresent()) {
            Pedido pedido = pedidoOpt.get();

            pedido.setFecha_Pedido(pedidoDTO.getFecha_Pedido());
            pedido.setProducto(producto);
            pedido.setCantidad_Pedido(pedidoDTO.getCantidad_Pedido());
            pedido.setVendedor(vendedor);
            pedido.setCliente(cliente);

            pedidoRepository.save(pedido);
        } else {
            throw new IllegalArgumentException("Pedido no encontrado con ID: " + id);
        }
    }

    public void editarPedido2(Long id, PedidoDTO pedidoDTO){
        SupervisorDeVenta supervisorDeVenta = supervisorDeVentaRepository.findById(pedidoDTO.getIdSupervisorDeVenta()).orElse(null);
        TipoVariedad tipoVariedad = tipoVariedadRepository.findById(pedidoDTO.getIdTipoVariedad()).orElse(null);
        Planta planta = plantaRepository.findById(pedidoDTO.getIdPlanta()).orElse(null);

        Optional<Pedido> pedidoOpt = pedidoRepository.findById(id);

        if (pedidoOpt.isPresent()) {
            Pedido pedido = pedidoOpt.get();

            pedido.setSupervisorDeVenta(supervisorDeVenta);
            pedido.setFechaAprobacion_Pedido(pedidoDTO.getFechaAprobacion_Pedido());
            pedido.setTipoVariedad(tipoVariedad);
            pedido.setPlanta(planta);

            pedidoRepository.save(pedido);
        } else {
            throw new IllegalArgumentException("Pedido no encontrado con ID: " + id);
        }
    }

    public void guardarPedido1(PedidoDTO pedidoDTO){
        Producto producto = productoRepository.findById(pedidoDTO.getIdProducto()).orElse(null);
        Cliente cliente = clienteRepository.findById(pedidoDTO.getIdCliente()).orElse(null);
        Vendedor vendedor = vendedorRepository.findById(pedidoDTO.getIdVendedor()).orElse(null);

        double montototal = producto.getPrecioPorKilo_Producto()*1000*pedidoDTO.getCantidad_Pedido();

        Pedido pedido = new Pedido(
                pedidoDTO.getFecha_Pedido(),
                producto,
                pedidoDTO.getCantidad_Pedido(),
                montototal,
                vendedor,
                cliente,
                null,
                null,
                null,
                null
        );
        pedidoRepository.save(pedido);
    }
}
