package es.iespuerto.diegodesire;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdministradorTest {
    Administrador administrador;

    @BeforeEach
    public void BeforeEach() {
        if (administrador == null) {
            administrador = new Administrador("B79949947", "Taller DD", "tallerdd@gmail.com");
        }
    }

    @Test
    public void constructorDefectoTest() {
        administrador = new Administrador();
        assertNotNull(administrador, "El objeto Administrador no puede ser nulo");
    }

    @Test
    public void constructorTresParametrosTest() {
        assertNotNull(administrador, "El objeto Administrador no puede ser nulo");
    }

    @Test
    public void getCIFTest() {
        administrador.getCIF();
        assertTrue(administrador.getCIF().equals("B79949947"));
    }

    @Test
    public void setCIFTest() {
        administrador.setCIF("B79949947");
        assertTrue(administrador.getCIF().equals("B79949947"));
    }

    @Test
    public void getNombreTest() {
        administrador.getNombre();
        assertTrue(administrador.getNombre().equals("Taller DD"));
    }

    @Test
    public void setNombreTest() {
        administrador.setNombre("Taller DD");
        assertTrue(administrador.getNombre().equals("Taller DD"));
    }

    @Test
    public void getEmailTest() {
        administrador.getEmail();
        assertTrue(administrador.getEmail().equals("tallerdd@gmail.com"));
    }

    @Test
    public void setEmailTest() {
        administrador.setEmail("tallerdd@gmail.com");
        assertTrue(administrador.getEmail().equals("tallerdd@gmail.com"));
    }
}
