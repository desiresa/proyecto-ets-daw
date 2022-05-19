package es.iespuerto.diegodesire.modelo;


import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import es.iespuerto.diegodesire.utils.Utilidades;


public class ProductoTest {
    Producto producto = null;

    
    public static final String codProducto = "codProducto" ;
    public static final String codAlmacen = "codAlmacen";
    public static final String nombreProducto = "nombreProducto";
    public static final String descripcion = "19-20-2021";
    public static final int cantidadProducto = 1;
    public static final double precioCoste = 1;
    public static final double precioVenta = 1;
    public static final String nombreProveedor = "Nombre proveedor";

    private static final String ficheroProductos = "productos.csv";

    List<Producto> productos = new ArrayList<>();
    Utilidades utilidades = new Utilidades();

    @BeforeEach
    public void BeforeEach() throws FileNotFoundException, URISyntaxException {
        if (producto == null) {
            producto = new Producto(codProducto, codAlmacen, nombreProducto, descripcion, cantidadProducto, precioCoste,precioVenta,nombreProveedor);
            productos = utilidades.leerProductos(ficheroProductos);
        }
    }

    @Test
    public void constructorDefectoTest() {
        producto = new Producto();
        assertNotNull(producto, "El objeto Producto no puede ser nulo");
    }

    @Test
    public void constructorOchoParametroTest() {
        assertNotNull(producto, "El objeto Producto no puede ser nulo");
    }

    @Test
    public void gettersTest() {
        Assertions.assertEquals(nombreProducto,producto.getNombreProducto(),"El nombre no es el esperado");
        Assertions.assertEquals(codProducto,producto.getCodProducto(), "El codigo producto no es el esperado");
        Assertions.assertEquals(codAlmacen,producto.getCodAlmacen(), "El codigo almacen no es el esperado");
    }

    @Test 
    public void equalsFalseTest(){
        Assertions.assertTrue(producto.equals(producto), "El objeto no puede ser igual");
    }

    @Test
    public void equalsTrueTest(){
        Assertions.assertNotNull(producto.toString(),"La respuesta es nula");
        Assertions.assertTrue(producto.toString().contains((CharSequence) codProducto),"No contiene el codigo");
        Assertions.assertTrue(producto.toString().contains(nombreProducto),"No contiene el nombre del Producto");
    
    }

    @Test
    public void toStringTest() {
        Assertions.assertNotNull(producto.toString(),"La respuesta es nula");
        Assertions.assertTrue(producto.toString().contains(nombreProducto),"No contiene el nombre del Producto");
        Assertions.assertTrue(producto.toString().contains(descripcion),"No contiene la descripcion del Producto");
    }
}