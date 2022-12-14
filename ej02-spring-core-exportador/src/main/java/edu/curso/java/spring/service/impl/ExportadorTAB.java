package edu.curso.java.spring.service.impl;

import edu.curso.java.spring.Persona;
import edu.curso.java.spring.service.Exportador;
import org.springframework.stereotype.Component;

@Component("exportadorTAB")
public class ExportadorTAB implements Exportador {

	@Override
	public String exportar(Persona persona) {
		return persona.getNombre() + "\t" + persona.getEdad() + "\t" + persona.getDireccion();
	}

}
