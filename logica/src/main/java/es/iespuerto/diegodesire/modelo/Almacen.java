package es.iespuerto.diegodesire.modelo;

import java.util.*;


/**
 * Esta clase contiene los atributos y metodos de un Almacen
 * 
 * @version 1.0 12/05/2022
 * @author Mª Desire Sanchez Alvarez, Juan Diego Mesa Alvarez
 * @see Producto
 */

public class Almacen {
    
    private String codAlmacen;
    private String codProducto;
    private int cantMax;
    private int cantAct;

    /**
     * Metodo constructor por defecto
     */
    public Almacen() {

    }

    

     /**
     * Metodo constructor parametrizado
     * 
     * @param codAlmacen Codigo de identificacion en el almacen
     * @param codigoProd Codigo del identificacion del producto
     * @param cantMax    Cantidad maxima del producto en una zona del almacen
     * @param cantAct    Cantidad actual de productos en una zona del almacen
     */
    public Almacen(String codAlmacen, String codProducto, int cantMax, int cantAct) {
        this.codAlmacen = codAlmacen;
        this.codProducto = codProducto;
        this.cantMax = cantMax;
        this.cantAct = cantAct;
    }


    /**
     * Metodo qeu permite obtener el codigo del almacen
     * @return Codigo del almacen
     */
    public String getCodAlmacen() {
        return this.codAlmacen;
    }

    /**
     * Metodo que permite obtener el codigo del producto
     * @return Codigo del producto
     */
    public String getCodProducto() {
        return this.codProducto;
    }

    /**
     * Buscar el producto por el codigo, y mostrar todos los datos de ese producto en caso de que exista
     * Los codigos de los productos son unicos, y solo nos deberia devolver un producto
     * @param codigoProducto
     */
    public Almacen buscarProducto(String codigo, List<Almacen> productos) {
        for (Almacen p : productos) {
            if (p.getCodProducto().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Metodo que sobreescribe el metodo equals
     */
    @Override
    public boolean equals(Object o) {
        return codProducto.equals(((Almacen) o).codProducto);
    }

    /**
     * Metodo que sobreescribe el metodo toString
     */
    @Override
    public String toString() {
        return String.format("Código almacén: %s; Codigo producto: %s; Cantidad máxima: %d; Cantidad actual: %s",
            codAlmacen, codProducto, cantMax, cantAct);
    }

}
