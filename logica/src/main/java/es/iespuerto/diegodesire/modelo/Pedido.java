package es.iespuerto.diegodesire.modelo;

/**
 * Esta clase contiene los atributos y metodos de un Almacen
 * 
 * @version 1.0 12/05/2022
 * @author Mª Desiré Sánchez Álvarez, Juan Diego Mesa Alvarez
 * @see Producto
 * @see Proveedor
 */

public class Pedido {
    private String codigoPedido;
    private String codProducto;
    private double precioCoste;
    private String cifProveedor;
    private String fechaPedido;
    private int cantidadProducto;
    private double totalPedido;
    private boolean enviado = false;

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
     * @param fechaPedido  Fecha de realizacion del pedido
     * @param cantidad     Cantidad del pedido
     * @param totalPedido  Precio totalPedido del pedido
     * @param enviado      Si el pedido esta enviado o no
     */
    public Pedido(String codigoPedido, String codProducto, double precioCoste, String cifProveedor,
            String fechaPedido, int cantidadProducto,
            double totalPedido, Boolean enviado) {

        this.codigoPedido = codigoPedido;
        this.codProducto = codProducto;
        this.precioCoste = precioCoste;
        this.cifProveedor = cifProveedor;
        this.fechaPedido = fechaPedido;
        this.cantidadProducto = cantidadProducto;
        this.totalPedido = totalPedido;
        this.enviado = enviado;
    }

    /**
     * Metodo que permite obtener el codigo del pedido
     * @return Codigo del pedido
     */
	public String getCodigoPedido(){
        return this.codigoPedido;
    }

    /**
     * Metodo que permite obtener el precio de coste
     * @return Precio coste
     */
    public double getPrecioCoste() {
        return this.precioCoste;
    }

    /**
     * Metodo que permite obtener el codigo del producto
     * @return Codigo del producto
     */
    public String getCodProducto() {
        return this.codProducto;
    }

    /**
     * Metodo que devuelve true si el pedido ha sido enviado
     * @return True si el pedido ha sido enviado
     */
    public boolean getenviado() {
        return this.enviado;
    }

    /**
     * Metodo que permite obtener la cantidad del producto
     * @return Cantidad del producto
     */
    public int getCantidadProducto() {
        return this.cantidadProducto;
    }

    /**
     * Metodo que sobreescribe el metodo equals
     */
    @Override
    public boolean equals(Object o) {
        return codProducto.equals(((Pedido) o).codProducto);
    }

    /**
     * Metodo que sobreescribe el metodo toString
     */
    @Override
    public String toString() {
        return String.format("Codigo pedido: %s; Codigo producto: %s; Precio coste: %.2f; CIF Proveedor: %s; Fecha del pedido: %s; Cantidad producto: %d; Total Pedido: %.2f; Enviado: %b",
            codigoPedido, codProducto, precioCoste, cifProveedor, fechaPedido, cantidadProducto, totalPedido, enviado);
    }
}
