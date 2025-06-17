package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.ClienteDTO;
import com.TrabajoFinal_ADS2.dto.ProveedorDTO;
import com.TrabajoFinal_ADS2.modelo.Cliente;
import com.TrabajoFinal_ADS2.modelo.Usuario;
import com.TrabajoFinal_ADS2.repository.ClienteRepository;
import com.TrabajoFinal_ADS2.repository.UsuarioRepository;
import com.TrabajoFinal_ADS2.service.ClienteService;
import com.TrabajoFinal_ADS2.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteRepository clienteRepository;

    @ModelAttribute("cliente")
    public ClienteDTO retornarNuevoClienteDTO(){
        return new ClienteDTO();
    }

    @GetMapping("/home/registroNuevoCliente")
    public String mostrarFormularioDeRegistro(Model model){
        List<Cliente> clientes = clienteRepository.findAll();
        model.addAttribute("clientes", clientes);
        return "registroNuevoCliente";
    }

    @PostMapping("/home/registroNuevoCliente")
    public String registrarNuevoCliente(@ModelAttribute("cliente") ClienteDTO clienteDTO){
        clienteService.guardarCliente(clienteDTO);
        return "redirect:/home/registroNuevoCliente?exito";
    }
}
