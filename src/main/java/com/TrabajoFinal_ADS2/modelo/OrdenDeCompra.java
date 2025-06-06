package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orden_de_compra")
public class OrdenDeCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_OrdenDeCompra;

    @Column(nullable = false)
    private int cantidad_OrdenDeCompra;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Producto", referencedColumnName = "id_Producto")
    private Producto producto;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_SupervisorDeVenta", referencedColumnName = "id_SupervisorDeVenta")
    private SupervisorDeVenta supervisorDeVenta;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Proveedor", referencedColumnName = "id_Proveedor")
    private Proveedor proveedor;

    @Column(nullable = true)
    private boolean confirmacionProveedor;

    @Column(nullable = true)
    private Date fechaEntrega_OrdenDeCompra;

    @Column(nullable = true)
    private String clpSenasa_OrdenDeCompra;

    @Column(nullable = false)
    private String estado_OrdenDeCompra;

    public OrdenDeCompra() {
    }

    public OrdenDeCompra(Long id_OrdenDeCompra, int cantidad_OrdenDeCompra, Producto producto, SupervisorDeVenta supervisorDeVenta, Proveedor proveedor, boolean confirmacionProveedor, Date fechaEntrega_OrdenDeCompra, String clpSenasa_OrdenDeCompra, String estado_OrdenDeCompra) {
        this.id_OrdenDeCompra = id_OrdenDeCompra;
        this.cantidad_OrdenDeCompra = cantidad_OrdenDeCompra;
        this.producto = producto;
        this.supervisorDeVenta = supervisorDeVenta;
        this.proveedor = proveedor;
        this.confirmacionProveedor = confirmacionProveedor;
        this.fechaEntrega_OrdenDeCompra = fechaEntrega_OrdenDeCompra;
        this.clpSenasa_OrdenDeCompra = clpSenasa_OrdenDeCompra;
        this.estado_OrdenDeCompra = estado_OrdenDeCompra;
    }

    public OrdenDeCompra(int cantidad_OrdenDeCompra, Producto producto, SupervisorDeVenta supervisorDeVenta, Proveedor proveedor, boolean confirmacionProveedor, Date fechaEntrega_OrdenDeCompra, String clpSenasa_OrdenDeCompra, String estado_OrdenDeCompra) {
        this.cantidad_OrdenDeCompra = cantidad_OrdenDeCompra;
        this.producto = producto;
        this.supervisorDeVenta = supervisorDeVenta;
        this.proveedor = proveedor;
        this.confirmacionProveedor = confirmacionProveedor;
        this.fechaEntrega_OrdenDeCompra = fechaEntrega_OrdenDeCompra;
        this.clpSenasa_OrdenDeCompra = clpSenasa_OrdenDeCompra;
        this.estado_OrdenDeCompra = estado_OrdenDeCompra;
    }

    public Long getId_OrdenDeCompra() {
        return id_OrdenDeCompra;
    }

    public void setId_OrdenDeCompra(Long id_OrdenDeCompra) {
        this.id_OrdenDeCompra = id_OrdenDeCompra;
    }

    public int getCantidad_OrdenDeCompra() {
        return cantidad_OrdenDeCompra;
    }

    public void setCantidad_OrdenDeCompra(int cantidad_OrdenDeCompra) {
        this.cantidad_OrdenDeCompra = cantidad_OrdenDeCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public SupervisorDeVenta getSupervisorDeVenta() {
        return supervisorDeVenta;
    }

    public void setSupervisorDeVenta(SupervisorDeVenta supervisorDeVenta) {
        this.supervisorDeVenta = supervisorDeVenta;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isConfirmacionProveedor() {
        return confirmacionProveedor;
    }

    public void setConfirmacionProveedor(boolean confirmacionProveedor) {
        this.confirmacionProveedor = confirmacionProveedor;
    }

    public Date getFechaEntrega_OrdenDeCompra() {
        return fechaEntrega_OrdenDeCompra;
    }

    public void setFechaEntrega_OrdenDeCompra(Date fechaEntrega_OrdenDeCompra) {
        this.fechaEntrega_OrdenDeCompra = fechaEntrega_OrdenDeCompra;
    }

    public String getClpSenasa_OrdenDeCompra() {
        return clpSenasa_OrdenDeCompra;
    }

    public void setClpSenasa_OrdenDeCompra(String clpSenasa_OrdenDeCompra) {
        this.clpSenasa_OrdenDeCompra = clpSenasa_OrdenDeCompra;
    }

    public String getEstado_OrdenDeCompra() {
        return estado_OrdenDeCompra;
    }

    public void setEstado_OrdenDeCompra(String estado_OrdenDeCompra) {
        this.estado_OrdenDeCompra = estado_OrdenDeCompra;
    }
}
