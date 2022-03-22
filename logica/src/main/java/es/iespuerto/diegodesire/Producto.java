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
    private Almacen codAlm;
    private String nombre;
    private String descripcion;
    private Integer cantDisp;
    private Double precioCoste;
    private Double precioVenta;
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
     * @param codAlm       Codigo de identificacion en el almacen
     * @param nombre       Nombre del producto
     * @param descripcion  Descripcion del producto
     * @param cantDisp     Cantidad disponible en el almacen
     * @param precioCoste  Precio coste del producto
     * @param precioVenta  Precio de venta del producto
     * @param codProveedor Codigo de identificacion del proveedor
     */
    public Producto(String codProducto, Almacen codAlm, String nombre, String descripcion, Integer cantDisp,
            Double precioCoste, Double precioVenta, Proveedor codProveedor) {
        this.codProducto = codProducto;
        this.codAlm = codAlm;
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
    public String getCodProducto() {
        return codProducto;
    }

    /**
     * Establece el codigo del producto
     * 
     * @param codProducto Codigo del producto
     */
    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    /**
     * Metodo que regresa el codigo del almacen
     * 
     * @return Regresa el Codigo del almacen
     */
    public Almacen getCodAlm() {
        return codAlm;
    }

    /**
     * Establece el codigo del almacen
     * 
     * @param codAlm Codigo del almacen
     */
    public void setCodAlm(Almacen codAlm) {
        this.codAlm = codAlm;
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
    public Integer getCantDisp() {
        return cantDisp;
    }

    /**
     * Establece la cantidad disponible en el almacen del producto
     * 
     * @param cantDisp Cantidad disponible
     */
    public void setCantDisp(Integer cantDisp) {
        this.cantDisp = cantDisp;
    }

    /**
     * Metodo que regresa el precio coste del producto
     * 
     * @return Regresa precio coste del producto
     */
    public Double getPrecioCoste() {
        return precioCoste;
    }

    /**
     * Establece el precio coste del producto
     * 
     * @param precioCoste Precio coste del producto
     */
    public void setPrecioCoste(Double precioCoste) {
        this.precioCoste = precioCoste;
    }

    /**
     * Metodo que regresa el precio venta del producto
     * 
     * @return Regresa precio venta del producto
     */
    public Double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Establece el precio venta del producto
     * 
     * @param precioVenta Precio venta del producto
     */
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Metodo que regresa el codigo del proveedor
     * 
     * @return Regresa el codigo del proveedor
     */
    public Proveedor getCodProveedor() {
        return codProveedor;
    }

    /**
     * Establece el codigo del proveedor
     * 
     * @param codProveedor Codigo del proveedor
     */
    public void setCodProveedor(Proveedor codProveedor) {
        this.codProveedor = codProveedor;
    }

}
