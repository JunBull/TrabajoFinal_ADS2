package com.TrabajoFinal_ADS2.dto;

import com.TrabajoFinal_ADS2.modelo.Proveedor;

public class ProductoDTO {
    private Long id_Producto;

    private String nombre_Producto;

    private double precioPorKilo_Producto;

    private Proveedor proveedor;

    public ProductoDTO() {
    }

    public ProductoDTO(Long id_Producto, String nombre_Producto, double precioPorKilo_Producto, Proveedor proveedor) {
        this.id_Producto = id_Producto;
        this.nombre_Producto = nombre_Producto;
        this.precioPorKilo_Producto = precioPorKilo_Producto;
        this.proveedor = proveedor;
    }

    public ProductoDTO(String nombre_Producto, double precioPorKilo_Producto, Proveedor proveedor) {
        this.nombre_Producto = nombre_Producto;
        this.precioPorKilo_Producto = precioPorKilo_Producto;
        this.proveedor = proveedor;
    }

    public Long getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(Long id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre_Producto() {
        return nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public double getPrecioPorKilo_Producto() {
        return precioPorKilo_Producto;
    }

    public void setPrecioPorKilo_Producto(double precioPorKilo_Producto) {
        this.precioPorKilo_Producto = precioPorKilo_Producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
