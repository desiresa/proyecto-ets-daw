package es.iespuerto.diegodesire.modelo;


import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import es.iespuerto.diegodesire.utils.Utilidades;


public class ProveedorTest {
    Proveedor proveedor;

    public static final String cifProveedor="cif";
    public static final String nombreProveedor = "nombre";
    public static final String direccion = "direccion";
    public static final String telefono = "654-654-654";

    private static final String ficheroProveedores = "proveedor.csv";


    List<Proveedor> proveedores = new ArrayList<>();
    Utilidades utilidades = new Utilidades();

    @BeforeEach
    public void BeforeEach() throws FileNotFoundException, URISyntaxException {
        if (proveedor == null) {
            proveedor = new Proveedor(cifProveedor, nombreProveedor, direccion, telefono);
            proveedores = utilidades.leerProveedores(ficheroProveedores);
        }
    }

    @Test
    public void constructorDefectoTest() {
        proveedor = new Proveedor();
        assertNotNull(proveedor, "El objeto Proveedor no puede ser nulo");
    }

    @Test
    public void constructorCuatroParametrosTest() {
        assertNotNull(proveedor, "El objeto Proveedor no puede ser nulo");
    }

    @Test
    public void gettersTest() {
        Assertions.assertEquals(nombreProveedor, proveedor.getnombreProveedor(),"El nombre no es el esperado");
        Assertions.assertEquals(cifProveedor, proveedor.getcifProveedor(), "El cif proveedor no es el esperado");
        Assertions.assertEquals(direccion, proveedor.getDireccion(), "La direccion no es la esperada");
        Assertions.assertEquals(telefono, proveedor.getTelefono(), "El telefono no es el esperado");
    }

    @Test
    public void settersTest() {
        proveedor.setnombreProveedor("SpeedLine");
        assertTrue(proveedor.getnombreProveedor().equals("SpeedLine"));
        proveedor.setDireccion("C/ La Tajita, 40");
        assertTrue(proveedor.getDireccion().equals("C/ La Tajita, 40"));
        proveedor.setTelefono("922233445");
        assertTrue(proveedor.getTelefono().equals("922233445"));
    }

    @Test
    public void equalsFalseTest() {
        Proveedor comparar = new Proveedor("cif2", nombreProveedor, direccion, telefono);
        Assertions.assertFalse(proveedor.equals(comparar), "El objeto no puede ser igual");
    }

    @Test
    public void equalsTest() {
        Assertions.assertTrue(proveedor.equals(proveedor), "El objeto no puede ser igual");
    }

    @Test 
    public void toStringTest() {
        Assertions.assertNotNull(proveedor.toString(),"La respuesta es nula");
        Assertions.assertTrue(proveedor.toString().contains(nombreProveedor),"No contiene el nombre del Proveedor");
        Assertions.assertTrue(proveedor.toString().contains(direccion),"No contiene la descripcion del Proveedor");
    }
}

    

