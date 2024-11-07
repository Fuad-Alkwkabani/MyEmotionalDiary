package service;

import org.junit.jupiter.api.Test;
import model.Momento;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiarioServiceTest {
    private DiarioService diarioService = new DiarioService();

    @Test
    public void testAgregarMomento() {
        diarioService.agregarMomento("Test Titulo", "Descripcion", Emocion.ALEGRIA, LocalDate.of(2024, 1, 1));
        List<Momento> momentos = diarioService.listarMomentos();
        assertEquals(1, momentos.size());
        assertEquals("Test Titulo", momentos.get(0).getTitulo());
    }

    @Test
    public void testEliminarMomento() {
        diarioService.agregarMomento("Titulo a eliminar", "Descripcion", Emocion.TRISTEZA, LocalDate.now());
        diarioService.eliminarMomento(1);
        assertTrue(diarioService.listarMomentos().isEmpty());
    }

    @Test
    public void testFiltrarPorEmocion() {
        diarioService.agregarMomento("Test Emocion", "Descripcion", Emocion.MIEDO, LocalDate.now());
        List<Momento> momentos = diarioService.filtrarPorEmocion(Emocion.MIEDO);
        assertFalse(momentos.isEmpty());
        assertEquals(Emocion.MIEDO, momentos.get(0).getEmocion());
    }
}

