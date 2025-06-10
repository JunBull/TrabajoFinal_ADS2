package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.DocumentoDeExportacionDTO;
import com.TrabajoFinal_ADS2.modelo.DocumentoDeExportacion;
import com.TrabajoFinal_ADS2.repository.DocumentoDeExportacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoDeExportacionService {

    @Autowired
    DocumentoDeExportacionRepository documentoDeExportacionRepository;

    public void guardarDocumentoDeExportacion(DocumentoDeExportacionDTO documentoDeExportacionDTO){
        DocumentoDeExportacion documentoDeExportacion = new DocumentoDeExportacion(
                documentoDeExportacionDTO.getPedido(),
                documentoDeExportacionDTO.isRequisitoSUNAT(),
                documentoDeExportacionDTO.getCertificadoSanitario(),
                documentoDeExportacionDTO.getDeclaracionAduanera(),
                documentoDeExportacionDTO.getTransportista(),
                documentoDeExportacionDTO.getUbicacionPuntoEmbarque(),
                documentoDeExportacionDTO.getFechaRecojo(),
                documentoDeExportacionDTO.getIncidencia_Transp(),
                documentoDeExportacionDTO.getEstado_Transp()
        );
        documentoDeExportacionRepository.save(documentoDeExportacion);
    }
}
