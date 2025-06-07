package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.Usuario;

public class ProveedorDTO {
    private Long id_Proveedor;

    private String nombre_Proveedor;

    private String apellido_Proveedor;

    private String ubicacion_Proveedor;

    private String estado_Proveedor;

    private Usuario usuario;

    public ProveedorDTO() {
    }

    public ProveedorDTO(Long id_Proveedor, String nombre_Proveedor, String apellido_Proveedor, String ubicacion_Proveedor, String estado_Proveedor, Usuario usuario) {
        this.id_Proveedor = id_Proveedor;
        this.nombre_Proveedor = nombre_Proveedor;
        this.apellido_Proveedor = apellido_Proveedor;
        this.ubicacion_Proveedor = ubicacion_Proveedor;
        this.estado_Proveedor = estado_Proveedor;
        this.usuario = usuario;
    }

    public ProveedorDTO(String nombre_Proveedor, String apellido_Proveedor, String ubicacion_Proveedor, String estado_Proveedor,Usuario usuario) {
        this.nombre_Proveedor = nombre_Proveedor;
        this.apellido_Proveedor = apellido_Proveedor;
        this.ubicacion_Proveedor = ubicacion_Proveedor;
        this.estado_Proveedor = estado_Proveedor;
        this.usuario = usuario;
    }

    public Long getId_Proveedor() {
        return id_Proveedor;
    }

    public void setId_Proveedor(Long id_Proveedor) {
        this.id_Proveedor = id_Proveedor;
    }

    public String getNombre_Proveedor() {
        return nombre_Proveedor;
    }

    public void setNombre_Proveedor(String nombre_Proveedor) {
        this.nombre_Proveedor = nombre_Proveedor;
    }

    public String getApellido_Proveedor() {
        return apellido_Proveedor;
    }

    public void setApellido_Proveedor(String apellido_Proveedor) {
        this.apellido_Proveedor = apellido_Proveedor;
    }

    public String getUbicacion_Proveedor() {
        return ubicacion_Proveedor;
    }

    public void setUbicacion_Proveedor(String ubicacion_Proveedor) {
        this.ubicacion_Proveedor = ubicacion_Proveedor;
    }

    public String getEstado_Proveedor() {
        return estado_Proveedor;
    }

    public void setEstado_Proveedor(String estado_Proveedor) {
        this.estado_Proveedor = estado_Proveedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
