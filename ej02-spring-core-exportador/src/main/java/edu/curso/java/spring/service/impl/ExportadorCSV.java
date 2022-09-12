package edu.curso.java.spring.service.impl;

import edu.curso.java.spring.Persona;
import edu.curso.java.spring.service.Exportador;
import org.springframework.stereotype.Component;

@Component("exportadorCSV")
public class ExportadorCSV implements Exportador {

	@Override
	public String exportar(Persona persona) {
		String datosCSV = persona.getNombre() + "," + persona.getEdad() + "," + persona.getDireccion();
		return datosCSV;
	}

}
