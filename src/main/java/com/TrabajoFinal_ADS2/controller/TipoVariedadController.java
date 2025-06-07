package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.TipoVariedadDTO;
import com.TrabajoFinal_ADS2.modelo.TipoVariedad;
import com.TrabajoFinal_ADS2.modelo.Usuario;
import com.TrabajoFinal_ADS2.repository.TipoVariedadRepository;
import com.TrabajoFinal_ADS2.repository.UsuarioRepository;
import com.TrabajoFinal_ADS2.service.TipoVariedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TipoVariedadController {

    @Autowired
    private TipoVariedadService tipoVariedadService;

    @Autowired
    private TipoVariedadRepository tipoVariedadRepository;

    @ModelAttribute("tipoVariedad")
    public TipoVariedadDTO retornarNuevoTipoVariedadDTO(){
        return new TipoVariedadDTO();
    }

    @GetMapping("/registroNuevoTipoVariedad")
    public String mostrarFormularioDeRegistro(Model model){
        List<TipoVariedad> tipoVariedades = tipoVariedadRepository.findAll();
        model.addAttribute("tipoVariedades", tipoVariedades);
        return "registroNuevoTipoVariedad";
    }

    @PostMapping("/registroNuevoTipoVariedad")
    public String registrarNuevoTipoVariedad(@ModelAttribute("tipoVariedad") TipoVariedadDTO tipoVariedadDTO){
        tipoVariedadService.guardarTipoVariedad(tipoVariedadDTO);
        return "redirect:/registroNuevoTipoVariedad?exito";
    }
}
