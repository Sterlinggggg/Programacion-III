// Sterling Azcona 1-23-7051
import java.util.Scanner;
 class ConversorTemperatura {
    public static double celsiusAFahrenheit(double celsius) {
        // La Folmula: F = C * (9/5) + 32
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitACelsius(double fahrenheit) {
        // La Folmula: C = (F - 32) * (5/9)
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        double temperatura;
        double resultado;
        System.out.println("Conversor de Temperatura");
        System.out.println("1. Celsius (C) a Fahrenheit (F)");
        System.out.println("2. Fahrenheit (F) a Celsius (C)");
        System.out.print("Elige una opción (1 o 2): ");
        opcion = teclado.nextLine();
        if (opcion.equals("1")) {
            System.out.print("Introduce la temperatura en Celsius: ");
            if (teclado.hasNextDouble()) {
                temperatura = teclado.nextDouble();
                resultado = celsiusAFahrenheit(temperatura);
                System.out.printf("%.2f C es igual a %.2f F%n", temperatura, resultado);
            } else {
                System.out.println("Entrada no válida mi lider.");
            }
        } else if (opcion.equals("2")) {
            System.out.print("Introduce la temperatura en Fahrenheit: ");
            if (teclado.hasNextDouble()) {
                temperatura = teclado.nextDouble();
                resultado = fahrenheitACelsius(temperatura);
                System.out.printf("%.2f F es igual a %.2f C%n", temperatura, resultado);
            } else {
                System.out.println("Entrada no válida mi lider.");
            }
        } else {
            System.out.println("Opción no válida. Na' ma' es el '1' o '2'.");
        }
        teclado.close();
    }
}