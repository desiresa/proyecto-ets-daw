package es.iespuerto.diegodesire.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.*;
import java.net.URL;

import es.iespuerto.diegodesire.modelo.Administrador;
import es.iespuerto.diegodesire.modelo.Almacen;
import es.iespuerto.diegodesire.modelo.Pedido;
import es.iespuerto.diegodesire.modelo.Producto;
import es.iespuerto.diegodesire.modelo.Proveedor;

/**
 * Esta clase contiene los metodos de utilidad
 * 
 * @version 1.0 12/05/2022
 * @author Mª Desire Sanchez Alvarez, Juan Diego Mesa Alvarez
 */

public class Utilidades {

    private List<Producto> productos = new ArrayList<>();
    private List<Pedido> pedido = new ArrayList<>();
    private List<Almacen> almacen = new ArrayList<>();
    private List<Proveedor> proveedores = new ArrayList<>();
    private List<Administrador> usuarios = new ArrayList<>();
    /**
     * Metodo que permite leer los datos del administrador
     * @param ficheroAdministrador Fichero con los datos del administrador
     * @return Lista de usuarios (En este caso, un registro con los datos del administrador)
     * @throws FileNotFoundException Exception indicando que el fichero no existe
     * @throws URISyntaxException
     */
    public List<Administrador> leerAdministrador(String ficheroAdministrador) throws FileNotFoundException, URISyntaxException {
        Scanner fichero = new Scanner(new File(obtenerPathFichero(ficheroAdministrador)));
        
        String linea;
        String[] lineaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(";");
            usuarios.add(new Administrador(lineaDatos[0], lineaDatos[1], lineaDatos[2], lineaDatos[3]));
        }
        return usuarios;
    }

    /**
     * Funcion que pasa los datos de los productos desde pedidos a productos
     * comprobando que estos han sido enviados. Y almacenandolos en el almacen
     * 
     * @param ficheroProductos Fichero con productos Pedidos
     * @return Lista de productos
     * @throws FileNotFoundException Exception indicando que el fichero no existe
     * @throws URISyntaxException
     */
    public List<Producto> leerProductos(String ficheroProductos) throws FileNotFoundException, URISyntaxException  {
        Scanner fichero = new Scanner(new File(obtenerPathFichero(ficheroProductos)));
        Pedido pe = new Pedido();
        String linea;
        String[] lineaDatos;
        fichero.nextLine();

        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            if (pe.getenviado()) {
                productos.add(new Producto(lineaDatos[0], lineaDatos[1], lineaDatos[2], lineaDatos[3], Integer.parseInt(lineaDatos[4]),Double.parseDouble(lineaDatos[5]),
                        Double.parseDouble(lineaDatos[6]), lineaDatos[7]));
            }

        }
        return productos;
    }

    

    /**
     * Metodo que permite leer los pedidos
     * @param ficheroPedidos Fichero de los pedidos
     * @return Lista de pedidos
     * @throws FileNotFoundException Exception indicando que el fichero no existe
     * @throws URISyntaxException
     */
    public List<Pedido> leerPedidos(String ficheroPedidos) throws FileNotFoundException, URISyntaxException {
        Scanner fichero = new Scanner(new File(obtenerPathFichero(ficheroPedidos)));
        String linea;
        String[] lineaDatos;
        fichero.nextLine();

        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");

            pedido.add(new Pedido(lineaDatos[0], lineaDatos[1], Double.parseDouble(lineaDatos[2]), lineaDatos[3],
                    lineaDatos[4],
                    Integer.parseInt(lineaDatos[5]), Double.parseDouble(lineaDatos[6]),
                    Boolean.parseBoolean(lineaDatos[7])));
        }
        return pedido;

    }

    /**
     * Metodo que permite leer los datos del almacen
     * @param ficheroAlmacen Fichero con los datos del almacen
     * @return Lista del almacen
     * @throws FileNotFoundException Exception indicando que el fichero no existe
     * @throws URISyntaxException
     */
    public List<Almacen> leerAlmacen(String ficheroAlmacen) throws FileNotFoundException, URISyntaxException {
        Scanner fichero = new Scanner(new File(obtenerPathFichero(ficheroAlmacen)));
        String linea;
        String[] lineaDatos;

        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            almacen.add(new Almacen(lineaDatos[0], lineaDatos[1], Integer.parseInt(lineaDatos[2]), Integer.parseInt(lineaDatos[3])));
        }
        return almacen;
    }

    /**
     * Metodo que permite leer los proveedores
     * @param ficheroProveedores Fichero que contiene los datos de los proveedores
     * @return Lista con los proveedores
     * @throws FileNotFoundException Exception indicando que el fichero no existe
     * @throws URISyntaxException
     */
    public List<Proveedor> leerProveedores(String ficheroProveedores) throws FileNotFoundException, URISyntaxException {
        Scanner fichero = new Scanner(new File(obtenerPathFichero(ficheroProveedores)));
        String linea;
        String[] lineaDatos;
        fichero.nextLine();
        while (fichero.hasNextLine()) {
            linea = fichero.nextLine();
            lineaDatos = linea.split(",");
            proveedores.add(new Proveedor(lineaDatos[0], lineaDatos[1], lineaDatos[2], lineaDatos[3]));
        }
        return proveedores;
    }

    /**
     * Funcion encargada de obtener el path del ficero
     * @param nombreFichero Nombre del fichero a buscar
     * @return Path completo del fichero
     * @throws URISyntaxException Exception por la URL mal formada
     */
    public String obtenerPathFichero(String nombreFichero) throws URISyntaxException {
        URL res = getClass().getClassLoader().getResource(nombreFichero);
        File file = Paths.get(res.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
}
