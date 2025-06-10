package com.TrabajoFinal_ADS2.repository;

import com.TrabajoFinal_ADS2.modelo.OrdenDeCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenDeCompraRepository extends JpaRepository<OrdenDeCompra,Long> {
}
