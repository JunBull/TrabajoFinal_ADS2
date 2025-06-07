package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.Usuario;

public class SupervisorDeVentaDTO {
    private Long id_SupervisorDeVenta;

    private String nombre_SupervisorDeVenta;

    private String apellido_SupervisorDeVenta;

    private String correo_SupervisorDeVenta;

    private String telefono_SupervisorDeVenta;

    private String dni_SupervisorDeVenta;

    private Usuario usuario;

    public SupervisorDeVentaDTO() {
    }

    public SupervisorDeVentaDTO(String nombre_SupervisorDeVenta, String apellido_SupervisorDeVenta, String correo_SupervisorDeVenta, String telefono_SupervisorDeVenta, String dni_SupervisorDeVenta, Usuario usuario) {
        this.nombre_SupervisorDeVenta = nombre_SupervisorDeVenta;
        this.apellido_SupervisorDeVenta = apellido_SupervisorDeVenta;
        this.correo_SupervisorDeVenta = correo_SupervisorDeVenta;
        this.telefono_SupervisorDeVenta = telefono_SupervisorDeVenta;
        this.dni_SupervisorDeVenta = dni_SupervisorDeVenta;
        this.usuario = usuario;
    }

    public SupervisorDeVentaDTO(Long id_SupervisorDeVenta, String nombre_SupervisorDeVenta, String apellido_SupervisorDeVenta, String correo_SupervisorDeVenta, String telefono_SupervisorDeVenta, String dni_SupervisorDeVenta, Usuario usuario) {
        this.id_SupervisorDeVenta = id_SupervisorDeVenta;
        this.nombre_SupervisorDeVenta = nombre_SupervisorDeVenta;
        this.apellido_SupervisorDeVenta = apellido_SupervisorDeVenta;
        this.correo_SupervisorDeVenta = correo_SupervisorDeVenta;
        this.telefono_SupervisorDeVenta = telefono_SupervisorDeVenta;
        this.dni_SupervisorDeVenta = dni_SupervisorDeVenta;
        this.usuario = usuario;
    }

    public Long getId_SupervisorDeVenta() {
        return id_SupervisorDeVenta;
    }

    public void setId_SupervisorDeVenta(Long id_SupervisorDeVenta) {
        this.id_SupervisorDeVenta = id_SupervisorDeVenta;
    }

    public String getNombre_SupervisorDeVenta() {
        return nombre_SupervisorDeVenta;
    }

    public void setNombre_SupervisorDeVenta(String nombre_SupervisorDeVenta) {
        this.nombre_SupervisorDeVenta = nombre_SupervisorDeVenta;
    }

    public String getApellido_SupervisorDeVenta() {
        return apellido_SupervisorDeVenta;
    }

    public void setApellido_SupervisorDeVenta(String apellido_SupervisorDeVenta) {
        this.apellido_SupervisorDeVenta = apellido_SupervisorDeVenta;
    }

    public String getCorreo_SupervisorDeVenta() {
        return correo_SupervisorDeVenta;
    }

    public void setCorreo_SupervisorDeVenta(String correo_SupervisorDeVenta) {
        this.correo_SupervisorDeVenta = correo_SupervisorDeVenta;
    }

    public String getTelefono_SupervisorDeVenta() {
        return telefono_SupervisorDeVenta;
    }

    public void setTelefono_SupervisorDeVenta(String telefono_SupervisorDeVenta) {
        this.telefono_SupervisorDeVenta = telefono_SupervisorDeVenta;
    }

    public String getDni_SupervisorDeVenta() {
        return dni_SupervisorDeVenta;
    }

    public void setDni_SupervisorDeVenta(String dni_SupervisorDeVenta) {
        this.dni_SupervisorDeVenta = dni_SupervisorDeVenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
