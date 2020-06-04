package edu.escuelaing.arsw.intro.ContadorLineas;

public class ContarLineasArchivo implements ContadorLineas{
	
	private int LineasContadas = 0;
	
	/**
	 * El metodo Conteo ira sumando de uno en uno todas las lineas del archivo
	 * 
	 * @param Linea son cada una de las lineas fisicas que contendra el archivo
	 **/
	@Override
	public void Conteo(String Linea) {
		LineasContadas++;
	}
	
	/**
	 * El metodo getContarLineas sera el encargado de retornar todas las lineas contadas
	 * 
	 * @return Integer Lineas de codigo del archivo las cuales son las lineas fisicas
	 **/
	@Override
	public int getContarLineas() {
		// TODO Auto-generated method stub
		return LineasContadas;
	}
	

}