package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "reclamo")
public class Reclamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Reclamo;

    @Column(nullable = false)
    private String descripcion_Reclamo;

    @Column(nullable = false)
    private String estado_Reclamo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_TipoReclamo", referencedColumnName = "id_TipoReclamo")
    private TipoReclamo tipoReclamo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_AtencionAlCliente", referencedColumnName = "id_AtencionAlCliente")
    private AtencionAlCliente atencionAlCliente;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Cliente", referencedColumnName = "id_Cliente")
    private Cliente cliente;

    public Reclamo() {
    }

    public Reclamo(Long id_Reclamo, String descripcion_Reclamo, String estado_Reclamo, TipoReclamo tipoReclamo, AtencionAlCliente atencionAlCliente, Cliente cliente) {
        this.id_Reclamo = id_Reclamo;
        this.descripcion_Reclamo = descripcion_Reclamo;
        this.estado_Reclamo = estado_Reclamo;
        this.tipoReclamo = tipoReclamo;
        this.atencionAlCliente = atencionAlCliente;
        this.cliente = cliente;
    }

    public Reclamo(String descripcion_Reclamo, String estado_Reclamo, TipoReclamo tipoReclamo, AtencionAlCliente atencionAlCliente, Cliente cliente) {
        this.descripcion_Reclamo = descripcion_Reclamo;
        this.estado_Reclamo = estado_Reclamo;
        this.tipoReclamo = tipoReclamo;
        this.atencionAlCliente = atencionAlCliente;
        this.cliente = cliente;
    }

    public Long getId_Reclamo() {
        return id_Reclamo;
    }

    public void setId_Reclamo(Long id_Reclamo) {
        this.id_Reclamo = id_Reclamo;
    }

    public String getDescripcion_Reclamo() {
        return descripcion_Reclamo;
    }

    public void setDescripcion_Reclamo(String descripcion_Reclamo) {
        this.descripcion_Reclamo = descripcion_Reclamo;
    }

    public String getEstado_Reclamo() {
        return estado_Reclamo;
    }

    public void setEstado_Reclamo(String estado_Reclamo) {
        this.estado_Reclamo = estado_Reclamo;
    }

    public TipoReclamo getTipoReclamo() {
        return tipoReclamo;
    }

    public void setTipoReclamo(TipoReclamo tipoReclamo) {
        this.tipoReclamo = tipoReclamo;
    }

    public AtencionAlCliente getAtencionAlCliente() {
        return atencionAlCliente;
    }

    public void setAtencionAlCliente(AtencionAlCliente atencionAlCliente) {
        this.atencionAlCliente = atencionAlCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
