package ui;

import service.DiarioService;
import service.Emocion;
import model.Momento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


public class ConsolaUI {
    private DiarioService diarioService;
    private Scanner scanner = new Scanner(System.in);
    public ConsolaUI(DiarioService diarioService) {
        this.diarioService = diarioService;
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Mi Diario:");
            System.out.println("1. Añadir momento");
            System.out.println("2. Ver todos los momentos disponibles");
            System.out.println("3. Eliminar un momento");
            System.out.println("4. Filtrar los momentos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> agregarMomento();
                case 2 -> listarMomentos();
                case 3 -> eliminarMomento();
                case 4 -> filtrarMomentos();
                case 5 -> {
                    System.out.println("Hasta la próxima!!!");
                    continuar = false;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
    private void agregarMomento() {
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese la descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
        LocalDate fechaMomento = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Selecciona una emoción:");
        for (Emocion emocion : Emocion.values()) {
            System.out.println((emocion.ordinal() + 1) + ". " + emocion);
        }
        int emocionId = scanner.nextInt();
        scanner.nextLine();
        Emocion emocion = Emocion.values()[emocionId - 1];
        diarioService.agregarMomento(titulo, descripcion, emocion, fechaMomento);
    }
    private void listarMomentos() {
        List<Momento> momentos = diarioService.listarMomentos();
        if (momentos.isEmpty()) {
            System.out.println("No hay momentos registrados.");
        } else {
            for (Momento m : momentos) {
                System.out.println(m);
            }
        }
    }
    private void eliminarMomento() {
        System.out.print("Ingresa el identificador del momento: ");
        int id = scanner.nextInt();
        if (diarioService.eliminarMomento(id)) {
            System.out.println("Momento vivido eliminado correctamente.");
        } else {
            System.out.println("No se encontró un momento con el ID proporcionado.");
        }
    }
    private void filtrarMomentos() {
        System.out.println("Filtrar por ...");
        System.out.println("1. Emoción");
        System.out.println("2. Fecha");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion == 1) {
            System.out.println("Selecciona una emoción:");
            for (Emocion emocion : Emocion.values()) {
                System.out.println((emocion.ordinal() + 1) + ". " + emocion);
            }
            int emocionId = scanner.nextInt();
            scanner.nextLine();
            Emocion emocion = Emocion.values()[emocionId - 1];
            mostrarMomentos(diarioService.filtrarPorEmocion(emocion));
        } else if (opcion == 2) {
            System.out.print("Ingrese el mes y año (MM/yyyy): ");
            String[] fecha = scanner.nextLine().split("/");
            mostrarMomentos(diarioService.filtrarPorMes(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1])));
        }
    }
    private void mostrarMomentos(List<Momento> momentos) {
        if (momentos.isEmpty()) {
            System.out.println("No se encontraron momentos.");
        } else {
            for (Momento m : momentos) {
                System.out.println(m);
            }
        }
    }
}
