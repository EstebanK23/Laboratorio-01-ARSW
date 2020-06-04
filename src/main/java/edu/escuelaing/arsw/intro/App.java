package edu.escuelaing.arsw.intro;
//HOLAAA

import edu.escuelaing.arsw.intro.ContadorLineas.ContadorLineas;
import edu.escuelaing.arsw.intro.ContadorLineas.ContarLineasArchivo;
import edu.escuelaing.arsw.intro.ContadorLineas.LOCContadorLineas;
import edu.escuelaing.arsw.intro.ContadorLineas.LeerArchivos;

public class App {
	
	public static int ContadorFinal=0;
	
	/** 
	 * El metodo main tiene la tarea de llamar cada uno de los demas metodos
	 * para realizar el conteno de lineas e identificar si se tienen que leer
	 * las lineas fisicas o las lineas del codigo
	 * 
	 * @param args es una lista donde estara el tipo de lineas que se quieren
	 * consultar y tambien la direccion del archivo donde se va a consultar
	 **/
	
	public static void main( String[] args ){
		String ruta = args[1];
        LeerArchivos archivo= new LeerArchivos();
        ContadorLineas contador = null;
        if (args[0].equals("phy")) {
        	contador = new ContarLineasArchivo();
        }
        else if (args[0].equals("loc")){
        	contador = new LOCContadorLineas();
        }     
        archivo.leerCarp(ruta, contador);
        ContadorFinal=contador.getContarLineas();   
    }
	
	/**
	 * El metodo getContador se encargara de retornar la suma de lineas
	 * del archivo a consultar
	 * 
	 * @return Integer Lineas del archivo
	 **/
	
	public static int getContador() {
		return ContadorFinal;
	}
}