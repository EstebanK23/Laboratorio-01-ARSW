package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.ContadorLineas.ContadorLineas;
import edu.escuelaing.arsw.intro.ContadorLineas.ContarLineasArchivo;
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
    public void testApp(){
    	String ruta = "src/test/resources/App.java";
        LeerArchivos archivo= new LeerArchivos();
        ContadorLineas contador = new ContarLineasArchivo();        
        archivo.leerArch(ruta, contador);
        
        assertTrue( 16 == contador.getContarLineas());
    }
}
