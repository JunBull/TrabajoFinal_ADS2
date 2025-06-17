package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.UsuarioRegistroDTO;
import com.TrabajoFinal_ADS2.modelo.Proveedor;
import com.TrabajoFinal_ADS2.modelo.Rol;
import com.TrabajoFinal_ADS2.repository.RolRepository;
import com.TrabajoFinal_ADS2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolRepository rolRepository;

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String mostrarFormularioDeRegistro(Model model){
        List<Rol> roles = rolRepository.findAll();
        model.addAttribute("roles", roles);
        return "registro";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO usuarioRegistroDTO){
        usuarioService.guardarUsuario(usuarioRegistroDTO);
        return "redirect:/home";
    }
}
