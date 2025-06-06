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
}
