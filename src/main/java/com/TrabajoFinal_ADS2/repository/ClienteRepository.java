package com.TrabajoFinal_ADS2.repository;

import com.TrabajoFinal_ADS2.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
