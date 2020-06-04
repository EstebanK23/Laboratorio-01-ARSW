package edu.escuelaing.arsw.intro;
//HOLAAA

import edu.escuelaing.arsw.intro.ContadorLineas.ContadorLineas;
import edu.escuelaing.arsw.intro.ContadorLineas.ContarLineasArchivo;
import edu.escuelaing.arsw.intro.ContadorLineas.LOCContadorLineas;
import edu.escuelaing.arsw.intro.ContadorLineas.LeerArchivos;

public class App {
	
	public static int ContadorFinal=0;
	
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
	
	public static int getContador() {
		return ContadorFinal;
	}
}