package es.iespuerto.diegodesire;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    Pedido pedido= null;
    Producto producto=null;
    Proveedor proveedor=null;

    @BeforeEach
    public void BeforeEach(){
        if(pedido == null){
            Almacen almacen = new Almacen("AB123", producto, 5, 2);
            Producto producto = new Producto("P1232",almacen,"Pieza", "Descripciom de la pieza", 2, 2.15, 3.15, proveedor);
            Proveedor proveedor = new Proveedor("33452136H", "SpeedLine", "C/ La Tajita, 40", "922233445");
            
            pedido = new Pedido("P0123",producto,producto,proveedor,"2021-10-10",5,10.5,true);
        }
    }

    @Test
    public void constructorDefectoTest(){
        pedido = new Pedido();
        assertNotNull(pedido, "El objeto Pedido no puede ser nulo");
    }

    @Test
    public void constructorSieteParametroTest(){
        assertNotNull(pedido, "El objeto Pedido no puede ser nulo");
    }

    @Test
    public void getCodigoPedidoTest(){
        pedido.getCodigoPedido();
        assertTrue(pedido.getCodigoPedido().equals("P0123"));
    }

    @Test
    public void setCodigoPedidoTest(){
        pedido.setCodigoPedido("P0123");
        assertTrue(pedido.getCodigoPedido().equals("P0123"));
    }


    @Test
    public void getFechaPedidoTest(){
        pedido.getFechaPedido();
        assertTrue(pedido.getFechaPedido().equals("2021-10-10"));
        
    }

   @Test
    public void setFechaPedidoTest(){
        pedido.setFechaPedido("2021-10-10");
        assertTrue(pedido.getFechaPedido().equals("2021-10-10"));
    }

    @Test
    public void getCantidadTest(){
        pedido.getCantidad();
        assertEquals(5, pedido.getCantidad());
    }

    @Test
    public void setCantidadTest(){
        pedido.setCantidad(5);
        assertEquals(5, pedido.getCantidad());
    }

    @Test
    public void getTotalTest(){
        pedido.getTotal(2.10,5);
        assertEquals(10.5, pedido.getTotal(2.10, 5));
    }

    @Test
    public void getPagadoTest(){
        pedido.getPagado();
        assertTrue(pedido.getPagado().equals(true));
    }

    @Test
    public void setPagadoTest(){
        pedido.setPagado(true);
        assertTrue(pedido.getPagado().equals(true));
    }

}
