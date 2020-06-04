package edu.escuelaing.arsw.intro.ContadorLineas;

public class LOCContadorLineas implements ContadorLineas{
	
	private int contadorInvalido = 0;
	private int contadorValido = 0;
	
	/**
	 * El metodo Conteo ira sumando de uno en uno todas las lineas del archivo y
	 * las lineas que contengan comentarios o espacios vacios
	 * 
	 * @param linea son cada una de las lineas de codigo que contendra el archivo
	 **/
	@Override
	public void Conteo(String linea) {
		
		linea = linea.trim();
		contadorValido++;
		if (linea.equals("") || linea.charAt(0) == '/' || linea.charAt(0) == '*') {
			contadorInvalido++;
		}
	}
	
	/**
	 * El metodo getContarLineas sera el encargado de retornar todas las lineas contadas
	 * 
	 * @return Integer Lineas de codigo del archivo las cuales son las lineas fisica menos
	 * las lineas de comentarios y vacias
	 **/
	@Override
    public int getContarLineas() {
		return contadorValido-contadorInvalido;
	}    
}