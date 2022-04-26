package es.iespuerto.diegodesire;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlmacenTest {
    Almacen almacen;
    Producto producto;


    @BeforeEach
    public void BeforeEach(){
        if(almacen == null){
            Proveedor proveedor = new Proveedor("33452136H", "SpeedLine", "C/ La Tajita, 40", "922233445");
            producto = new Producto("P1232",almacen,"Pieza", "Descripciom de la pieza", 2, 2.15, 3.15, proveedor);
            almacen = new Almacen("C023", producto,5,2);
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
    public void getCodAlmacenTest(){
        almacen.getCodAlmacen();
        assertTrue(almacen.getCodAlmacen().equals("C023"));
    }

    @Test
    public void setCodAlmacenTest(){
        almacen.setCodAlmacen("C023");
        assertTrue(almacen.getCodAlmacen().equals("C023"));
    }

    @Test 
    public void getCantMaxTest(){
        almacen.getCantMax();
        assertEquals(5,almacen.getCantMax());
    }

    @Test
    public void setCantMaxTest(){
        almacen.setCantMax(5);
        assertEquals(5,almacen.getCantMax());
    }

    @Test
    public void getCantActTest(){
        almacen.getCantAct();
        assertEquals(2,almacen.getCantAct());
    }

    @Test 
    public void setCantActTest(){
        almacen.setCantAct(2);
        assertEquals(2,almacen.getCantAct());
    }
}
