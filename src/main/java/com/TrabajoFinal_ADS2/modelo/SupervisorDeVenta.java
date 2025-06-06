package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "supervisor_de_venta")
public class SupervisorDeVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_SupervisorDeVenta;

    @Column(nullable = false)
    private String nombre_SupervisorDeVenta;

    @Column(nullable = false)
    private String apellido_SupervisorDeVenta;

    @Column(nullable = false)
    private String correo_SupervisorDeVenta;

    @Column(nullable = false)
    private String telefono_SupervisorDeVenta;

    @Column(nullable = false)
    private String dni_SupervisorDeVenta;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public SupervisorDeVenta() {
    }

    public SupervisorDeVenta(String nombre_SupervisorDeVenta, String apellido_SupervisorDeVenta, String correo_SupervisorDeVenta, String telefono_SupervisorDeVenta, String dni_SupervisorDeVenta, Usuario usuario) {
        this.nombre_SupervisorDeVenta = nombre_SupervisorDeVenta;
        this.apellido_SupervisorDeVenta = apellido_SupervisorDeVenta;
        this.correo_SupervisorDeVenta = correo_SupervisorDeVenta;
        this.telefono_SupervisorDeVenta = telefono_SupervisorDeVenta;
        this.dni_SupervisorDeVenta = dni_SupervisorDeVenta;
        this.usuario = usuario;
    }

    public SupervisorDeVenta(Long id_SupervisorDeVenta, String nombre_SupervisorDeVenta, String apellido_SupervisorDeVenta, String correo_SupervisorDeVenta, String telefono_SupervisorDeVenta, String dni_SupervisorDeVenta, Usuario usuario) {
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
