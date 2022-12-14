package edu.curso.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		Persona persona = new Persona("Victoria", 37, "Lugones 4402");

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("applicationContext.xml");
		applicationContext.register(ConfiguracionSpring.class);
		applicationContext.refresh();
		GeneradorDeDocumento generadorDeDocumento = (GeneradorDeDocumento) applicationContext
				.getBean("generadorDeDocumento");
		generadorDeDocumento.exportarDatos(persona);

	}
}
