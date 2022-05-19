package es.iespuerto.diegodesire.controlador;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.*;

import es.iespuerto.diegodesire.modelo.Administrador;
import es.iespuerto.diegodesire.modelo.Almacen;
import es.iespuerto.diegodesire.modelo.Pedido;
import es.iespuerto.diegodesire.modelo.Producto;
import es.iespuerto.diegodesire.modelo.Proveedor;
import es.iespuerto.diegodesire.utils.Utilidades;

public class Controlador {
    List<Pedido> pedidos;
    List<Producto> productos;
    List<Proveedor> proveedores;
    List<Almacen> almacenes;
    List<Administrador> administradores;

    Utilidades utilidades = new Utilidades();

    public Controlador() throws FileNotFoundException, URISyntaxException {
        leerDatos();
    }

    /**
     * Metodos de la clase main
     */

    /**
     * Metodo que permite leer todos los datos de los ficheros
     * y se asignan a sus correspondientes listas
     * @throws URISyntaxException
     * @throws FileNotFoundException Excepcion si no se encuentra el fichero
     */
    public void leerDatos() throws FileNotFoundException, URISyntaxException {
        administradores = utilidades.leerAdministrador("datosadministrador.csv");
        pedidos = utilidades.leerPedidos("pedido.csv");
        productos = utilidades.leerProductos("productos.csv");
        almacenes = utilidades.leerAlmacen("almacen.csv");
        proveedores = utilidades.leerProveedores("proveedor.csv");
    }

    /**
     * Metodo que comprueba las credenciales del administrador
     * recibidas desde el menu
     * @param nombre nombre del administrador
     * @param contrasenia Contrasenia del administrador
     * @param administrador Lista de administradores
     * @return True si el nombre y contrasenia coinciden
     */
    public boolean comprobarCredenciales(String usuario, String contrasenia) {
        for (Administrador admin : administradores) {
            if (!admin.getContrasenia().equals(contrasenia) || !admin.getUsuario().equals(usuario)) {
                System.out.println("El usuario o contraseña son incorrectos.");
                return false;
            }
        }
        System.out.printf("\nSe ha iniciado sesión como %s\n", usuario);
        return true;
    }

    /**
     * Metodos de la clase Pedido
     */

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public boolean eliminarPedido(String codigo) {
        for (Pedido producto : pedidos) {
            if (producto.getCodigoPedido().equals(codigo)) {
                pedidos.remove(producto);
                return true;
            }
        }
        return false;
    }

    public Pedido modificarPedido(String codigoPedido, Pedido pedido) {
        Pedido pedidoOld = buscarPedido(codigoPedido);
        if (pedidoOld != null) {
            pedidos.remove(pedidoOld);
            pedidos.add(pedido);
            return pedido;
        }
        return null;
    }

    public Pedido buscarPedido(String codigo) {
        for (Pedido pedido : pedidos) {
            if (pedido.getCodigoPedido().equals(codigo)) {
                return pedido;
            }
        }
        return null;
    }

    /**
     * Metodos de la clase Producto
     */

    /**
     * Metodo que permite anadir un producto
     * @param producto Producto 
     */
    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Eliminar todos los datos de un producto
     * @param codigo Codigo del producto
     * @return
     */
    public boolean eliminarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodProducto().equals(codigo)) {
                productos.remove(producto);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que permite modificar un producto
     * @param codigo Codigo que nos permite encontrar el producto a modificar
     * @param cantidad Cantidad
     * @return
     */
    public Producto modificarProducto(String codigo, Producto producto) {
        Producto productoOld = buscarProducto(codigo);
        if (productoOld != null) {
            productos.remove(productoOld);
            productos.add(producto);
            return producto;
        }
        return null;
    }

    /**
     * Metodo que permite buscar un producto
     * @param codigo Codigo que nos permite encontrar el producto
     * @return Producto si se encuentra, null al contrario
     */
    public Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodProducto().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Metodos de la clase Proveedor
     */

    /**
     * Relacionar el proveedor con el codigo del producto, para saber quien nos ha enviado que, y que productos
     * @param proveedor
     * @param pedido
     */
    public void addProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
	}

    /**
     * Metodo que elimina un proveedor
     * @param codigo codigo del proveedor
     * @param prov lista de proveedores
     * @return true si se elimina, false en caso contrario
     */
    public boolean eliminarProveedor(String codigoProveedor){
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getcifProveedor().equals(codigoProveedor)) {
                proveedores.remove(proveedor);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que permite modificar un proveedor
     * @param proveedor
     * @param codProducto
     * @return
     */
    public Proveedor modificarProveedor(String codigo, Proveedor proveedor) {
        Proveedor proovedorOld = buscarProveedor(codigo);
        if (proovedorOld != null) {
            proveedores.remove(proovedorOld);
            proveedores.add(proveedor);
            return proveedor;
        }
        return null;
    }

    /**
     * Metodo que permite buscar un proveedor mediante su codigo de proveedor
     * @param codigo Codigo de proveedor
     * @param prov Lista de proveedores
     * @return Proveedor si lo encuentra, null en caso contario
     */
    public Proveedor buscarProveedor(String codigo) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getcifProveedor().equals(codigo)) {
                return proveedor;
            }
        }
        return null;
    }

    /**
     * Metodos de la clase Almacen
     */

     /**
      * Metodo que permite aniadir un almacen
      * @param almacen
      */
    public void addAlmacen(Almacen almacen) {
        almacenes.add(almacen);
	}

    /**
     * Buscar el producto por el codigo, y mostrar todos los datos de ese producto en caso de que exista
     * Los codigos de los productos son unicos, y solo nos deberia devolver un producto
     * @param codigoProducto
     */
    public Almacen buscarProductoAlmacen(String codigo) {
        for (Almacen almacen : almacenes) {
            if (almacen.getCodProducto().equals(codigo)) {
                return almacen;
            }
        }
        return null;
    }

    /**
     * Metodos de la clase administrador
     */

    public void addAdministrador(Administrador administrador) {
        administradores.add(administrador);
    }
}
