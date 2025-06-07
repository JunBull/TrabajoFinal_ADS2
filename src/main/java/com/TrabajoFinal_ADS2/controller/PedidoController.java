package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.PedidoDTO;
import com.TrabajoFinal_ADS2.modelo.Pedido;
import com.TrabajoFinal_ADS2.repository.PedidoRepository;
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
    private PedidoRepository pedidoRepository;

    @ModelAttribute("pedido")
    public PedidoDTO retornarNuevoPedidoDTO(){
        return new PedidoDTO();
    }

    @GetMapping("/registroNuevoPedido")
    public String mostrarFormularioDeRegistro(Model model){
        List<Pedido> pedidos = pedidoRepository.findAll();
        model.addAttribute("pedidos", pedidos);
        return "registroNuevoPedido";
    }

    @PostMapping("/registroNuevoPedido")
    public String registrarNuevoPedido(@ModelAttribute("pedido") PedidoDTO PedidoDTO){
        pedidoService.guardarPedido(PedidoDTO);
        return "redirect:/registroNuevoPedido?exito";
    }
}
