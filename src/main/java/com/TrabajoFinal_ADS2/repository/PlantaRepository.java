package com.TrabajoFinal_ADS2.repository;

import com.TrabajoFinal_ADS2.modelo.Planta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaRepository extends JpaRepository<Planta,Long> {
}
