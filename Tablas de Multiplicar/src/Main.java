import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numero;


        System.out.println("Generador de Tablas de Multiplicar");
        System.out.print("Ponga un número entero para generar su tabla lider: ");


        if (scanner.hasNextInt()) {
            numero = scanner.nextInt();
            System.out.println("\nTabla de multiplicar del " + numero + ":");


            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;

                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Error: Lider ponga un número entero que sea válido.");
        }

        scanner.close();
    }
}