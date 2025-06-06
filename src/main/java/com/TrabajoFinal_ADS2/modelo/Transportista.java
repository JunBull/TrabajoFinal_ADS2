package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "transportista")
public class Transportista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Transportista;

    @Column(nullable = false)
    private String nombre_Transportista;

    @Column(nullable = false)
    private String apellido_Transportista;

    @Column(nullable = false)
    private String correo_Transportista;

    @Column(nullable = false)
    private String telefono_Transportista;

    @Column(nullable = false)
    private String dni_Transportista;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public Transportista() {
    }

    public Transportista(String nombre_Transportista, String apellido_Transportista, String correo_Transportista, String telefono_Transportista, String dni_Transportista, Usuario usuario) {
        this.nombre_Transportista = nombre_Transportista;
        this.apellido_Transportista = apellido_Transportista;
        this.correo_Transportista = correo_Transportista;
        this.telefono_Transportista = telefono_Transportista;
        this.dni_Transportista = dni_Transportista;
        this.usuario = usuario;
    }

    public Transportista(Long id_Transportista, String nombre_Transportista, String apellido_Transportista, String correo_Transportista, String telefono_Transportista, String dni_Transportista, Usuario usuario) {
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
