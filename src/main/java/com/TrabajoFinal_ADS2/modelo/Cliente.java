package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Cliente;

    @Column(nullable = false)
    private String nombre_Cliente;

    @Column(nullable = false)
    private String apellido_Cliente;

    @Column(nullable = false)
    private String telefono_Cliente;

    @Column(nullable = false)
    private String empresa_Cliente;

    public Cliente() {
    }

    public Cliente(String nombre_Cliente, String apellido_Cliente, String telefono_Cliente, String empresa_Cliente) {
        this.nombre_Cliente = nombre_Cliente;
        this.apellido_Cliente = apellido_Cliente;
        this.telefono_Cliente = telefono_Cliente;
        this.empresa_Cliente = empresa_Cliente;
    }

    public Cliente(Long id_Cliente, String nombre_Cliente, String apellido_Cliente, String telefono_Cliente, String empresa_Cliente) {
        this.id_Cliente = id_Cliente;
        this.nombre_Cliente = nombre_Cliente;
        this.apellido_Cliente = apellido_Cliente;
        this.telefono_Cliente = telefono_Cliente;
        this.empresa_Cliente = empresa_Cliente;
    }

    public Long getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(Long id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNombre_Cliente() {
        return nombre_Cliente;
    }

    public void setNombre_Cliente(String nombre_Cliente) {
        this.nombre_Cliente = nombre_Cliente;
    }

    public String getApellido_Cliente() {
        return apellido_Cliente;
    }

    public void setApellido_Cliente(String apellido_Cliente) {
        this.apellido_Cliente = apellido_Cliente;
    }

    public String getTelefono_Cliente() {
        return telefono_Cliente;
    }

    public void setTelefono_Cliente(String telefono_Cliente) {
        this.telefono_Cliente = telefono_Cliente;
    }

    public String getEmpresa_Cliente() {
        return empresa_Cliente;
    }

    public void setEmpresa_Cliente(String empresa_Cliente) {
        this.empresa_Cliente = empresa_Cliente;
    }
}
