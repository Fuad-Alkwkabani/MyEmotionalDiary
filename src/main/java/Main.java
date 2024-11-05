import service.DiarioService;
import ui.ConsolaUI;

public class Main {
    public static void main(String[] args) {
        DiarioService diarioService = new DiarioService();
        ConsolaUI consolaUI = new ConsolaUI(diarioService);
        consolaUI.iniciar();
    }
}
