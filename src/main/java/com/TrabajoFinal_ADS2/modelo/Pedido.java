package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pedido;

    private Date fecha_Pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Producto", referencedColumnName = "id_Producto")
    private Producto producto;

    private int cantidad_Pedido;

    private double montoTotal_Pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Vendedor", referencedColumnName = "id_Vendedor")
    private Vendedor vendedor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Cliente", referencedColumnName = "id_Cliente")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_SupervisorDeVenta", referencedColumnName = "id_SupervisorDeVenta")
    private SupervisorDeVenta supervisorDeVenta;

    private Date fechaAprobacion_Pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_TipoVariedad", referencedColumnName = "id_TipoVariedad")
    private TipoVariedad tipoVariedad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Planta", referencedColumnName = "id_Planta")
    private Planta planta;

    public Pedido() {
    }

    public Pedido(Date fecha_Pedido, Producto producto, int cantidad_Pedido, double montoTotal_Pedido, Vendedor vendedor, Cliente cliente) {
        this.fecha_Pedido = fecha_Pedido;
        this.producto = producto;
        this.cantidad_Pedido = cantidad_Pedido;
        this.montoTotal_Pedido = montoTotal_Pedido;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public Pedido(Long id_Pedido, Date fecha_Pedido, Producto producto, int cantidad_Pedido, double montoTotal_Pedido, Vendedor vendedor, Cliente cliente, SupervisorDeVenta supervisorDeVenta, Date fechaAprobacion_Pedido, TipoVariedad tipoVariedad, Planta planta) {
        this.id_Pedido = id_Pedido;
        this.fecha_Pedido = fecha_Pedido;
        this.producto = producto;
        this.cantidad_Pedido = cantidad_Pedido;
        this.montoTotal_Pedido = montoTotal_Pedido;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.supervisorDeVenta = supervisorDeVenta;
        this.fechaAprobacion_Pedido = fechaAprobacion_Pedido;
        this.tipoVariedad = tipoVariedad;
        this.planta = planta;
    }

    public Pedido(Date fecha_Pedido, Producto producto, int cantidad_Pedido, double montoTotal_Pedido, Vendedor vendedor, Cliente cliente, SupervisorDeVenta supervisorDeVenta, Date fechaAprobacion_Pedido, TipoVariedad tipoVariedad, Planta planta) {
        this.fecha_Pedido = fecha_Pedido;
        this.producto = producto;
        this.cantidad_Pedido = cantidad_Pedido;
        this.montoTotal_Pedido = montoTotal_Pedido;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.supervisorDeVenta = supervisorDeVenta;
        this.fechaAprobacion_Pedido = fechaAprobacion_Pedido;
        this.tipoVariedad = tipoVariedad;
        this.planta = planta;
    }

    public Long getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(Long id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public Date getFecha_Pedido() {
        return fecha_Pedido;
    }

    public void setFecha_Pedido(Date fecha_Pedido) {
        this.fecha_Pedido = fecha_Pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad_Pedido() {
        return cantidad_Pedido;
    }

    public void setCantidad_Pedido(int cantidad_Pedido) {
        this.cantidad_Pedido = cantidad_Pedido;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SupervisorDeVenta getSupervisorDeVenta() {
        return supervisorDeVenta;
    }

    public void setSupervisorDeVenta(SupervisorDeVenta supervisorDeVenta) {
        this.supervisorDeVenta = supervisorDeVenta;
    }

    public Date getFechaAprobacion_Pedido() {
        return fechaAprobacion_Pedido;
    }

    public void setFechaAprobacion_Pedido(Date fechaAprobacion_Pedido) {
        this.fechaAprobacion_Pedido = fechaAprobacion_Pedido;
    }

    public TipoVariedad getTipoVariedad() {
        return tipoVariedad;
    }

    public void setTipoVariedad(TipoVariedad tipoVariedad) {
        this.tipoVariedad = tipoVariedad;
    }

    public double getMontoTotal_Pedido() {
        return montoTotal_Pedido;
    }

    public void setMontoTotal_Pedido(double montoTotal_Pedido) {
        this.montoTotal_Pedido = montoTotal_Pedido;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
}
