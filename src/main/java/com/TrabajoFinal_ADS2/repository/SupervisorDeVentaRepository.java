package com.TrabajoFinal_ADS2.repository;

import com.TrabajoFinal_ADS2.modelo.SupervisorDeVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupervisorDeVentaRepository extends JpaRepository<SupervisorDeVenta,Long> {
}
