package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.Usuario;

public class AtencionAlClienteDTO {
    private Long id_AtencionAlCliente;
    private String nombre_AtencionAlCliente;
    private String apellido_AtencionAlCliente;
    private String correo_AtencionAlCliente;
    private String telefono_AtencionAlCliente;
    private String dni_AtencionAlCliente;
    private Usuario usuario;

    public AtencionAlClienteDTO() {
    }

    public AtencionAlClienteDTO(String nombre_AtencionAlCliente, String apellido_AtencionAlCliente, String correo_AtencionAlCliente, String telefono_AtencionAlCliente, String dni_AtencionAlCliente, Usuario usuario) {
        this.nombre_AtencionAlCliente = nombre_AtencionAlCliente;
        this.apellido_AtencionAlCliente = apellido_AtencionAlCliente;
        this.correo_AtencionAlCliente = correo_AtencionAlCliente;
        this.telefono_AtencionAlCliente = telefono_AtencionAlCliente;
        this.dni_AtencionAlCliente = dni_AtencionAlCliente;
        this.usuario = usuario;
    }

    public AtencionAlClienteDTO(Long id_AtencionAlCliente, String nombre_AtencionAlCliente, String apellido_AtencionAlCliente, String correo_AtencionAlCliente, String telefono_AtencionAlCliente, String dni_AtencionAlCliente, Usuario usuario) {
        this.id_AtencionAlCliente = id_AtencionAlCliente;
        this.nombre_AtencionAlCliente = nombre_AtencionAlCliente;
        this.apellido_AtencionAlCliente = apellido_AtencionAlCliente;
        this.correo_AtencionAlCliente = correo_AtencionAlCliente;
        this.telefono_AtencionAlCliente = telefono_AtencionAlCliente;
        this.dni_AtencionAlCliente = dni_AtencionAlCliente;
        this.usuario = usuario;
    }

    public Long getId_AtencionAlCliente() {
        return id_AtencionAlCliente;
    }

    public void setId_AtencionAlCliente(Long id_AtencionAlCliente) {
        this.id_AtencionAlCliente = id_AtencionAlCliente;
    }

    public String getNombre_AtencionAlCliente() {
        return nombre_AtencionAlCliente;
    }

    public void setNombre_AtencionAlCliente(String nombre_AtencionAlCliente) {
        this.nombre_AtencionAlCliente = nombre_AtencionAlCliente;
    }

    public String getApellido_AtencionAlCliente() {
        return apellido_AtencionAlCliente;
    }

    public void setApellido_AtencionAlCliente(String apellido_AtencionAlCliente) {
        this.apellido_AtencionAlCliente = apellido_AtencionAlCliente;
    }

    public String getCorreo_AtencionAlCliente() {
        return correo_AtencionAlCliente;
    }

    public void setCorreo_AtencionAlCliente(String correo_AtencionAlCliente) {
        this.correo_AtencionAlCliente = correo_AtencionAlCliente;
    }

    public String getTelefono_AtencionAlCliente() {
        return telefono_AtencionAlCliente;
    }

    public void setTelefono_AtencionAlCliente(String telefono_AtencionAlCliente) {
        this.telefono_AtencionAlCliente = telefono_AtencionAlCliente;
    }

    public String getDni_AtencionAlCliente() {
        return dni_AtencionAlCliente;
    }

    public void setDni_AtencionAlCliente(String dni_AtencionAlCliente) {
        this.dni_AtencionAlCliente = dni_AtencionAlCliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
