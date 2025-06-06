package com.TrabajoFinal_ADS2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Producto;

    @Column(nullable = false)
    private String nombre_Producto;

    @Column(nullable = false)
    private double precioPorKilo_Producto;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Proveedor", referencedColumnName = "id_Proveedor")
    private Proveedor proveedor;
}
