import org.junit.jupiter.api.Test;

import model.Momento;
import service.Emocion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class MomentoTest {

    @Test
    public void testMomentoCreation() {
        Momento momento = new Momento(1, "Título", "Descripción", Emocion.ALEGRIA, LocalDate.of(2024, 5, 1));
        
        assertEquals(1, momento.getId());
        assertEquals("Título", momento.getTitulo());
        assertEquals(Emocion.ALEGRIA, momento.getEmocion());
        assertEquals(LocalDate.of(2024, 5, 1), momento.getFechaMomento());
    }

    @Test
    public void testToString() {
        Momento momento = new Momento(1, "Título", "Descripción", Emocion.ALEGRIA, LocalDate.of(2024, 5, 1));
        assertNotNull(momento.toString()); 
    }
}

