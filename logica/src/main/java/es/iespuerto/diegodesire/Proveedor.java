package es.iespuerto.diegodesire;

/**
 * Esta clase contiene los atributos y metodos de un Proveedor
 * 
 * @version 1.0 20/03/2022
 * @author Mª Desire Sanchez Alvarez
 */

public class Proveedor {
    private String CIF;
    private String nombre;
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
     * @param CIF       CIF del proveedor
     * @param nombre    Nombre del proveedor
     * @param direccion Direccion del proveedor
     * @param telefono  Telefono del proveedor
     */
    public Proveedor(String CIF, String nombre, String direccion, String telefono) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Metodo que regresa el CIF del proveedor
     * 
     * @return Regresa el CIF del proveedor
     */
    public String getCIF() {
        return CIF;
    }

    /**
     * Establece el CIF del proveedor
     * 
     * @param CIF CIF del proveedor
     */
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    /**
     * Metodo que regresa el nombre del proveedor
     * 
     * @return Regresa el nombre del proveedor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del proveedor
     * 
     * @param nombre Nombre del proveedor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
