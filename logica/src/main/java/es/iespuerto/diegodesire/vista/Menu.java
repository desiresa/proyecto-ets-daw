package es.iespuerto.diegodesire.vista;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.*;

import es.iespuerto.diegodesire.modelo.Pedido;
import es.iespuerto.diegodesire.modelo.Producto;
import es.iespuerto.diegodesire.controlador.Controlador;
import es.iespuerto.diegodesire.modelo.Proveedor;
import es.iespuerto.diegodesire.modelo.Almacen;
import es.iespuerto.diegodesire.utils.Utilidades;

/**
 * Esta clase contiene el menu principal de la aplicacion
 * 
 * @version 1.0 12/05/2022
 * @author Mª Desiré Sánchez Álvarez, Juan Diego Mesa Alvarez
 */

public class Menu {

    Utilidades utilidades = new Utilidades();
    Pedido pedido;
    Proveedor proveedor;
    Producto producto;
    static Scanner teclado = new Scanner(System.in);
    static Controlador controlador;
    int opcion;


    /**
     * Metodo que permite iniciar sesion, leyendo desde fichero
     * los datos del administrador
     * @throws URISyntaxException
     * @throws FileNotFoundException
     */
    public void iniciarSesion() throws FileNotFoundException, URISyntaxException {
        controlador = new Controlador();
        if (Menu.pedirCredenciales()) {
            menuOpciones();
        }
    }

    /**
     * Metodo que imprime el menu principal
     */
    public void menuPrincipal() throws FileNotFoundException, URISyntaxException {
        System.out.println("\n---Bienvenido a Gestor DD---\n");
        System.out.println("1. Iniciar sesión.");
        System.out.println("2. Salir.");
        System.out.print("\nEscoge una opción... ");
        opcion = Integer.parseInt(teclado.nextLine());
        switch (opcion) {
            case 2:
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            case 1:
                iniciarSesion();
                break;
            default:
                System.out.println("Has introducido una opción errónea.");
        }
    }

    /**
     * Metodo que imprime el menu de opciones
     */
    public void menuOpciones() {
        System.out.println("\n---Menú principal---\n");
        System.out.println("1) Almacén");
        System.out.println("2) Productos");
        System.out.println("3) Proveedores");
        System.out.println("4) Pedidos");
        System.out.print("\nEscoge una opción... ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 4: 
                menuPedidos();
                break;
            case 3: 
                menuProveedores();
                break;
            case 2: 
                menuProductos();
                break;
            case 1: 
                menuAlmacen();
                break;
            default: 
                System.out.println("Has introducido una opción errónea.");
        }
    }

