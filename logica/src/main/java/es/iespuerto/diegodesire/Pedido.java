package es.iespuerto.diegodesire;

import java.time.*;


/**
 * Esta clase contiene los atributos y metodos de un Almacen
 * 
 * @version 1.0 20/03/2022
 * @author Mª Desiré Sánchez Álvarez, Juan Diego Mesa Alvarez
 * @see Producto
 * @see Proveedor
 */

public class Pedido {
    private String codigoPedido;
    private Producto codProducto;
    private Producto precioCoste;
    private Proveedor codProveedor;
    private String fechaPedido;
    private int cantidad;
    private double total;
    private boolean pagado=false;

    /**
     * Metodo constructor por defecto
     */
    public Pedido() {

    }


    /**
     * Metodo constructor parametrizado
     * 
     * @param codigoPedido Codigo de identificacion del pedido
     * @param codProducto  Codigo de identificacion del producto
     * @param precioCoste  Precios coste del producto
     * @param codProveedor Codigo de identificacion del proveedor
     * @param fecha  Fecha de realizacion del pedido
     * @param cantidad     Cantidad del pedido
     * @param total        Precio total del pedido
     * @param pagado       Si el pedido esta pagado o no
     */
    public Pedido(String codigoPedido, Producto codProducto,Producto precioCoste, Proveedor codProveedor,
            String fechaPedido, int cantidad,
            double total, Boolean pagado) {
        super();
        this.codigoPedido = codigoPedido;
        this.codProducto = codProducto;
        this.precioCoste= precioCoste;
        this.codProveedor = codProveedor;
        this.fechaPedido = fechaPedido;
        this.cantidad = cantidad;
        this.total = total;
        this.pagado = pagado;
    }

    /**
     * Metodo que regresa el codigo del pedido
     * 
     * @return Regresa el codigo del pedido
     */
    public String getCodigoPedido() {
        return codigoPedido;
    }

    /**
     * Establece el codigo del pedido
     * 
     * @param codigoPedido Codigo del pedido
     */
    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }


    /**
     * Metodo que regresa la fecha del pedido
     * 
     * @return Regresa la fecha del pedido
     */
    public String getFechaPedido() {
        return fechaPedido;
    }

    /**
     * Establece la fecha del pedido
     * 
     * @param fechaPedido Fecha del pedido
     */
    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    /**
     * Metodo que regresa la cantidad del pedido
     * 
     * @return Regresa la cantidad del pedido
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del pedido
     * 
     * @param cantidad Cantidad del pedido
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo que regresa el total del pedido
     * 
     * @return Regresa el total del pedido
     */
    public double getTotal(double precioCoste, int cantidad) {
        return precioCoste*cantidad;
    }

    /**
     * Metodo que regresa si el pedido ha sido pagado
     * 
     * @return Regresa si el pedido ha sido pagado
     */
    public Boolean getPagado() {
        return pagado;
    }

    /**
     * Establece si el pedido ha sido pagado
     * 
     * @param pagado Pedido pagado o no
     */
    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

}
