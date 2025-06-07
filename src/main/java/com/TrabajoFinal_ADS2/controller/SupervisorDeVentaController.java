package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.SupervisorDeVentaDTO;
import com.TrabajoFinal_ADS2.modelo.SupervisorDeVenta;
import com.TrabajoFinal_ADS2.repository.SupervisorDeVentaRepository;
import com.TrabajoFinal_ADS2.service.SupervisorDeVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class SupervisorDeVentaController {
    
    @Autowired
    private SupervisorDeVentaService supervisorDeVentaService;

    @Autowired
    private SupervisorDeVentaRepository supervisorDeVentaRepository;

    @ModelAttribute("supervisorDeVenta")
    public SupervisorDeVentaDTO retornarNuevoSupervisorDeVentaDTO(){
        return new SupervisorDeVentaDTO();
    }

    @GetMapping("/registroNuevoSupervisorDeVenta")
    public String mostrarFormularioDeRegistro(Model model){
        List<SupervisorDeVenta> supervisorDeVentas = supervisorDeVentaRepository.findAll();
        model.addAttribute("supervisorDeVentas", supervisorDeVentas);
        return "registroNuevoSupervisorDeVenta";
    }

    @PostMapping("/registroNuevoSupervisorDeVenta")
    public String registrarNuevoSupervisorDeVenta(@ModelAttribute("supervisorDeVenta") SupervisorDeVentaDTO SupervisorDeVentaDTO){
        supervisorDeVentaService.guardarSupervisorDeVenta(SupervisorDeVentaDTO);
        return "redirect:/registroNuevoSupervisorDeVenta?exito";
    }
}
