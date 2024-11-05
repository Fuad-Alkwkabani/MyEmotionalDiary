package service;
import model.Momento;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class DiarioService {
    private List<Momento> momentos = new ArrayList<>();
    private int idCounter = 1;
    public void agregarMomento(String titulo, String descripcion, Emocion emocion, LocalDate fechaMomento) {
        Momento momento = new Momento(idCounter++, titulo, descripcion, emocion, fechaMomento);
        momentos.add(momento);
        System.out.println("Momento vivido añadido correctamente.");
    }
    public List<Momento> listarMomentos() {
        return new ArrayList<>(momentos);
    }
    public boolean eliminarMomento(int id) {
        return momentos.removeIf(m -> m.getId() == id);
    }
    public List<Momento> filtrarPorEmocion(Emocion emocion) {
        List<Momento> resultado = new ArrayList<>();
        for (Momento m : momentos) {
            if (m.getEmocion() == emocion) {
                resultado.add(m);
            }
        }
        return resultado;
    }
    public List<Momento> filtrarPorMes(int mes, int anio) {
        List<Momento> resultado = new ArrayList<>();
        for (Momento m : momentos) {
            if (m.getFechaMomento().getMonthValue() == mes && m.getFechaMomento().getYear() == anio) {
                resultado.add(m);
            }
        }
        return resultado;
    }
}