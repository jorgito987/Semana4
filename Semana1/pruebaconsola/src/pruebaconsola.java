import java.util.Scanner;

public class pruebaconsola {
    public static void main(String[] args) throws Exception {
        // Programa que pide un entero al usuario y repite el mensaje Hello World
        // el número de veces que ha indicado el usuario. Empleando el scanner.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World");
        }
    }
}
