package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Administrador;

    @Column(nullable = false)
    private String nombre_Administrador;

    @Column(nullable = false)
    private String apellido_Administrador;

    @Column(nullable = false)
    private String correo_Administrador;

    @Column(nullable = false)
    private String telefono_Administrador;

    @Column(nullable = false)
    private String dni_Administrador;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public Administrador() {
    }

    public Administrador(String nombre_Administrador, String apellido_Administrador, String correo_Administrador, String telefono_Administrador, String dni_Administrador, Usuario usuario) {
        this.nombre_Administrador = nombre_Administrador;
        this.apellido_Administrador = apellido_Administrador;
        this.correo_Administrador = correo_Administrador;
        this.telefono_Administrador = telefono_Administrador;
        this.dni_Administrador = dni_Administrador;
        this.usuario = usuario;
    }

    public Administrador(Long id_Administrador, String nombre_Administrador, String apellido_Administrador, String correo_Administrador, String telefono_Administrador, String dni_Administrador, Usuario usuario) {
        this.id_Administrador = id_Administrador;
        this.nombre_Administrador = nombre_Administrador;
        this.apellido_Administrador = apellido_Administrador;
        this.correo_Administrador = correo_Administrador;
        this.telefono_Administrador = telefono_Administrador;
        this.dni_Administrador = dni_Administrador;
        this.usuario = usuario;
    }

    public Long getId_Administrador() {
        return id_Administrador;
    }

    public void setId_Administrador(Long id_Administrador) {
        this.id_Administrador = id_Administrador;
    }

    public String getNombre_Administrador() {
        return nombre_Administrador;
    }

    public void setNombre_Administrador(String nombre_Administrador) {
        this.nombre_Administrador = nombre_Administrador;
    }

    public String getApellido_Administrador() {
        return apellido_Administrador;
    }

    public void setApellido_Administrador(String apellido_Administrador) {
        this.apellido_Administrador = apellido_Administrador;
    }

    public String getCorreo_Administrador() {
        return correo_Administrador;
    }

    public void setCorreo_Administrador(String correo_Administrador) {
        this.correo_Administrador = correo_Administrador;
    }

    public String getTelefono_Administrador() {
        return telefono_Administrador;
    }

    public void setTelefono_Administrador(String telefono_Administrador) {
        this.telefono_Administrador = telefono_Administrador;
    }

    public String getDni_Administrador() {
        return dni_Administrador;
    }

    public void setDni_Administrador(String dni_Administrador) {
        this.dni_Administrador = dni_Administrador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
