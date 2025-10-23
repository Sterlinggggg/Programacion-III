
// Sterling Azcona 1-23-7051
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String tipo = "";
    double dolar = 63.25;
    double euro = 72.50;
    double cantidad = 0;
    double peso = 0;
        System.out.println("Que quieres convertir");
        tipo = teclado.nextLine();
        if(tipo.equals("us")){
            System.out.println("Cantidad en dolares");
            cantidad = teclado.nextDouble();
            peso = cantidad * dolar;
            System.out.println("Cantidad en pesos:" + peso);

        }else if (tipo.equals("eu")){
            System.out.println("Cantidad en euro");
            cantidad = teclado.nextDouble();
            peso = cantidad * euro;
            System.out.println("Cantidad en pesos:" + peso);


        }else{
            System.out.println("Entre una moneda valida");
        }

    }
}