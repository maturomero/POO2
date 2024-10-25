import java.util.Scanner;

public class Interfaz {

    private Scanner scanner;

    public Interfaz() {
        scanner = new Scanner(System.in);
    }

    public String obtenerNombreUsuario() {
        String nombre;
        while (true) {
            System.out.print("Ingrese su nombre de usuario: ");
            nombre = scanner.nextLine();
            if (nombre.matches("[a-zA-Z]{3,}")) {
                break;
            }
            System.out.println("El nombre debe contener solo letras y tener al menos 3 caracteres.");
        }
        return nombre;
    }

    public int[] seleccionarDificultad() {
        System.out.print("Seleccione dificultad (Facil/Medio/Dificil): ");
        String nivel = scanner.nextLine().toLowerCase();
        switch (nivel) {
            case "facil":
                return new int[]{10, 1};
            case "medio":
                return new int[]{15, 2};
            case "dificil":
                return new int[]{20, 3};
            default:
                return seleccionarDificultad();
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerRespuesta(String s) {
        return scanner.nextLine();
    }

    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
