package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.ContadorLineas.ContadorLineas;
import edu.escuelaing.arsw.intro.ContadorLineas.ContarLineasArchivo;
import edu.escuelaing.arsw.intro.ContadorLineas.LOCContadorLineas;
import edu.escuelaing.arsw.intro.ContadorLineas.LeerArchivos;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    /**
     * Esta prueba sera la encargada de confirmar que las lineas fisicas del archivo App.java hayan sido contadas perfectamente 
     */
    public void testAppPHY(){
        System.out.println("Lineas Fisicas");
    	String[] ruta = {"phy","src/test/resources/App.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 46 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas de codigo del archivo App.java hayan sido contadas perfectamente 
     */
    public void testAppLOC(){
        System.out.println("Lineas de Codigo");
    	String[] ruta = {"loc","src/test/resources/App.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 24 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas fisicas del archivo ContadorLineas.java hayan sido contadas perfectamente 
     */
    public void testContadorLineasPHY(){
        System.out.println("Lineas Fisicas");
    	String[] ruta = {"phy","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/ContadorLineas.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 6 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas de codigo del archivo ContadorLineas.java hayan sido contadas perfectamente 
     */
    public void testContadorLineasLOC(){
        System.out.println("Lineas de Codigo");
    	String[] ruta = {"loc","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/ContadorLineas.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 5 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas fisicas del archivo ContarLineasArchivo.java hayan sido contadas perfectamente 
     */
    public void testContarLineasArchivoPHY(){
        System.out.println("Lineas Fisicas");
    	String[] ruta = {"phy","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/ContarLineasArchivo.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 29 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas de codigo del archivo ContarLineasArchivo.java hayan sido contadas perfectamente 
     */
    public void testContarLineasArchivoLOC(){
        System.out.println("Lineas de Codigo");
    	String[] ruta = {"loc","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/ContarLineasArchivo.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 12 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas fisicas del archivo LeerArchivo.java hayan sido contadas perfectamente 
     */
    public void testLeerArchivoPHY(){
        System.out.println("Lineas Fisicas");
    	String[] ruta = {"phy","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/LeerArchivos.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 79 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas de codigo del archivo LeerArchivo.java hayan sido contadas perfectamente 
     */
    public void testLeerArchivoLOC(){
        System.out.println("Lineas de Codigo");
    	String[] ruta = {"loc","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/LeerArchivos.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 54 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas fisicas del archivo LOCContadorLineas.java hayan sido contadas perfectamente 
     */
    public void testLOCContadorLineasPHY(){
    	System.out.println("Lineas Fisicas");
    	String[] ruta = {"phy","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/LOCContadorLineas.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 34 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de confirmar que las lineas de codigo del archivo LOCContadorLineas.java hayan sido contadas perfectamente 
     */
    public void testLOCContadorLineasLOC(){
        System.out.println("Lineas de Codigo");
    	String[] ruta = {"loc","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/LOCContadorLineas.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 17 == contador);
    }
    
    /**
     * Esta prueba sera la encargada de mastrar las lineas fisicas de todos los archivos que contiene el paquete ContadorLineas 
     */
    public void testCarpetasPHY() {
    	System.out.println("Lineas Fisicas");
    	String ruta = "src/main/java/edu/escuelaing/arsw/intro/ContadorLineas";
        LeerArchivos archivo= new LeerArchivos();
        ContadorLineas contador = new ContarLineasArchivo();
        archivo.leerCarp(ruta, contador);
    }
    
    /**
     * Esta prueba sera la encargada de mastrar las lineas de codigo de todos los archivos que contiene el paquete ContadorLineas
     */
    public void testCarpetasLOC() {
    	System.out.println("Lineas de Codigo");
    	String ruta = "src/main/java/edu/escuelaing/arsw/intro/ContadorLineas";
        LeerArchivos archivo= new LeerArchivos();
        ContadorLineas contador = new LOCContadorLineas();
        archivo.leerCarp(ruta, contador);
    }
}
