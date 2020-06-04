package edu.escuelaing.arsw.intro.ContadorLineas;

public class ContarLineasArchivo implements ContadorLineas{
	
	private int LineasContadas = 0;
	
	@Override
	public void Conteo(String Linea) {
		LineasContadas++;
	}
	
	@Override
	public int getContarLineas() {
		// TODO Auto-generated method stub
		return LineasContadas;
	}
	

}