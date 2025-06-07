package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.Usuario;

public class VendedorDTO {
    private Long id_Vendedor;

    private String nombre_Vendedor;

    private String apellido_Vendedor;

    private String correo_Vendedor;

    private String telefono_Vendedor;

    private String dni_Vendedor;

    private Usuario usuario;

    public VendedorDTO() {
    }

    public VendedorDTO(String nombre_Vendedor, String apellido_Vendedor, String correo_Vendedor, String telefono_Vendedor, String dni_Vendedor, Usuario usuario) {
        this.nombre_Vendedor = nombre_Vendedor;
        this.apellido_Vendedor = apellido_Vendedor;
        this.correo_Vendedor = correo_Vendedor;
        this.telefono_Vendedor = telefono_Vendedor;
        this.dni_Vendedor = dni_Vendedor;
        this.usuario = usuario;
    }

    public VendedorDTO(Long id_Vendedor, String nombre_Vendedor, String apellido_Vendedor, String correo_Vendedor, String telefono_Vendedor, String dni_Vendedor, Usuario usuario) {
        this.id_Vendedor = id_Vendedor;
        this.nombre_Vendedor = nombre_Vendedor;
        this.apellido_Vendedor = apellido_Vendedor;
        this.correo_Vendedor = correo_Vendedor;
        this.telefono_Vendedor = telefono_Vendedor;
        this.dni_Vendedor = dni_Vendedor;
        this.usuario = usuario;
    }

    public Long getId_Vendedor() {
        return id_Vendedor;
    }

    public void setId_Vendedor(Long id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }

    public String getNombre_Vendedor() {
        return nombre_Vendedor;
    }

    public void setNombre_Vendedor(String nombre_Vendedor) {
        this.nombre_Vendedor = nombre_Vendedor;
    }

    public String getApellido_Vendedor() {
        return apellido_Vendedor;
    }

    public void setApellido_Vendedor(String apellido_Vendedor) {
        this.apellido_Vendedor = apellido_Vendedor;
    }

    public String getCorreo_Vendedor() {
        return correo_Vendedor;
    }

    public void setCorreo_Vendedor(String correo_Vendedor) {
        this.correo_Vendedor = correo_Vendedor;
    }

    public String getTelefono_Vendedor() {
        return telefono_Vendedor;
    }

    public void setTelefono_Vendedor(String telefono_Vendedor) {
        this.telefono_Vendedor = telefono_Vendedor;
    }

    public String getDni_Vendedor() {
        return dni_Vendedor;
    }

    public void setDni_Vendedor(String dni_Vendedor) {
        this.dni_Vendedor = dni_Vendedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
