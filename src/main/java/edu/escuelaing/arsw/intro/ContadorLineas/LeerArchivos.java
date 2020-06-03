package edu.escuelaing.arsw.intro.ContadorLineas;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerArchivos {
	
	public LeerArchivos() {}
	
	public void leerArch(String RutaAcceso, ContadorLineas cont) {
		Charset caracter = Charset.forName("UTF-8");
		Path archivo = Paths.get(RutaAcceso);
		try (BufferedReader lector = Files.newBufferedReader(archivo, caracter)) {
            String linea = null;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
                cont.Conteo(linea);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
		System.out.println("Physical Lines: " + cont.getContarLineas());
	}

}
