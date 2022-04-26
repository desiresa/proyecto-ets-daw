package es.iespuerto.diegodesire;

/**
 * Esta clase contiene los atributos y metodos de un Proveedor
 * 
 * @version 1.0 20/03/2022
 * @author Mª Desire Sanchez Alvarez
 */

public class Proveedor extends Producto{
    private String codProveedor;
    private String cifProv;
    private String nombreProveedor;
    private String direccion;
    private String telefono;

    /**
     * Metodo constructor por defecto
     */
    public Proveedor() {

    }

    /**
     * Metodo constructor parametrizado
     * 
     * @param cifProv         cifProv del proveedor
     * @param nombreProveedor nombreProveedor del proveedor
     * @param direccion       Direccion del proveedor
     * @param telefono        Telefono del proveedor
     */
    public Proveedor(String cifProv, String nombreProveedor, String direccion, String telefono) {
        this.cifProv = cifProv;
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Metodo que regresa el cifProv del proveedor
     * 
     * @return Regresa el cifProv del proveedor
     */
    public String getcifProv() {
        return cifProv;
    }

    /**
     * Establece el cifProv del proveedor
     * 
     * @param cifProv cifProv del proveedor
     */
    public void setcifProv(String cifProv) {
        this.cifProv = cifProv;
    }

    /**
     * Metodo que regresa el nombreProveedor del proveedor
     * 
     * @return Regresa el nombreProveedor del proveedor
     */
    public String getnombreProveedor() {
        return nombreProveedor;
    }

    /**
     * Establece el nombreProveedor del proveedor
     * 
     * @param nombreProveedor nombreProveedor del proveedor
     */
    public void setnombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    /**
     * Metodo que regresa la direccion del proveedor
     * 
     * @return Regresa la direccion del proveedor
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la direccion del proveedor
     * 
     * @param direccion Direccion del proveedor
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que regresa el telefono del proveedor
     * 
     * @return Regresa el telefono del proveedor
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el telefono del proveedor
     * 
     * @param telefono Telefono del proveedor
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
