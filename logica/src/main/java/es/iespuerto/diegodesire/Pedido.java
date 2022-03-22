package es.iespuerto.diegodesire;

import java.util.Date;

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
    private Proveedor codProveedor;
    private Date fechaPedido;
    private Integer cantidad;
    private Double total;
    private Boolean pagado;

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
     * @param codProveedor Codigo de identificacion del proveedor
     * @param fechaPedido  Fecha de realizacion del pedido
     * @param cantidad     Cantidad del pedido
     * @param total        Precio total del pedido
     * @param pagado       Si el pedido esta pagado o no
     */
    public Pedido(String codigoPedido, Producto codProducto, Proveedor codProveedor, Date fechaPedido, Integer cantidad,
            Double total, Boolean pagado) {
        this.codigoPedido = codigoPedido;
        this.codProducto = codProducto;
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
     * Metodo que regresa el codigo del producto
     * 
     * @return Regresa el codigo del producto
     */
    public Producto getCodProducto() {
        return codProducto;
    }

    /**
     * Establece el codigo del producto
     * 
     * @param codProducto Codigo del producto
     */
    public void setCodProducto(Producto codProducto) {
        this.codProducto = codProducto;
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

    /**
     * Metodo que regresa la fecha del pedido
     * 
     * @return Regresa la fecha del pedido
     */
    public Date getFechaPedido() {
        return fechaPedido;
    }

    /**
     * Establece la fecha del pedido
     * 
     * @param fechaPedido Fecha del pedido
     */
    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    /**
     * Metodo que regresa la cantidad del pedido
     * 
     * @return Regresa la cantidad del pedido
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del pedido
     * 
     * @param cantidad Cantidad del pedido
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo que regresa el total del pedido
     * 
     * @return Regresa el total del pedido
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Establece el total del pedido
     * 
     * @param total Total del pedido
     */
    public void setTotal(Double total) {
        this.total = total;
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
