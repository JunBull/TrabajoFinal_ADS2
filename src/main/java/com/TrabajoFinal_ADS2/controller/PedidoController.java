package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.PedidoDTO;
import com.TrabajoFinal_ADS2.modelo.Cliente;
import com.TrabajoFinal_ADS2.modelo.Pedido;
import com.TrabajoFinal_ADS2.modelo.Producto;
import com.TrabajoFinal_ADS2.modelo.Vendedor;
import com.TrabajoFinal_ADS2.repository.ClienteRepository;
import com.TrabajoFinal_ADS2.repository.PedidoRepository;
import com.TrabajoFinal_ADS2.repository.ProductoRepository;
import com.TrabajoFinal_ADS2.repository.VendedorRepository;
import com.TrabajoFinal_ADS2.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VendedorRepository vendedorRepository;


    @ModelAttribute("pedido")
    public PedidoDTO retornarNuevoPedidoDTO(){
        return new PedidoDTO();
    }

    @GetMapping("/home/registroNuevoPedido")
    public String mostrarFormularioDeRegistro(Model model){
        List<Producto> productos = productoRepository.findAll();
        List<Cliente> clientes = clienteRepository.findAll();
        List<Vendedor> vendedores = vendedorRepository.findAll();
        model.addAttribute("productos", productos);
        model.addAttribute("clientes", clientes);
        model.addAttribute("vendedores", vendedores);
        return "registroNuevoPedido";
    }

    @PostMapping("/home/registroNuevoPedido")
    public String registrarNuevoPedido(@ModelAttribute("pedido") PedidoDTO PedidoDTO){
        pedidoService.guardarPedido1(PedidoDTO);
        return "redirect:/home/registroNuevoPedido?exito";
    }
}
