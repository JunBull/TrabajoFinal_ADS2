package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.Usuario;

public class TransportistaDTO {
    private Long id_Transportista;
    private String nombre_Transportista;
    private String apellido_Transportista;
    private String correo_Transportista;
    private String telefono_Transportista;
    private String dni_Transportista;
    private Usuario usuario;

    public TransportistaDTO() {
    }

    public TransportistaDTO(String nombre_Transportista, String apellido_Transportista, String correo_Transportista, String telefono_Transportista, String dni_Transportista, Usuario usuario) {
        this.nombre_Transportista = nombre_Transportista;
        this.apellido_Transportista = apellido_Transportista;
        this.correo_Transportista = correo_Transportista;
        this.telefono_Transportista = telefono_Transportista;
        this.dni_Transportista = dni_Transportista;
        this.usuario = usuario;
    }

    public TransportistaDTO(Long id_Transportista, String nombre_Transportista, String apellido_Transportista, String correo_Transportista, String telefono_Transportista, String dni_Transportista, Usuario usuario) {
        this.id_Transportista = id_Transportista;
        this.nombre_Transportista = nombre_Transportista;
        this.apellido_Transportista = apellido_Transportista;
        this.correo_Transportista = correo_Transportista;
        this.telefono_Transportista = telefono_Transportista;
        this.dni_Transportista = dni_Transportista;
        this.usuario = usuario;
    }

    public Long getId_Transportista() {
        return id_Transportista;
    }

    public void setId_Transportista(Long id_Transportista) {
        this.id_Transportista = id_Transportista;
    }

    public String getNombre_Transportista() {
        return nombre_Transportista;
    }

    public void setNombre_Transportista(String nombre_Transportista) {
        this.nombre_Transportista = nombre_Transportista;
    }

    public String getApellido_Transportista() {
        return apellido_Transportista;
    }

    public void setApellido_Transportista(String apellido_Transportista) {
        this.apellido_Transportista = apellido_Transportista;
    }

    public String getCorreo_Transportista() {
        return correo_Transportista;
    }

    public void setCorreo_Transportista(String correo_Transportista) {
        this.correo_Transportista = correo_Transportista;
    }

    public String getTelefono_Transportista() {
        return telefono_Transportista;
    }

    public void setTelefono_Transportista(String telefono_Transportista) {
        this.telefono_Transportista = telefono_Transportista;
    }

    public String getDni_Transportista() {
        return dni_Transportista;
    }

    public void setDni_Transportista(String dni_Transportista) {
        this.dni_Transportista = dni_Transportista;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
