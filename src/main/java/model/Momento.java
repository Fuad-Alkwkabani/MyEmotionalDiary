package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Momento<Emocion> {
    private int id;
    private String titulo;
    private String descripcion;
    private Emocion emocion;
    private LocalDate fechaMomento;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;

    public Momento(int id, String titulo, String descripcion, Emocion emocion, LocalDate fechaMomento) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.emocion = emocion;
        this.fechaMomento = fechaMomento;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaModificacion = this.fechaCreacion;
    }

    
    public int getId() { return id; }
    public Emocion getEmocion() { return emocion; }
    public LocalDate getFechaMomento() { return fechaMomento; }
    public String toString() {
        return "Momento [ID=" + id + ", Título=" + titulo + ", Emoción=" + emocion + ", Fecha=" + fechaMomento + "]";
    }
}
