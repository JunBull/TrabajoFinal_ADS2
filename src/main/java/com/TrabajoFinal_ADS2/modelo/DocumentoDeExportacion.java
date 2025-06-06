package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "documento_de_exportacion")
public class DocumentoDeExportacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_DocumentoDeExportacion;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Pedido", referencedColumnName = "id_Pedido")
    private Pedido pedido;

    @Column(nullable = false)
    private boolean requisitoSUNAT;

    @Column(nullable = false)
    private String certificadoSanitario;

    @Column(nullable = false)
    private String declaracionAduanera;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Transportista", referencedColumnName = "id_Transportista")
    private Transportista transportista;

    @Column(nullable = false)
    private String ubicacionPuntoEmbarque;

    @Column(nullable = false)
    private Date fechaRecojo;

    @Column(nullable = false)
    private String incidencia_Transp;

    @Column(nullable = false)
    private String estado_Transp;

    public DocumentoDeExportacion() {
    }

    public DocumentoDeExportacion(Long id_DocumentoDeExportacion, Pedido pedido, boolean requisitoSUNAT, String certificadoSanitario, String declaracionAduanera, Transportista transportista, String ubicacionPuntoEmbarque, Date fechaRecojo, String incidencia_Transp, String estado_Transp) {
        this.id_DocumentoDeExportacion = id_DocumentoDeExportacion;
        this.pedido = pedido;
        this.requisitoSUNAT = requisitoSUNAT;
        this.certificadoSanitario = certificadoSanitario;
        this.declaracionAduanera = declaracionAduanera;
        this.transportista = transportista;
        this.ubicacionPuntoEmbarque = ubicacionPuntoEmbarque;
        this.fechaRecojo = fechaRecojo;
        this.incidencia_Transp = incidencia_Transp;
        this.estado_Transp = estado_Transp;
    }

    public DocumentoDeExportacion(Pedido pedido, boolean requisitoSUNAT, String certificadoSanitario, String declaracionAduanera, Transportista transportista, String ubicacionPuntoEmbarque, Date fechaRecojo, String incidencia_Transp, String estado_Transp) {
        this.pedido = pedido;
        this.requisitoSUNAT = requisitoSUNAT;
        this.certificadoSanitario = certificadoSanitario;
        this.declaracionAduanera = declaracionAduanera;
        this.transportista = transportista;
        this.ubicacionPuntoEmbarque = ubicacionPuntoEmbarque;
        this.fechaRecojo = fechaRecojo;
        this.incidencia_Transp = incidencia_Transp;
        this.estado_Transp = estado_Transp;
    }

    public Long getId_DocumentoDeExportacion() {
        return id_DocumentoDeExportacion;
    }

    public void setId_DocumentoDeExportacion(Long id_DocumentoDeExportacion) {
        this.id_DocumentoDeExportacion = id_DocumentoDeExportacion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isRequisitoSUNAT() {
        return requisitoSUNAT;
    }

    public void setRequisitoSUNAT(boolean requisitoSUNAT) {
        this.requisitoSUNAT = requisitoSUNAT;
    }

    public String getCertificadoSanitario() {
        return certificadoSanitario;
    }

    public void setCertificadoSanitario(String certificadoSanitario) {
        this.certificadoSanitario = certificadoSanitario;
    }

    public String getDeclaracionAduanera() {
        return declaracionAduanera;
    }

    public void setDeclaracionAduanera(String declaracionAduanera) {
        this.declaracionAduanera = declaracionAduanera;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public String getUbicacionPuntoEmbarque() {
        return ubicacionPuntoEmbarque;
    }

    public void setUbicacionPuntoEmbarque(String ubicacionPuntoEmbarque) {
        this.ubicacionPuntoEmbarque = ubicacionPuntoEmbarque;
    }

    public Date getFechaRecojo() {
        return fechaRecojo;
    }

    public void setFechaRecojo(Date fechaRecojo) {
        this.fechaRecojo = fechaRecojo;
    }

    public String getIncidencia_Transp() {
        return incidencia_Transp;
    }

    public void setIncidencia_Transp(String incidencia_Transp) {
        this.incidencia_Transp = incidencia_Transp;
    }

    public String getEstado_Transp() {
        return estado_Transp;
    }

    public void setEstado_Transp(String estado_Transp) {
        this.estado_Transp = estado_Transp;
    }
}
