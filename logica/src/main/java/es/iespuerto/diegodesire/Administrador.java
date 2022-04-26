package es.iespuerto.diegodesire;

/**
 * Esta clase contiene los metodos y atributos de Administrador
 * 
 * @version 1.0 20/03/2022
 * @author Mª Desiré Sánchez Álvarez, Juan Diego Mesa Alvarez
 */

public class Administrador {
    private String CIF;
    private String nombre;
    private String email;

    /**
     * Metodo constructor por defecto
     */
    public Administrador() {

    }

    /**
     * Metodo constructor parametrizado
     * 
     * @param CIF    CIF de la empresa que usa la aplicacion
     * @param nombre Nombre de la persona que vaya a usar la aplicacion o usuario
     * @param email  Email de la persona que vaya a usar la aplicacion o usuario
     */

    public Administrador(String CIF, String nombre, String email) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.email = email;
    }

    /**
     * Establece el cif de la empresa
     * 
     * @param CIF CIF de la empresa
     */
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    /**
     * Metodo para regresar el CIF de la empresa que usa la aplicacion
     * 
     * @return CIF de la empresa
     */
    public String getCIF() {
        return CIF;
    }

    /**
     * Metodo para regresar el nombre de la empresa
     * 
     * @return Regresa el nombre de la persona que use la aplicacion
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario
     * 
     * @param nombre Nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para regresar el email del usuario
     * 
     * @return Regresa el email del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email del usuario
     * 
     * @param email Email del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
