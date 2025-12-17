import java.util.ArrayList;
import java.util.List;

public class GestorFiguras {
    private List<Figura> figuras;
    public GestorFiguras() {
        this.figuras = new ArrayList<>();
    }
    public void anadirFigura(Figura figura) {
        this.figuras.add(figura);
    }
    public void mostrarResultados() {
        System.out.println("Resultado de Figuras");
        for (Figura figura : figuras) {
            String tipo = figura.getClass().getSimpleName();
            double area = figura.calcularArea();
            double perimetro = figura.calcularPerimetro();
            System.out.println("\nTipo: " + tipo + " (Color: " + figura.getColor() + ")");
            System.out.printf("  Área: %.2f%n", area);
            System.out.printf("  Perímetro: %.2f%n", perimetro);
        }
        System.out.println("-----------------------------");
    }
}