package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "atencion_al_cliente")
public class AtencionAlCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_AtencionAlCliente;

    @Column(nullable = false)
    private String nombre_AtencionAlCliente;

    @Column(nullable = false)
    private String apellido_AtencionAlCliente;

    @Column(nullable = false)
    private String correo_AtencionAlCliente;

    @Column(nullable = false)
    private String telefono_AtencionAlCliente;

    @Column(nullable = false)
    private String dni_AtencionAlCliente;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public AtencionAlCliente() {
    }

    public AtencionAlCliente(String nombre_AtencionAlCliente, String apellido_AtencionAlCliente, String correo_AtencionAlCliente, String telefono_AtencionAlCliente, String dni_AtencionAlCliente, Usuario usuario) {
        this.nombre_AtencionAlCliente = nombre_AtencionAlCliente;
        this.apellido_AtencionAlCliente = apellido_AtencionAlCliente;
        this.correo_AtencionAlCliente = correo_AtencionAlCliente;
        this.telefono_AtencionAlCliente = telefono_AtencionAlCliente;
        this.dni_AtencionAlCliente = dni_AtencionAlCliente;
        this.usuario = usuario;
    }

    public AtencionAlCliente(Long id_AtencionAlCliente, String nombre_AtencionAlCliente, String apellido_AtencionAlCliente, String correo_AtencionAlCliente, String telefono_AtencionAlCliente, String dni_AtencionAlCliente, Usuario usuario) {
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
