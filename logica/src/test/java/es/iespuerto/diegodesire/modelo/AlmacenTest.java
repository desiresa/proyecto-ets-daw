package es.iespuerto.diegodesire.modelo;


import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import es.iespuerto.diegodesire.utils.Utilidades;



public class AlmacenTest {
    Almacen almacen;

    
    private static final String codAlmacen = "codigo";
    private static final String codProducto = "0944-4303";
    private static final int cantMax = 5;
    private static final int cantAct= 3;

    private static final String ficheroAlmacen = "almacen.csv";

    private List<Almacen> almacenes = new ArrayList<>();
    Utilidades utilidades = new Utilidades();

    @BeforeEach
    public void BeforeEach() throws FileNotFoundException, URISyntaxException{
        if(almacen == null) {
            almacen = new Almacen(codAlmacen, codProducto,cantMax,cantAct);
            almacenes = utilidades.leerAlmacen(ficheroAlmacen);
        }
    }

    @Test
    public void constructorDefectoTest(){
        almacen = new Almacen();
        assertNotNull(almacen, "El objeto Almacen no puede ser nulo");
    }

    @Test
    public void constructorCuatroParametrosTest(){
        assertNotNull(almacen,"El ojeto Almacen no puede ser nulo");
    }

    @Test
    public void gettersTest(){
        Assertions.assertEquals(codAlmacen,almacen.getCodAlmacen(),"El codigo no es el esperado.");
        Assertions.assertEquals(codProducto,almacen.getCodProducto(),"El codigo producto no es el esperado.");   
    }

    @Test 
    public void buscarProductoTest() {
        Assertions.assertEquals(almacen, almacen.buscarProducto(codProducto, almacenes), "La operacion de buscar producto no funciona correctamente.");
    }
    
    @Test 
    public void buscarProductoFalseTest() {
        almacen = new Almacen(codAlmacen, "4750-2356", cantMax, cantAct);
        Assertions.assertNull(almacen.buscarProducto(codAlmacen, almacenes), "El producto no existe o no fue aniadido.");
    }

    @Test
    public void equalsFalseTest() {
        Almacen comparar = new Almacen("codigo2","cod", 2,5);
        // cero no es igual a lo que nos esta devolviendo
        Assertions.assertFalse(almacen.equals(comparar), "El objeto no puede ser igual");
    }

    @Test
    public void equalsTest() {
        Assertions.assertTrue(almacen.equals(almacen), "El objeto no puede ser igual");
    }

    @Test 
    public void toStringTest(){
        Assertions.assertNotNull(almacen.toString(),"La respuesta es nula");
        Assertions.assertTrue(almacen.toString().contains(codAlmacen),"No contiene el codigo");
        Assertions.assertTrue(almacen.toString().contains(codProducto),"No contiene el codigo producto");
    }


}
