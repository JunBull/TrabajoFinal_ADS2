package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.Usuario;
import jakarta.persistence.*;

public class SupervisorDeCompraDTO {

    private Long id_SupervisorDeCompra;
    private String nombre_SupervisorDeCompra;
    private String apellido_SupervisorDeCompra;
    private String correo_SupervisorDeCompra;
    private String telefono_SupervisorDeCompra;
    private String dni_SupervisorDeCompra;
    private Usuario usuario;

    public SupervisorDeCompraDTO() {
    }

    public SupervisorDeCompraDTO(String nombre_SupervisorDeCompra, String apellido_SupervisorDeCompra, String correo_SupervisorDeCompra, String telefono_SupervisorDeCompra, String dni_SupervisorDeCompra, Usuario usuario) {
        this.nombre_SupervisorDeCompra = nombre_SupervisorDeCompra;
        this.apellido_SupervisorDeCompra = apellido_SupervisorDeCompra;
        this.correo_SupervisorDeCompra = correo_SupervisorDeCompra;
        this.telefono_SupervisorDeCompra = telefono_SupervisorDeCompra;
        this.dni_SupervisorDeCompra = dni_SupervisorDeCompra;
        this.usuario = usuario;
    }

    public SupervisorDeCompraDTO(Long id_SupervisorDeCompra, String nombre_SupervisorDeCompra, String apellido_SupervisorDeCompra, String correo_SupervisorDeCompra, String telefono_SupervisorDeCompra, String dni_SupervisorDeCompra, Usuario usuario) {
        this.id_SupervisorDeCompra = id_SupervisorDeCompra;
        this.nombre_SupervisorDeCompra = nombre_SupervisorDeCompra;
        this.apellido_SupervisorDeCompra = apellido_SupervisorDeCompra;
        this.correo_SupervisorDeCompra = correo_SupervisorDeCompra;
        this.telefono_SupervisorDeCompra = telefono_SupervisorDeCompra;
        this.dni_SupervisorDeCompra = dni_SupervisorDeCompra;
        this.usuario = usuario;
    }

    public Long getId_SupervisorDeCompra() {
        return id_SupervisorDeCompra;
    }

    public void setId_SupervisorDeCompra(Long id_SupervisorDeCompra) {
        this.id_SupervisorDeCompra = id_SupervisorDeCompra;
    }

    public String getNombre_SupervisorDeCompra() {
        return nombre_SupervisorDeCompra;
    }

    public void setNombre_SupervisorDeCompra(String nombre_SupervisorDeCompra) {
        this.nombre_SupervisorDeCompra = nombre_SupervisorDeCompra;
    }

    public String getApellido_SupervisorDeCompra() {
        return apellido_SupervisorDeCompra;
    }

    public void setApellido_SupervisorDeCompra(String apellido_SupervisorDeCompra) {
        this.apellido_SupervisorDeCompra = apellido_SupervisorDeCompra;
    }

    public String getCorreo_SupervisorDeCompra() {
        return correo_SupervisorDeCompra;
    }

    public void setCorreo_SupervisorDeCompra(String correo_SupervisorDeCompra) {
        this.correo_SupervisorDeCompra = correo_SupervisorDeCompra;
    }

    public String getTelefono_SupervisorDeCompra() {
        return telefono_SupervisorDeCompra;
    }

    public void setTelefono_SupervisorDeCompra(String telefono_SupervisorDeCompra) {
        this.telefono_SupervisorDeCompra = telefono_SupervisorDeCompra;
    }

    public String getDni_SupervisorDeCompra() {
        return dni_SupervisorDeCompra;
    }

    public void setDni_SupervisorDeCompra(String dni_SupervisorDeCompra) {
        this.dni_SupervisorDeCompra = dni_SupervisorDeCompra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
