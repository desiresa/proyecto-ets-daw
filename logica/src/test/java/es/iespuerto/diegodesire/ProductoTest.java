package es.iespuerto.diegodesire;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
    Producto producto;

    @BeforeEach
    public void BeforeEach() {
        if (producto == null) {
            Almacen almacen = new Almacen("AB123", producto, 5, 2);
            Proveedor proveedor = new Proveedor("33452136H", "SpeedLine", "C/ La Tajita, 40", "922233445");
            producto = new Producto("P1232",almacen,"Pieza", "Descripcion de la pieza", 2, 2.15, 3.15, proveedor);

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
    public void getcodProductoTest() {
        producto.getcodProducto();
        assertTrue(producto.getcodProducto().equals("P1232"));
    }

    @Test
    public void setcodProductoTest(){
        producto.setcodProducto("P1232");
        assertTrue(producto.getcodProducto().equals("P1232"));
    }

    @Test
    public void getNombreTest(){
        producto.getNombre();
        assertTrue(producto.getNombre().equals("Pieza"));
    }

    @Test
    public void setNombreTest(){
        producto.setNombre("Pieza");
        assertTrue(producto.getNombre().equals("Pieza"));
    }

    @Test
    public void getDescripcionTest() {
        producto.getDescripcion();
        assertTrue(producto.getDescripcion().equals("Descripcion de la pieza"));
    }

    @Test
    public void setDescripcionTest() {
        producto.setDescripcion("Descripcion de la pieza");
        assertTrue(producto.getDescripcion().equals("Descripcion de la pieza"));
    }

    @Test
    public void getCantDispTest() {
        producto.getCantDisp();
        assertEquals(2,producto.getCantDisp());
    }

    @Test
    public void setCantDispTest(){
        producto.setCantDisp(2);
        assertEquals(2,producto.getCantDisp());
    }

    @Test
    public void getPrecioCosteTest() {
        producto.getPrecioCoste();
        assertEquals(2.15,producto.getPrecioCoste());
    }

    @Test 
    public void setPrecioCosteTest(){
        producto.setPrecioCoste(2.15);
        assertEquals(2.15,producto.getPrecioCoste());
    }

    @Test
    public void getPrecioVentaTest(){
        producto.getPrecioVenta();
        assertEquals(3.15,producto.getPrecioVenta());
    }

    @Test
    public void setPrecioVentaTest(){
        producto.setPrecioVenta(3.15);
        assertEquals(3.15,producto.getPrecioVenta());
    }
}