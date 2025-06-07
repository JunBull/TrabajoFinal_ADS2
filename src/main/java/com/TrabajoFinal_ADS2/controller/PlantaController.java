package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.PlantaDTO;
import com.TrabajoFinal_ADS2.modelo.Planta;
import com.TrabajoFinal_ADS2.repository.PlantaRepository;
import com.TrabajoFinal_ADS2.service.PlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PlantaController {

    @Autowired
    private PlantaService plantaService;

    @Autowired
    private PlantaRepository plantaRepository;

    @ModelAttribute("planta")
    public PlantaDTO retornarNuevoPlantaDTO(){
        return new PlantaDTO();
    }

    @GetMapping("/registroNuevoPlanta")
    public String mostrarFormularioDeRegistro(Model model){
        List<Planta> plantas = plantaRepository.findAll();
        model.addAttribute("plantas", plantas);
        return "registroNuevoPlanta";
    }

    @PostMapping("/registroNuevoPlanta")
    public String registrarNuevoPlanta(@ModelAttribute("planta") PlantaDTO PlantaDTO){
        plantaService.guardarPlanta(PlantaDTO);
        return "redirect:/registroNuevoPlanta?exito";
    }
}
