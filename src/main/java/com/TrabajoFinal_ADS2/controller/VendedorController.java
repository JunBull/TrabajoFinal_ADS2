package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.VendedorDTO;
import com.TrabajoFinal_ADS2.modelo.Usuario;
import com.TrabajoFinal_ADS2.modelo.Vendedor;
import com.TrabajoFinal_ADS2.repository.UsuarioRepository;
import com.TrabajoFinal_ADS2.repository.VendedorRepository;
import com.TrabajoFinal_ADS2.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @ModelAttribute("vendedor")
    public VendedorDTO retornarNuevoVendedorDTO(){
        return new VendedorDTO();
    }

    @GetMapping("/registroNuevoVendedor")
    public String mostrarFormularioDeRegistro(Model model){
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "registroNuevoVendedor";
    }

    @PostMapping("/registroNuevoVendedor")
    public String registrarNuevoVendedor(@ModelAttribute("vendedor") VendedorDTO vendedorDTO){
        vendedorService.guardarVendedor(vendedorDTO);
        return "redirect:/registroNuevoVendedor?exito";
    }
}
