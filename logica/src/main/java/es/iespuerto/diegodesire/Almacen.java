package es.iespuerto.diegodesire;

/**
 * Esta clase contiene los atributos y metodos de un Almacen
 * 
 * @version 1.0 20/03/2022
 * @author Mª Desire Sanchez Alvarez, Juan Diego Mesa Alvarez
 * @see Productos
 */

public class Almacen {
    private String codAlmacen;
    private Producto codigoProd;
    private Integer cantMax;
    private Integer cantAct;

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
    public Almacen(String codAlmacen, Producto codigoProd, Integer cantMax, Integer cantAct) {
        this.codAlmacen = codAlmacen;
        this.cantMax = cantMax;
        this.cantAct = cantAct;
    }

    /**
     * Metodo que regresa el codigo del almacen
     * 
     * @return Regresa el codigo del almacen
     */
    public String getCodAlmacen() {
        return codAlmacen;
    }

    /**
     * Establece el codigo del almacen
     * 
     * @param codAlmacen Codigo de identificacion en el almacen
     */
    public void setCodAlmacen(String codAlmacen) {
        this.codAlmacen = codAlmacen;
    }

    /**
     * Metodo que regresa el Codigo del producto
     * 
     * @return Regresa el codigo del producto
     */
    public Producto getCodigoProd() {
        return codigoProd;
    }

    /**
     * Establece el codigo del producto
     * 
     * @param codigoProd Codigo del producto
     */
    public void setCodigoProd(Producto codigoProd) {
        this.codigoProd = codigoProd;
    }

    /**
     * Metodo que regresa la cantidad maxima de producto en una zona del almacen
     * 
     * @return Regresa la cantidad maxima de productos en una zona
     */
    public Integer getCantMax() {
        return cantMax;
    }

    /**
     * Establece la cantidad maxima de productos en una zona del almacen
     * 
     * @param cantMax Cantidad Maxima de un producto en el almacen
     */
    public void setCantMax(Integer cantMax) {
        this.cantMax = cantMax;
    }

    /**
     * Metodo que regresa la cantidad actuar de un producto en una zona del almacen
     * 
     * @return Regresa la cantidad actual de productos en una zona
     */
    public Integer getCantAct() {
        return cantAct;
    }

    /**
     * Establece la cantidad actual de un producto en una zona del almacen
     * 
     * @param cantAct Cantidad Actual de un producto en el almacen
     */
    public void setCantAct(Integer cantAct) {
        this.cantAct = cantAct;
    }

}
