package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.Cliente;
import com.TrabajoFinal_ADS2.modelo.SupervisorDeVenta;
import com.TrabajoFinal_ADS2.modelo.TipoVariedad;
import com.TrabajoFinal_ADS2.modelo.Vendedor;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Date;

public class PedidoDTO {

    private Long id_Pedido;
    private Date fecha_Pedido;
    private int cantidad_Pedido;
    private double montoTotal_Pedido;
    private Vendedor vendedor;
    private Cliente cliente;
    private SupervisorDeVenta supervisorDeVenta;
    private Date fechaAprobacion_Pedido;
    private TipoVariedad tipoVariedad;

    public PedidoDTO() {
    }

    public PedidoDTO(Long id_Pedido, Date fecha_Pedido, int cantidad_Pedido, double montoTotal_Pedido, Vendedor vendedor, Cliente cliente, SupervisorDeVenta supervisorDeVenta, Date fechaAprobacion_Pedido, TipoVariedad tipoVariedad) {
        this.id_Pedido = id_Pedido;
        this.fecha_Pedido = fecha_Pedido;
        this.cantidad_Pedido = cantidad_Pedido;
        this.montoTotal_Pedido = montoTotal_Pedido;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.supervisorDeVenta = supervisorDeVenta;
        this.fechaAprobacion_Pedido = fechaAprobacion_Pedido;
        this.tipoVariedad = tipoVariedad;
    }

    public PedidoDTO(Date fecha_Pedido, int cantidad_Pedido, double montoTotal_Pedido, Vendedor vendedor, Cliente cliente, SupervisorDeVenta supervisorDeVenta, Date fechaAprobacion_Pedido, TipoVariedad tipoVariedad) {
        this.fecha_Pedido = fecha_Pedido;
        this.cantidad_Pedido = cantidad_Pedido;
        this.montoTotal_Pedido = montoTotal_Pedido;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.supervisorDeVenta = supervisorDeVenta;
        this.fechaAprobacion_Pedido = fechaAprobacion_Pedido;
        this.tipoVariedad = tipoVariedad;
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

    public int getCantidad_Pedido() {
        return cantidad_Pedido;
    }

    public void setCantidad_Pedido(int cantidad_Pedido) {
        this.cantidad_Pedido = cantidad_Pedido;
    }

    public double getmontoTotal_Pedido() {
        return montoTotal_Pedido;
    }

    public void setmontoTotal_Pedido(double montoTotal_Pedido) {
        this.montoTotal_Pedido = montoTotal_Pedido;
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
}
