package es.iespuerto.diegodesire.controlador;


import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import es.iespuerto.diegodesire.modelo.Administrador;
import es.iespuerto.diegodesire.modelo.Almacen;
import es.iespuerto.diegodesire.modelo.Pedido;
import es.iespuerto.diegodesire.modelo.Producto;
import es.iespuerto.diegodesire.modelo.Proveedor;

public class ControladorTest {
    Controlador controlador;
    Pedido pedido;
    Producto producto;
    Proveedor proveedor;
    Almacen almacen;
    Administrador administrador;

    public static final String codigoPedido= "codigo";
    public static final String codProducto = "codigo";
    public static final double precioCoste = 1;
    public static final String cifProveedor = "cif";
    public static final String fechaPedido = "19-20-2021";
    public static final int cantidadProducto = 1;
    public static final double totalPedido = 1;
    public static final boolean enviado = false;
    public static final String codAlmacen = "codAlmacen";
    public static final String nombreProducto = "nombreProducto";
    public static final String descripcion = "19-20-2021";
    public static final double precioVenta = 1;
    public static final String nombreProveedor = "Nombre proveedor";
    private static final int cantMax = 5;
    private static final int cantAct= 3;
    public static final String direccion = "direccion";
    public static final String telefono = "654-654-654";
    public static final String CIF= "C3546";
    public static final String usuario = "admin";
    public static final String email = "email";
    public static final String password = "adminadmin";

    @BeforeEach
    public void BeforeEach() throws FileNotFoundException, URISyntaxException {
        if (controlador == null) {
            controlador = new Controlador();
            pedido = new Pedido(codigoPedido, codProducto, precioCoste, cifProveedor, 
                fechaPedido, cantidadProducto, totalPedido, enviado);
            producto = new Producto(codProducto, codAlmacen, nombreProducto, descripcion, 
                cantidadProducto, precioCoste,precioVenta,nombreProveedor);
            almacen = new Almacen(codAlmacen, codProducto,cantMax,cantAct);
            proveedor = new Proveedor(cifProveedor, nombreProveedor, direccion, telefono);
            administrador = new Administrador(CIF, usuario, email, password);
        }
    }

    @Test 
    public void constructorDefectoTest() {
        assertNotNull(controlador,"El objeto controlador no puede ser nulo");
    }

    @Test
    public void addPedidoTest() {
        controlador.addPedido(pedido);
        Assertions.assertNotNull(controlador.buscarPedido(pedido.getCodigoPedido()), 
            "El añadido no es el esperado");
    }

    @Test
    public void eliminarPedidoFalseTest() {
        Assertions.assertFalse(controlador.eliminarPedido(pedido.getCodigoPedido()));
    }

    @Test
    public void elimnarPedidoTrueTest() {
        controlador.addPedido(pedido);
        Assertions.assertTrue(controlador.eliminarPedido(pedido.getCodigoPedido()), 
            "La operacion de eliminar pedido no funciona correctamente.");
    }

    @Test 
    public void modificarPedidoTest() {
        controlador.addPedido(pedido);
        Assertions.assertEquals(pedido, controlador.modificarPedido(pedido.getCodigoPedido(), pedido), 
            "No se modifico el pedido");
    }

    @Test 
    public void modificarPedidoFalseTest() {
        Assertions.assertNull(controlador.modificarPedido(pedido.getCodigoPedido(), pedido), 
            "No se modifico el pedido");
    }

    @Test 
    public void buscarPedidoTest() {
        controlador.addPedido(pedido);
        Assertions.assertEquals(pedido, controlador.buscarPedido(pedido.getCodigoPedido()), 
            "No se encontro el pedido");
    }

    @Test 
    public void buscarPedidoFalseTest() {
        controlador.addPedido(new Pedido("4152", codProducto, precioCoste, 
            cifProveedor, fechaPedido,cantidadProducto,totalPedido,enviado));
        Assertions.assertNull(controlador.buscarPedido(pedido.getCodigoPedido()), "No se encontro el proveedor");
    }

    @Test
    public void addProductoTest() {
        controlador.addProducto(producto);
        Assertions.assertNotNull(controlador.buscarProducto(producto.getCodProducto()), "El añadido no es el esperado");
    }

