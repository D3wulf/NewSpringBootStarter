package com.nttdata.bootcamp.modelo;

public class Saludo {
	
	private String idioma;

	public Saludo(String idioma) {
		this.idioma = idioma;
	}
	
	public String mensajeSaludo() {
		String mensaje= "";
		switch (idioma) {
		
			case "Castellano":
				mensaje="Bienvenido";
				break;
				
			
			case "Ingles":
				mensaje="Welcome";
				break;
			
			
			case "Italiano":
				mensaje="Bienvenuto";
				break;
			
			default:
				mensaje="Bienvenido";
				break;
			
			}
		
		return mensaje;
		
		
		
	}

}
