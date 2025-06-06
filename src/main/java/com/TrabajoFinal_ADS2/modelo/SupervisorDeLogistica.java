package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "supervisor_de_logistica")
public class SupervisorDeLogistica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_SupervisorDeLogistica;

    @Column(nullable = false)
    private String nombre_SupervisorDeLogistica;

    @Column(nullable = false)
    private String apellido_SupervisorDeLogistica;

    @Column(nullable = false)
    private String correo_SupervisorDeLogistica;

    @Column(nullable = false)
    private String telefono_SupervisorDeLogistica;

    @Column(nullable = false)
    private String dni_SupervisorDeLogistica;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public SupervisorDeLogistica() {
    }

    public SupervisorDeLogistica(String nombre_SupervisorDeLogistica, String apellido_SupervisorDeLogistica, String correo_SupervisorDeLogistica, String telefono_SupervisorDeLogistica, String dni_SupervisorDeLogistica, Usuario usuario) {
        this.nombre_SupervisorDeLogistica = nombre_SupervisorDeLogistica;
        this.apellido_SupervisorDeLogistica = apellido_SupervisorDeLogistica;
        this.correo_SupervisorDeLogistica = correo_SupervisorDeLogistica;
        this.telefono_SupervisorDeLogistica = telefono_SupervisorDeLogistica;
        this.dni_SupervisorDeLogistica = dni_SupervisorDeLogistica;
        this.usuario = usuario;
    }

    public SupervisorDeLogistica(Long id_SupervisorDeLogistica, String nombre_SupervisorDeLogistica, String apellido_SupervisorDeLogistica, String correo_SupervisorDeLogistica, String telefono_SupervisorDeLogistica, String dni_SupervisorDeLogistica, Usuario usuario) {
        this.id_SupervisorDeLogistica = id_SupervisorDeLogistica;
        this.nombre_SupervisorDeLogistica = nombre_SupervisorDeLogistica;
        this.apellido_SupervisorDeLogistica = apellido_SupervisorDeLogistica;
        this.correo_SupervisorDeLogistica = correo_SupervisorDeLogistica;
        this.telefono_SupervisorDeLogistica = telefono_SupervisorDeLogistica;
        this.dni_SupervisorDeLogistica = dni_SupervisorDeLogistica;
        this.usuario = usuario;
    }

    public Long getId_SupervisorDeLogistica() {
        return id_SupervisorDeLogistica;
    }

    public void setId_SupervisorDeLogistica(Long id_SupervisorDeLogistica) {
        this.id_SupervisorDeLogistica = id_SupervisorDeLogistica;
    }

    public String getNombre_SupervisorDeLogistica() {
        return nombre_SupervisorDeLogistica;
    }

    public void setNombre_SupervisorDeLogistica(String nombre_SupervisorDeLogistica) {
        this.nombre_SupervisorDeLogistica = nombre_SupervisorDeLogistica;
    }

    public String getApellido_SupervisorDeLogistica() {
        return apellido_SupervisorDeLogistica;
    }

    public void setApellido_SupervisorDeLogistica(String apellido_SupervisorDeLogistica) {
        this.apellido_SupervisorDeLogistica = apellido_SupervisorDeLogistica;
    }

    public String getCorreo_SupervisorDeLogistica() {
        return correo_SupervisorDeLogistica;
    }

    public void setCorreo_SupervisorDeLogistica(String correo_SupervisorDeLogistica) {
        this.correo_SupervisorDeLogistica = correo_SupervisorDeLogistica;
    }

    public String getTelefono_SupervisorDeLogistica() {
        return telefono_SupervisorDeLogistica;
    }

    public void setTelefono_SupervisorDeLogistica(String telefono_SupervisorDeLogistica) {
        this.telefono_SupervisorDeLogistica = telefono_SupervisorDeLogistica;
    }

    public String getDni_SupervisorDeLogistica() {
        return dni_SupervisorDeLogistica;
    }

    public void setDni_SupervisorDeLogistica(String dni_SupervisorDeLogistica) {
        this.dni_SupervisorDeLogistica = dni_SupervisorDeLogistica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
