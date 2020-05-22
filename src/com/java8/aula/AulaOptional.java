package com.java8.aula;

import com.java8.base.Usuario;
import java.util.Optional;

public class AulaOptional {
	public static void main (String[] args) {
		
		
		Usuario colaborador = new Usuario();
		Usuario supervisor = new Usuario();
		supervisor.setEmail("teste@gmail.com");
		
		if (colaborador.getEmail() != null) {
			enviarEmail(colaborador.getEmail());
		} else {
			enviarEmail(supervisor.getEmail());
		}
		
		
		
		enviarEmail(Optional.ofNullable(colaborador.getEmail()).orElse(supervisor.getEmail()));
		Optional.ofNullable(colaborador.getEmail()).ifPresent(e -> enviarEmail(e));
		
	}
	
	public static void enviarEmail(String email) {
		System.out.println(email);
	}
}
