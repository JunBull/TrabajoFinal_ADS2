package com.TrabajoFinal_ADS2.repository;

import com.TrabajoFinal_ADS2.modelo.DocumentoDeExportacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoDeExportacionRepository extends JpaRepository<DocumentoDeExportacion,Long> {
}
