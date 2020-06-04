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
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppPHY(){
    	String[] ruta = {"phy","src/test/resources/App.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 30 == contador);
    }
    
    public void testAppLOC(){
    	String[] ruta = {"loc","src/test/resources/App.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 24 == contador);
    }
    
    public void testContadorLineasPHY(){
    	String[] ruta = {"phy","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/ContadorLineas.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 6 == contador);
    }
    
    public void testContadorLineasLOC(){
    	String[] ruta = {"loc","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/ContadorLineas.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 5 == contador);
    }
    
    public void testContarLineasArchivoPHY(){
    	String[] ruta = {"phy","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/ContarLineasArchivo.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 19 == contador);
    }
    
    public void testContarLineasArchivoLOC(){
    	String[] ruta = {"loc","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/ContarLineasArchivo.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 12 == contador);
    }
    
    public void testLeerArchivoPHY(){
    	String[] ruta = {"phy","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/LeerArchivos.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 69 == contador);
    }
    
    public void testLeerArchivoLOC(){
    	String[] ruta = {"loc","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/LeerArchivos.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 55 == contador);
    }
    
    public void testLOCContadorLineasPHY(){
    	String[] ruta = {"phy","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/LOCContadorLineas.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 21 == contador);
    }
    
    public void testLOCContadorLineasLOC(){
    	String[] ruta = {"loc","src/main/java/edu/escuelaing/arsw/intro/ContadorLineas/LOCContadorLineas.java"};
        App.main(ruta);
        int contador = App.getContador();
        assertTrue( 17 == contador);
    }
    
    public void testCarpetasPHY() {
    	String ruta = "src/main/java/edu/escuelaing/arsw/intro";
        LeerArchivos archivo= new LeerArchivos();
        ContadorLineas contador = null;
        contador = new ContarLineasArchivo();
        archivo.leerCarp(ruta, contador);
    }
    
    public void testCarpetasLOC() {
    	String ruta = "src/main/java/edu/escuelaing/arsw/intro";
        LeerArchivos archivo= new LeerArchivos();
        ContadorLineas contador = new LOCContadorLineas();
        archivo.leerCarp(ruta, contador);
    }
}
