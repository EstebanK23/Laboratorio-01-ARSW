package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.ContadorLineas.ContadorLineas;
import edu.escuelaing.arsw.intro.ContadorLineas.ContarLineasArchivo;
import edu.escuelaing.arsw.intro.ContadorLineas.LeerArchivos;

public class App 
{
	public static void main( String[] args )
    {
		String ruta = args[0];
        LeerArchivos archivo= new LeerArchivos();
        ContadorLineas contador = new ContarLineasArchivo();        
        archivo.leerArch(ruta, contador);
        System.out.println("Physical Lines: " + contador.getContarLineas());
        
    }
}
