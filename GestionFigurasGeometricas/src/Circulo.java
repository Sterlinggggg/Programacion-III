public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // Área = π * radio²
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        // Perímetro = 2 * π * radio
        return 2 * Math.PI * radio;
    }
}