    /**
     * Metodo que muestra el menu de opciones de los pedidos
     */
    public void menuPedidos() {
        System.out.println("\n--- Menú pedidos---\n");
        System.out.println("1) Añadir pedido");
        System.out.println("2) Consultar pedido");
        System.out.println("3) Modificar pedido");
        System.out.println("4) Eliminar pedido");
        System.out.println("5) Volver atrás");
        System.out.print("\nEscoge una opción... ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        String codigoPedido;
        switch (opcion) {
            case 5:
                menuOpciones();
                break;
            case 4: 
                System.out.print("\nIntroduce el código del pedido a eliminar: ");
                codigoPedido = teclado.nextLine();
                if (controlador.eliminarPedido(codigoPedido)) {
                    System.out.println("Se ha eliminado el pedido.");
                } else {
                    System.out.println("El pedido no existe.");
                }
                menuPedidos();
                break;
            case 3: 
                System.out.println("Introduce los nuevos datos, el codigo del pedido debe ser igual: \n");
                pedido = generaDatosPedido();
                controlador.modificarPedido(pedido.getCodigoPedido(), pedido);
                if (controlador.buscarPedido(pedido.getCodigoPedido()).equals(pedido)) {
                    System.out.println("\nPedido modificado. Datos del pedido:");
                    System.out.println(pedido.toString()); // esta imprimiendo el pedido
                } else {
                    System.out.println("\nNo se ha modificado el pedido.");
                }
                menuPedidos();
                break;
            case 2: 
                System.out.print("\nIntroduce el código del pedido a consultar: ");
                codigoPedido = teclado.nextLine();
                controlador.buscarPedido(codigoPedido);
                if (pedido != null) {
                    System.out.printf("Mostrando datos del pedido %s: \n", codigoPedido);
                    System.out.println("\nDatos del pedido " + pedido.getCodigoPedido() + ":\n" + pedido.toString());
                } else {
                    System.out.println("\nNo existe el pedido.");
                }
                menuPedidos();
                break;
            case 1: 
                System.out.println("Introduce los datos del pedido:");
                pedido = generaDatosPedido();
                controlador.addPedido(pedido);
                if (controlador.buscarPedido(pedido.getCodigoPedido()).equals(pedido)) {
                    System.out.println("\nPedido insertado. Datos del pedido:");
                    System.out.println(pedido.toString()); // esta imprimiendo el pedido
                } else {
                    System.out.println("\nNo se ha insertrado el pedido.");
                }
                menuPedidos();
                break;
            default: 
                System.out.println("Has introducido una opción errónea.");
        }
    }

    /**
     * Metodo que muestra el menu de opciones de los proveedores
     */
    public void menuProveedores() {
        System.out.println("\n---Menú proveedores---\n");
        System.out.println("1) Añadir proveedor");
        System.out.println("2) Consultar proveedor");
        System.out.println("3) Modificar proveedor");
        System.out.println("4) Eliminar proveedor");
        System.out.println("5) Volver atrás");
        System.out.print("\nEscoge una opción... ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        Proveedor proveedor;
        String codigoProveedor;
        switch (opcion) {
            case 5:
                menuOpciones();
                break;
            case 4: 
                System.out.println("Introduce el código del proveedor a eliminar: ");
                codigoProveedor = teclado.nextLine();
                if (controlador.eliminarProveedor(codigoProveedor)) {
                    System.out.println("Se ha eliminado el proveedor.");
                } else {
                    System.out.println("El proveedor no existe.");
                }
                menuProveedores();
                break;
            case 3: 
                System.out.println("Introduce los nuevos datos, el código del proveedor debe ser igual: \n");
                proveedor = generaDatosProveedor();
                controlador.modificarProveedor(proveedor.getcifProveedor(), proveedor);
                if (controlador.buscarProveedor(proveedor.getcifProveedor()).equals(proveedor)) {
                    System.out.println("\nProveedor modificado. Datos del proveedor:");
                    System.out.println(proveedor.toString());
                } else {
                    System.out.println("\nNo se ha modificado el proveedor.");
                }
                menuProveedores();
                break;
            case 2: 
                System.out.println("Introduce el código del proveedor a consultar: ");
                codigoProveedor = teclado.nextLine();
                proveedor = controlador.buscarProveedor(codigoProveedor);
                if (proveedor != null) {
                    System.out.printf("Mostrando datos del proveedor %s: \n", codigoProveedor);
                    System.out.println("\nDatos del proveedor " + proveedor.getcifProveedor() + ":\n" + proveedor.toString());
                } else {
                    System.out.println("\nNo existe el proveedor.");
                }
                menuProveedores();
                break;
            case 1: 
                System.out.println("Introduce los datos del proveedor:");
                proveedor = generaDatosProveedor();
                controlador.addProveedor(proveedor);
                if (controlador.buscarProveedor(proveedor.getcifProveedor()).equals(proveedor)) {
                    System.out.println("\nProveedor insertado. Datos del proveedor:");
                    System.out.println(proveedor.toString());
                } else {
                    System.out.println("\nNo se ha insertrado el proveedor.");
                }
                menuProveedores();
                break;
            default:
                System.out.println("Has introducido una opción errónea.");
        }
    }

    /**
     * Metodo que muestra el menu de opciones de los productos
     */
    public void menuProductos() {
        System.out.println("\n---Menú productos---\n");
        System.out.println("1) Añadir producto");
        System.out.println("2) Consultar producto");
        System.out.println("3) Modificar producto");
        System.out.println("4) Eliminar producto");
        System.out.println("5) Volver atrás");
        System.out.print("Escoge una opción... ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        Producto producto;
        String codigoProducto = null;
        switch (opcion) {
            case 5:
                menuOpciones();
                break;
            case 4: 
                System.out.println("Introduce el código del producto a eliminar: ");
                codigoProducto = teclado.nextLine();
                if (controlador.eliminarProducto(codigoProducto)) {
                    System.out.println("Se ha eliminado el producto.");
                } else {
                    System.out.println("El producto no existe.");
                }
                menuProductos();
                break;
            case 3: 
                System.out.println("Introduce los nuevos datos, el codigo del producto debe ser igual: ");
                producto = generaDatosProducto();
                controlador.modificarProducto(producto.getCodProducto(), producto);
                if (controlador.buscarProducto(producto.getCodProducto()).equals(producto)) {
                    System.out.println("\nProducto modificado. Datos del producto:");
                    System.out.println(producto.toString());
                } else {
                    System.out.println("\nNo se ha modificado el producto.");
                }
                menuProductos();
                break;
            case 2: 
                System.out.println("Introduce el código del producto a consultar: ");
                codigoProducto = teclado.nextLine();
                producto = controlador.buscarProducto(codigoProducto);
                if (producto != null) {
                    System.out.printf("Mostrando datos del producto %s: \n", codigoProducto);
                    System.out.println("\nDatos del producto " + producto.getCodProducto() + ":\n" + producto.toString());
                } else {
                    System.out.println("\nNo existe el producto.");
                }
                menuProductos();
                break;
            case 1: 
                System.out.println("Introduce los datos del producto:");
                producto = generaDatosProducto();
                controlador.addProducto(producto);
                if (controlador.buscarProducto(producto.getCodProducto()).equals(producto)) {
                    System.out.println("\nProducto insertado. Datos del producto:");
                    System.out.println(producto.toString());
                } else {
                    System.out.println("\nNo se ha insertrado el producto.");
                }
                menuProductos();
                break;
            default: 
                System.out.println("Has introducido una opción errónea.");
        }
    }

    /**
     * Metodo que muestra el menu de opciones del almacen
     */
    public void menuAlmacen() {
        System.out.println("\n---Menú almacén---\n");
        System.out.println("1) Localizar producto");
        System.out.println("2) Volver atrás");
        System.out.print("Escoge una opción... ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        String codigoProducto;
        Almacen almacen;
        switch (opcion) {
            case 2:
                menuOpciones();
                break;
            case 1:
                System.out.print("\nIntroduce el código del producto a localizar: ");
                codigoProducto = teclado.nextLine();
                almacen = controlador.buscarProductoAlmacen(codigoProducto);
                System.out.println(almacen.toString());
                menuAlmacen();
                break;
            default:
                System.out.println("Has introducido una opción errónea.");
        }
    }

    /**
     * Metodo que genera los datos del pedido a insertar / modificar.
     * @return pedido insertado / modificado.
     */
    private Pedido generaDatosPedido() {
        System.out.print("Introduce el codigo del pedido: ");
        String codPedido = teclado.nextLine();
        System.out.print("Introduce el codigo del producto: ");
        String codProducto = teclado.nextLine();
        System.out.print("Introduce el precio de coste: ");
        double precioCoste = Double.parseDouble(teclado.nextLine());
        System.out.print("Introduce el codigo del proveedor: ");
        String cifProveedor = teclado.nextLine();
        System.out.print("Introduce la fecha del pedido: ");
        String fecha = teclado.nextLine();
        System.out.print("Introduce la cantidad del producto: ");
        int cantProducto = Integer.parseInt(teclado.nextLine());
        System.out.print("Total del pedido: ");
        double total = Double.parseDouble(teclado.nextLine());
        System.out.print("Enviado: ");
        boolean enviado = teclado.nextBoolean();

        Pedido pedido = new Pedido(codPedido, codProducto, precioCoste, cifProveedor, 
            fecha, cantProducto, total, enviado);
        return pedido;
    }

    /**
     * Metodo que genera los datos del proveedor a insertar / modificar.
     * @return proveedor insertado / modificado.
     */
    private Proveedor generaDatosProveedor() {
        System.out.print("Introduce el CIF del proveedor: ");
        String cifProveedor = teclado.nextLine();
        System.out.print("\nIntroduce el nombre del proveedor: ");
        String nombreProveedor = teclado.nextLine();
        System.out.print("\nIntroduce la dirección: ");
        String direccion = teclado.nextLine();
        System.out.print("\nIntroduce el teléfono: ");
        String telefono = teclado.nextLine();

        Proveedor proveedor = new Proveedor(cifProveedor, nombreProveedor, direccion, telefono);
        return proveedor;
    }

    /**
     * Metodo que genera los datos del producto a insertar / modificar.
     * @return producto insertado / modificado.
     */
    private Producto generaDatosProducto() {
        System.out.print("Introduce el codigo del producto: ");
        String codProducto = teclado.nextLine();
        System.out.print("Introduce el codigo del almacen: ");
        String codAlmacen = teclado.nextLine();
        System.out.print("Introduce el nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Introduce la descripcion: ");
        String descripcion = teclado.nextLine();
        System.out.print("Introduce la cantidad de producto: ");
        int cantidadProducto = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduce el precio de coste: ");
        double precioCoste = Double.parseDouble(teclado.nextLine());
        System.out.print("Se calcula el precio venta añadiendole un 20% ");
        double precioVenta = Double.parseDouble(teclado.nextLine());
        System.out.print("Introduce el nombre del proveedor: ");
        String nombreProveedor = teclado.nextLine();

        Producto producto = new Producto(codProducto, codAlmacen, nombre, descripcion, 
            cantidadProducto, precioCoste, precioVenta, nombreProveedor);
        return producto;
    }

    /**
     * Metodo que pide las credenciales del administrador
     * @return True si las credenciales del administrador coinciden, false en caso contrario
     */
    public static boolean pedirCredenciales() {
        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = teclado.nextLine();
        System.out.print("Introduce tu contraseña: ");
        String contrasenia = teclado.nextLine();
        return controlador.comprobarCredenciales(usuario, contrasenia);
    }

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        Menu menu = new Menu();
        menu.menuPrincipal();
    }
}
