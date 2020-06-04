package edu.escuelaing.arsw.intro.ContadorLineas;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;

public class LeerArchivos {
	
	public LeerArchivos() {}
	public ArrayList<Integer> ListaContadores = new ArrayList<Integer>(Collections.nCopies(1, 0));
	

	
	public  void leerCarp(String direccion, ContadorLineas cont) {


		File carpeta = new File(direccion);
		if (carpeta.isDirectory()) {
			File[] Lista = carpeta.listFiles();
			if (Lista == null || Lista.length == 0) {
			    System.out.println("No hay elementos dentro de la carpeta actual");
			    return;
			}
			else {
			    for (int i=0; i< Lista.length; i++) {
			    	System.out.println(Lista[i].getName());
			        if (Lista[i].isDirectory()) {
			        	leerCarp(direccion+'/'+Lista[i].getName(), cont);
			        }
			        else {
			        	leerArch(direccion+'/'+Lista[i].getName(),cont);
			        }
			    }
			}
		}
		else {
			leerArch(direccion,cont);
		}
		
	}
	
	
	public  void leerArch(String RutaAcceso, ContadorLineas cont) {
		Charset caracter = Charset.forName("UTF-8");
		Path archivo = Paths.get(RutaAcceso);
		
		try (BufferedReader lector = Files.newBufferedReader(archivo, caracter)) {
            String linea = null;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                cont.Conteo(linea);
            }
            ListaContadores.add(cont.getContarLineas());
            System.out.println(" ");
            System.out.println("Lineas contadas para el archivo "+ archivo.getFileName() +" = "+(cont.getContarLineas()-ListaContadores.get(ListaContadores.size()-2)));
            System.out.println(" ");
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
		
	}

}
