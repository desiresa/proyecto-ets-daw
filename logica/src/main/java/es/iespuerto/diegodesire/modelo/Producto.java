package es.iespuerto.diegodesire.modelo;

/**
 * Esta clase contiene los atributos y metodos de un Producto
 * 
 * @version 1.0 12/05/2022
 * @author Mª Desire Sanchez Alvarez, Juan Diego Mesa Alvarez
 * @see Almacen
 * @see Proveedor
 */

public class Producto {
    private String codProducto;
    private String codAlmacen;
    private String nombreProducto;
    private String descripcion;
    private int cantidadProducto;
    private double precioCoste;
    private double precioVenta;
    private String nombreProveedor;



    /**
     * Metodo constructor por defecto
     */
    public Producto(){

    }

    /**
     * Metodo constructor parametrizado
     * 
     * @param codProducto     Codigo de identificacion del producto
     * @param codAlmacen      Codigo de identificacion en el almacen
     * @param nombreProducto  nombreProducto del producto
     * @param descripcion     Descripcion del producto
     * @param cantDisp        Cantidad disponible en el almacen
     * @param precioCoste     Precio coste del producto segun el proveedor
     * @param precioVenta     Precio de venta de nuestro producto
     * @param nombreProveedor nombreProducto del proveedor
     */
    public Producto(String codProducto, String codAlmacen, String nombreProducto, String descripcion,
            int cantidadProducto, double precioCoste, double precioVenta, String nombreProveedor) {
        this.codProducto = codProducto;
        this.codAlmacen = codAlmacen;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.cantidadProducto = cantidadProducto;
        this.precioCoste = precioCoste;
        this.precioVenta = precioVenta;
        this.nombreProveedor = nombreProveedor;
    }


    /**
     * Metodo que permite obtener el nombre del producto
     * @return Nombre del producto
     */
    public String getNombreProducto() {
        return this.nombreProducto;
    }

    /**
     * Metodo que permite obtener el codigo del producto
     * @return Codigo del producto
     */
    public String getCodProducto() {
        return this.codProducto;
    }


    public String getCodAlmacen() {
        return this.codAlmacen;
    }


    /**
     * Metodo que sobreescribe el metodo equals
     */
    @Override
    public boolean equals(Object o) {
        return codProducto.equals(((Producto) o).codProducto);
    }

    /**
     * Metodo que sobreescribe al metodo toString
     */
    @Override
    public String toString() {
        return String.format("Codigo: %s, Codigo en el Almacen: %s, Nombre: %s, Descripcion: %s, " + 
            "Cantidad producto: %d, Precio coste: %.2f, Precio venta: %.2f",
                codProducto, codAlmacen, nombreProducto, descripcion, cantidadProducto, precioCoste, precioVenta);
    }
}
