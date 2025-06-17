package com.TrabajoFinal_ADS2.service;

import com.TrabajoFinal_ADS2.dto.UsuarioRegistroDTO;
import com.TrabajoFinal_ADS2.modelo.Rol;
import com.TrabajoFinal_ADS2.modelo.Usuario;
import com.TrabajoFinal_ADS2.repository.RolRepository;
import com.TrabajoFinal_ADS2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, BCryptPasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void guardarUsuario(UsuarioRegistroDTO registroDTO) {
        Rol rol = rolRepository.findById(registroDTO.getRol().getId()).orElseThrow(() -> new RuntimeException("Rol no encontrado"));

        Usuario usuario = new Usuario(
                registroDTO.getNombre(),
                registroDTO.getApellido(),
                registroDTO.getEmail(),
                passwordEncoder.encode(registroDTO.getPassword()),
                List.of(rol));
        usuarioRepository.save(usuario);
    }

}
