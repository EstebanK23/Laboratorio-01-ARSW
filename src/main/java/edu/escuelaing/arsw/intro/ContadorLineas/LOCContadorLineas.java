package edu.escuelaing.arsw.intro.ContadorLineas;

public class LOCContadorLineas implements ContadorLineas{
	
	private int contadorInvalido = 0;
	private int contadorValido = 0;
	
	@Override
	public void Conteo(String linea) {
		
		linea = linea.trim();
		contadorValido++;
		if (linea.equals("") || linea.charAt(0) == '/' || linea.charAt(0) == '*') {
			contadorInvalido++;
		}
	}	
	@Override
    public int getContarLineas() {
		return contadorValido-contadorInvalido;
	}    
}