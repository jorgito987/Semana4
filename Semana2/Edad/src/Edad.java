import java.util.Scanner;

public class Edad {

    int Nacimiento;
    int AnioActual;
    int edad;

    public void calcularEdad(){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introduce el año de nacimiento:");
        Nacimiento = scanner.nextInt();
        System.out.printf("Introduce el año actual:");
        AnioActual = scanner.nextInt();

        edad = AnioActual - Nacimiento;

    }

    public void mostrarPantalla(){
        System.out.println("La edad es:" +edad);
    }
    public static void main(String[] args){
       
        Edad edad = new Edad();

        edad.calcularEdad();
        edad.mostrarPantalla();
    }
}
