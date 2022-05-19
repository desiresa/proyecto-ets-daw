package es.iespuerto.diegodesire.modelo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuerto.diegodesire.utils.Utilidades;

public class AdministradorTest {
    Administrador administrador;

    public static final String CIF= "C3546";
    public static final String usuario = "usuario";
    public static final String email = "email";
    public static final String password = "password";

    private static final String ficheroAdministrador = "datosadministrador.csv";
    
    static List<Administrador> usuarios = new ArrayList<>();
    Utilidades utilidades = new Utilidades();

    @BeforeEach
    public void BeforeEach() throws FileNotFoundException, URISyntaxException {
        if (administrador == null) {
            administrador = new Administrador(CIF, usuario, email, password);
            usuarios = utilidades.leerAdministrador(ficheroAdministrador);
        }
    }

    @Test
    public void constructorDefectoTest() {
        administrador = new Administrador();
        assertNotNull(administrador, "El objeto Administrador no puede ser nulo");
    }

    @Test
    public void constructorCuatroParametrosTest() {
        assertNotNull(administrador, "El objeto Administrador no puede ser nulo");
    }

    @Test
    public void gettersTest() {
        Assertions.assertEquals(usuario, administrador.getUsuario(),
         "El usuario no es el esperado");
        Assertions.assertEquals(password, administrador.getContrasenia(),
         "La contrasenia no es la esperada");
    }
}
