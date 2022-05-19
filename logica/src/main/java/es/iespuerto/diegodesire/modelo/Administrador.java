package es.iespuerto.diegodesire.modelo;

/**
 * Esta clase contiene los metodos y atributos de Administrador
 * 
 * @version 1.0 12/05/2022
 * @author Mª Desiré Sánchez Álvarez, Juan Diego Mesa Alvarez
 */

public class Administrador {
    private String CIF;
    private String usuario;
    private String email;
    private String contrasenia;

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

    public Administrador(String CIF, String usuario, String email, String contrasenia) {
        this.CIF = CIF;
        this.usuario = usuario;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    /**
     * Metodo que devuelve la contrasenia del administrador
     * @return contrasenia del administrador
     */
    public String getContrasenia() {
        return this.contrasenia;
    }

    /**
     * Metodo que devuelve el nombre de usuario  del administrador
     * @return nombre de usuario del administrador
     */
    public String getUsuario() {
        return this.usuario;
    }
}
