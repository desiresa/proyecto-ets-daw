package es.iespuerto.diegodesire;

/**
 * Esta clase contiene los atributos y metodos de un Producto
 * 
 * @version 1.0 20/03/2022
 * @author Mª Desire Sanchez Alvarez, Juan Diego Mesa Alvarez
 * @see Almacen
 * @see Proveedor
 */

public class Producto {
    private String codProducto;
    private Almacen codAlmacen;
    private String nombre;
    private String descripcion;
    private int cantDisp;
    private double precioCoste;
    private double precioVenta;
    private Proveedor codProveedor;

    /**
     * Metodo constructor por defecto
     */
    public Producto() {

    }

    /**
     * Metodo constructor parametrizado
     * 
     * @param codProducto  Codigo de identificacion del producto
     * @param codAlmacen       Codigo de identificacion en el almacen
     * @param nombre       Nombre del producto
     * @param descripcion  Descripcion del producto
     * @param cantDisp     Cantidad disponible en el almacen
     * @param precioCoste  Precio coste del producto segun el proveedor
     * @param precioVenta  Precio de venta de nuestro producto
     * @param codProveedor Codigo de identificacion del proveedor
     */
    public Producto(String codProducto, Almacen codAlmacen, String nombre, String descripcion, int cantDisp,
            double precioCoste, double precioVenta, Proveedor codProveedor) {
        this.codProducto = codProducto;
        this.codAlmacen = codAlmacen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantDisp = cantDisp;
        this.precioCoste = precioCoste;
        this.precioVenta = precioVenta;
        this.codProveedor = codProveedor;
    }

    /**
     * Metodo que regresa el codigo del producto
     * 
     * @return Regresa el Codigo del producto
     */
    public String getcodProducto() {
        return codProducto;
    }

    /**
     * Establece el codigo del producto
     * 
     * @param codProducto Codigo del producto
     */
    public void setcodProducto(String codProducto) {
        this.codProducto = codProducto;
    }


    /**
     * Metodo que regresa el nombre del producto
     * 
     * @return Regresa el Nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto
     * 
     * @param nombre Nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa la descripcion del producto
     * 
     * @return Regresa la descripcion del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripcion del producto
     * 
     * @param descripcion Descripcion del producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo que regresa la cantidad disponible en el almacen del producto
     * 
     * @return Regresa la cantidad disponible
     */
    public int getCantDisp() {
        return cantDisp;
    }

    /**
     * Establece la cantidad disponible en el almacen del producto
     * 
     * @param cantDisp Cantidad disponible
     */
    public void setCantDisp(int cantDisp) {
        this.cantDisp = cantDisp;
    }

    /**
     * Metodo que regresa el precio coste del producto
     * 
     * @return Regresa precio coste del producto
     */
    public double getPrecioCoste() {
        return precioCoste;
    }

    /**
     * Establece el precio coste del producto
     * 
     * @param precioCoste Precio coste del producto
     */
    public void setPrecioCoste(double precioCoste) {
        this.precioCoste = precioCoste;
    }

    /**
     * Metodo que regresa el precio venta del producto
     * 
     * @return Regresa precio venta del producto
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Establece el precio venta del producto
     * 
     * @param precioVenta Precio venta del producto
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

}
