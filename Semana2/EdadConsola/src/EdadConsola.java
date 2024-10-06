import java.io.Console;

public class EdadConsola { // Asegúrate de que el nombre de la clase sea igual al del archivo

    int nacimiento;
    int anioActual;
    int edad;

    public void calcularEdad() {
        Console console = System.console();

        if (console == null) {
            System.out.println("No se pudo obtener la consola.");
            return;
        }

        // Solicitar año de nacimiento y año actual
        String nacimientoStr = console.readLine("Introduce el año de nacimiento: ");
        String anioActualStr = console.readLine("Introduce el año actual: ");

        // Convertir las cadenas de entrada a enteros usando parseInt
        nacimiento = Integer.parseInt(nacimientoStr);
        anioActual = Integer.parseInt(anioActualStr);

        // Calcular la edad
        edad = anioActual - nacimiento;
    }

    public void mostrarPantalla() {
        System.out.println("La edad es: " + edad);
    }

    public static void main(String[] args) {
        EdadConsola edadConsola = new EdadConsola(); // Se instancia la clase con el nombre corregido

        edadConsola.calcularEdad();
        edadConsola.mostrarPantalla();
    }
}
