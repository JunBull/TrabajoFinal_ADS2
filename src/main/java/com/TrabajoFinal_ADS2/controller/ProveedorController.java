package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.ProveedorDTO;
import com.TrabajoFinal_ADS2.dto.UsuarioRegistroDTO;
import com.TrabajoFinal_ADS2.modelo.Usuario;
import com.TrabajoFinal_ADS2.repository.UsuarioRepository;
import com.TrabajoFinal_ADS2.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @ModelAttribute("proveedor")
    public ProveedorDTO retornarNuevoProveedorDTO(){
        return new ProveedorDTO();
    }

    @GetMapping("/registroNuevoProveedor")
    public String mostrarFormularioDeRegistro(Model model){
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "registroNuevoProveedor";
    }

    @PostMapping("/registroNuevoProveedor")
    public String registrarNuevoProveedor(@ModelAttribute("proveedor") ProveedorDTO proveedorDTO){
        proveedorService.guardarProveedor(proveedorDTO);
        return "redirect:/registroNuevoProveedor?exito";
    }
}
