package es.iespuerto.diegodesire.modelo;


import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import es.iespuerto.diegodesire.utils.Utilidades;


public class PedidoTest {
    Pedido pedido;
   
    public static final String codigoPedido= "codigo";
    public static final String codProducto = "codigo";
    public static final double precioCoste = 1;
    public static final String cifProveedor = "cif";
    public static final String fechaPedido = "19-20-2021";
    public static final int cantidadProducto = 1;
    public static final double totalPedido = 1;
    public static final boolean enviado = false;

    private static final String ficheroPedidos = "pedido.csv";

    List<Pedido> pedidos = new ArrayList<>();
    Utilidades utilidades = new Utilidades();

    @BeforeEach
    public void BeforeEach() throws FileNotFoundException, URISyntaxException{
        if(pedido == null) {
            pedido = new Pedido(codigoPedido,codProducto,precioCoste,cifProveedor,fechaPedido,cantidadProducto,totalPedido,enviado);
            pedidos = utilidades.leerPedidos(ficheroPedidos);
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
    public void gettersTest(){
        
        Assertions.assertEquals(codigoPedido,pedido.getCodigoPedido(),"El codigo no es el esperado");
        Assertions.assertEquals(precioCoste, pedido.getPrecioCoste(), "El Precio coste no es el esperado");
        Assertions.assertEquals(codProducto, pedido.getCodProducto(),"El codigo del producto no es correcto");
        Assertions.assertEquals(enviado, pedido.getenviado(), "El enviado no es correcto");
        Assertions.assertEquals(cantidadProducto, pedido.getCantidadProducto(), "La cantidad del pedido es erronea");
    }



    @Test
    public void equalsFalseTest() {
        Pedido comparar = new Pedido("codigo2", "", 2, "","",2,1.2, true);
        // cero no es igual a lo que nos esta devolviendo
        Assertions.assertFalse(pedido.equals(comparar), "El objeto no puede ser igual");
    }

    @Test
    public void equalsTrueTest() {
        Assertions.assertTrue(pedido.equals(pedido), "El objeto no puede ser igual");
    }

   
    @Test
    public void toStringTest() {
        Assertions.assertNotNull(pedido.toString(),"La respuesta es nula");
        Assertions.assertTrue(pedido.toString().contains(codigoPedido),"No contiene el codigo");
        Assertions.assertTrue(pedido.toString().contains(codProducto),"No contiene el descripcion");
    }

}
