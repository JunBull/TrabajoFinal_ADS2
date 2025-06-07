package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.ProductoDTO;
import com.TrabajoFinal_ADS2.modelo.Producto;
import com.TrabajoFinal_ADS2.modelo.Proveedor;
import com.TrabajoFinal_ADS2.repository.ProductoRepository;
import com.TrabajoFinal_ADS2.repository.ProveedorRepository;
import com.TrabajoFinal_ADS2.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProveedorRepository proveedorRepository;

    @ModelAttribute("producto")
    public ProductoDTO retornarNuevoProductoDTO(){
        return new ProductoDTO();
    }

    @GetMapping("/registroNuevoProducto")
    public String mostrarFormularioDeRegistro(Model model){
        List<Proveedor> proveedores = proveedorRepository.findAll();
        model.addAttribute("proveedores", proveedores);
        return "registroNuevoProducto";
    }

    @PostMapping("/registroNuevoProducto")
    public String registrarNuevoProducto(@ModelAttribute("producto") ProductoDTO ProductoDTO){
        productoService.guardarProducto(ProductoDTO);
        return "redirect:/registroNuevoProducto?exito";
    }
}
