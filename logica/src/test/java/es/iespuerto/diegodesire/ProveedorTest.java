package es.iespuerto.diegodesire;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProveedorTest {
    Proveedor proveedor;

    @BeforeEach
    public void BeforeEach() {
        if (proveedor == null) {
            proveedor = new Proveedor("33452136H", "SpeedLine", "C/ La Tajita, 40", "922233445");
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
    public void getCifProvTest() {
        proveedor.getcifProv();
        assertTrue(proveedor.getcifProv().equals("33452136H"));
    }

    @Test
    public void setCIFTest() {
        proveedor.setcifProv("33452136H");
        assertTrue(proveedor.getcifProv().equals("33452136H"));
    }

    @Test
    public void getNombreProveedorTest() {
        proveedor.getnombreProveedor();
        assertTrue(proveedor.getnombreProveedor().equals("SpeedLine"));
    }

    @Test
    public void setNombreProveedorTest() {
        proveedor.setnombreProveedor("SpeedLine");
        assertTrue(proveedor.getnombreProveedor().equals("SpeedLine"));
    }

    @Test
    public void getDireccionTest() {
        proveedor.getDireccion();
        assertTrue(proveedor.getDireccion().equals("C/ La Tajita, 40"));
    }

    @Test
    public void setDireccionTest() {
        proveedor.setDireccion("C/ La Tajita, 40");
        assertTrue(proveedor.getDireccion().equals("C/ La Tajita, 40"));
    }

    @Test
    public void getTelefonoTest() {
        proveedor.getTelefono();
        assertTrue(proveedor.getTelefono().equals("922233445"));
    }

    @Test
    public void setTelefonoTest() {
        proveedor.setTelefono("922233445");
        assertTrue(proveedor.getTelefono().equals("922233445"));
    }
}
