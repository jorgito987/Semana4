import java.util.Scanner;

public class Media {

    int numero;
    double suma; 
    double media;

    public void leer() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce un número entero mayor que cero:");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.err.println("Error: el número debe ser mayor que cero.");
            }
        } while (numero <= 0); 
    }

    public void numeros() {
        Scanner scanner = new Scanner(System.in);
        suma = 0; 
        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce un número decimal:");
            suma += scanner.nextDouble(); 
        }
    }

    public void mediatotal() {
        media = suma / numero; 
        System.out.println("La media total es: " + media);
    }

    public static void main(String[] args) {
        Media media = new Media();
        media.leer();
        media.numeros();
        media.mediatotal();
    }
}
