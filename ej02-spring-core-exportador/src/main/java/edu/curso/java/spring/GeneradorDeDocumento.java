package edu.curso.java.spring;

import edu.curso.java.spring.service.Exportador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GeneradorDeDocumento {

	private Exportador exportador;

	public void exportarDatos(Persona persona) {

		System.out.println(exportador.exportar(persona));
	}

	public Exportador getExportador() {

		return this.exportador;
	}

	@Autowired
	@Qualifier("exportadorXML")
	public void setExportador(Exportador exportador){
		this.exportador = exportador;
	}
}