    @Test
    public void elimnarProductoFalseTest() {
        Assertions.assertFalse(controlador.eliminarProducto(producto.getCodProducto()));
    }

    @Test
    public void elimnarProductoTrueTest() {
        controlador.addProducto(producto);
        Assertions.assertTrue(controlador.eliminarProducto(pedido.getCodProducto()));
    }

    @Test 
    public void modificarProductoTest() {
        controlador.addProducto(producto);
        Assertions.assertEquals(producto, controlador.modificarProducto(producto.getCodProducto(), producto), 
            "No se modifico el producto");
    }

    @Test 
    public void modificarProductoFalseTest() {
        Assertions.assertNull(controlador.modificarProducto(producto.getCodProducto(), producto), 
            "No se modifico el producto");
    }

    @Test 
    public void buscarProductoTest() {
        controlador.addProducto(producto);
        Assertions.assertEquals(producto, controlador.buscarProducto(producto.getCodProducto()), 
            "No se encontro el producto");
    }

    @Test 
    public void buscarProductoFalseTest() {
        controlador.addProducto(new Producto("448-735", codAlmacen, nombreProducto, 
            descripcion, cantidadProducto, precioCoste,precioVenta,nombreProveedor));
        Assertions.assertNull(controlador.buscarProducto(producto.getCodProducto()), 
            "No se encontro el proveedor");
    }

    @Test
    public void addProveedorTest() {
        controlador.addProveedor(proveedor);
        Assertions.assertNotNull(controlador.buscarProveedor(proveedor.getcifProveedor()), 
            "El añadido no es el esperado");
    }

    @Test
    public void eliminarProveedorFalseTest() {
        Assertions.assertFalse(controlador.eliminarProveedor(proveedor.getcifProveedor()));
    }

    @Test
    public void eliminarProveedorTrueTest() {
        controlador.addProveedor(proveedor);
        Assertions.assertTrue(controlador.eliminarProveedor(proveedor.getcifProveedor()));
    }

    @Test 
    public void modificarProveedorTest() {
        controlador.addProveedor(proveedor);
        Assertions.assertEquals(proveedor, controlador.modificarProveedor(proveedor.getcifProveedor(), proveedor), 
            "No se modifico el proveedor");
    }

    @Test 
    public void modificarProveedorFalseTest() {
        Assertions.assertNull(controlador.modificarProveedor(proveedor.getcifProveedor(), proveedor), 
            "No se modifico el proveedor");
    }

    @Test 
    public void buscarProveedorTest(){
        controlador.addProveedor(proveedor);
        Assertions.assertEquals(proveedor, controlador.buscarProveedor(proveedor.getcifProveedor()), 
            "No se encontro el proveedor");
    }

    @Test 
    public void buscarProveedorFalseTest() {
        controlador.addProveedor(new Proveedor("cif2", nombreProveedor, direccion, telefono));
        Assertions.assertNull(controlador.buscarProveedor(proveedor.getcifProveedor()), 
            "No se encontro el proveedor");
    }

    @Test 
    public void buscarProductoAlmacenTest() {
        controlador.addAlmacen(almacen);
        Assertions.assertEquals(almacen, controlador.buscarProductoAlmacen(almacen.getCodProducto()), 
            "No se encontro el producto en el almacen");
    }

    @Test 
    public void buscarProductoAlmacenFalseTest() {
        controlador.addAlmacen(new Almacen(codAlmacen, "codigo2", cantMax, cantAct));
        Assertions.assertNull(controlador.buscarProductoAlmacen(almacen.getCodProducto()), 
            "No se encontro el producto en el almacen");
    }

    @Test
    public void comprobarCredencialesTest() {
        controlador.addAdministrador(administrador);
        Assertions.assertTrue(controlador.comprobarCredenciales(administrador.getUsuario(), 
            administrador.getContrasenia()));
    }

    @Test
    public void comprobarCredencialesFalseTest() {
        controlador.addAdministrador(administrador);
        Assertions.assertFalse(controlador.comprobarCredenciales(administrador.getUsuario(), 
            "admin1"));
    }
}
