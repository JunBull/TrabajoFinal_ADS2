package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.*;

import java.time.LocalDate;

public class PedidoDTO {

    private Long id_Pedido;
    private LocalDate fecha_Pedido;
    private Long idProducto;
    private int cantidad_Pedido;
    private double montoTotal_Pedido;
    private Long idVendedor;
    private Long idCliente;
    private Long idSupervisorDeVenta;
    private LocalDate fechaAprobacion_Pedido;
    private Long idTipoVariedad;
    private Long idPlanta;

    public PedidoDTO() {

    }

    public PedidoDTO(Long id_Pedido, LocalDate fecha_Pedido, Long idProducto, int cantidad_Pedido, double montoTotal_Pedido, Long idVendedor, Long idCliente, Long idSupervisorDeVenta, LocalDate fechaAprobacion_Pedido, Long idTipoVariedad, Long idPlanta) {
        this.id_Pedido = id_Pedido;
        this.fecha_Pedido = fecha_Pedido;
        this.idProducto = idProducto;
        this.cantidad_Pedido = cantidad_Pedido;
        this.montoTotal_Pedido = montoTotal_Pedido;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.idSupervisorDeVenta = idSupervisorDeVenta;
        this.fechaAprobacion_Pedido = fechaAprobacion_Pedido;
        this.idTipoVariedad = idTipoVariedad;
        this.idPlanta = idPlanta;
    }

    public PedidoDTO(Long idPlanta, Long idTipoVariedad, LocalDate fechaAprobacion_Pedido, Long idSupervisorDeVenta, Long idCliente, Long idVendedor, double montoTotal_Pedido, int cantidad_Pedido, Long idProducto, LocalDate fecha_Pedido) {
        this.idPlanta = idPlanta;
        this.idTipoVariedad = idTipoVariedad;
        this.fechaAprobacion_Pedido = fechaAprobacion_Pedido;
        this.idSupervisorDeVenta = idSupervisorDeVenta;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.montoTotal_Pedido = montoTotal_Pedido;
        this.cantidad_Pedido = cantidad_Pedido;
        this.idProducto = idProducto;
        this.fecha_Pedido = fecha_Pedido;
    }

    public Long getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(Long id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public LocalDate getFecha_Pedido() {
        return fecha_Pedido;
    }

    public void setFecha_Pedido(LocalDate fecha_Pedido) {
        this.fecha_Pedido = fecha_Pedido;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad_Pedido() {
        return cantidad_Pedido;
    }

    public void setCantidad_Pedido(int cantidad_Pedido) {
        this.cantidad_Pedido = cantidad_Pedido;
    }

    public double getMontoTotal_Pedido() {
        return montoTotal_Pedido;
    }

    public void setMontoTotal_Pedido(double montoTotal_Pedido) {
        this.montoTotal_Pedido = montoTotal_Pedido;
    }

    public Long getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Long idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdSupervisorDeVenta() {
        return idSupervisorDeVenta;
    }

    public void setIdSupervisorDeVenta(Long idSupervisorDeVenta) {
        this.idSupervisorDeVenta = idSupervisorDeVenta;
    }

    public LocalDate getFechaAprobacion_Pedido() {
        return fechaAprobacion_Pedido;
    }

    public void setFechaAprobacion_Pedido(LocalDate fechaAprobacion_Pedido) {
        this.fechaAprobacion_Pedido = fechaAprobacion_Pedido;
    }

    public Long getIdTipoVariedad() {
        return idTipoVariedad;
    }

    public void setIdTipoVariedad(Long idTipoVariedad) {
        this.idTipoVariedad = idTipoVariedad;
    }

    public Long getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(Long idPlanta) {
        this.idPlanta = idPlanta;
    }
}
