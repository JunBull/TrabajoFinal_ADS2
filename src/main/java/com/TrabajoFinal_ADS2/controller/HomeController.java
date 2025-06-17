package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.modelo.Usuario;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model, Authentication authentication) {
        String username = authentication.getName();
        model.addAttribute("usuario", username);

        // Validar roles y redirigir a la vista correspondiente
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            String rol = authority.getAuthority();

            switch (rol) {
                case "ROL_VENDEDOR":
                    return "home_vendedor";
                case "ROL_SUPERVISOR_DE_VENTA":
                    return "home_supervisorDeVenta";
                case "ROL_SUPERVISOR_DE_COMPRA":
                    return "home_supervisorDeCompra";
                case "ROL_TRANSPORTISTA":
                    return "home_transportista";
                case "ROL_ADMINISTRADOR":
                    return "home_administrador";
                case "ROL_ATENCION_AL_CLIENTE":
                    return "home_atencionAlCliente";
                case "ROL_SUPERVISOR_DE_LOGISTICA":
                    return "home_supervisorDeLogistica";
                case "ROL_PROVEEDOR":
                    return "home_proveedor";
            }
        }
        return "home_generico";
    }
}
