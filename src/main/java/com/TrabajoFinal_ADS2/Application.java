package com.TrabajoFinal_ADS2;

import com.TrabajoFinal_ADS2.modelo.Rol;
import com.TrabajoFinal_ADS2.repository.RolRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
/*
	@Bean
	CommandLineRunner commandLineRunner(RolRepository rolRepository){
		return args ->{
			rolRepository.save(
					new Rol("ROL_VENDEDOR"));
			rolRepository.save(
					new Rol("ROL_SUPERVISOR_DE_VENTA"));
			rolRepository.save(
					new Rol("ROL_SUPERVISOR_DE_COMPRA"));
			rolRepository.save(
					new Rol("ROL_TRANSPORTISTA"));
			rolRepository.save(
					new Rol("ROL_ADMINISTRADOR"));
			rolRepository.save(
					new Rol("ROL_ATENCION_AL_CLIENTE"));
			rolRepository.save(
					new Rol("ROL_SUPERVISOR_DE_LOGISTICA"));
			rolRepository.save(
					new Rol("ROL_PROVEEDOR"));
		};
	}
*/
}
