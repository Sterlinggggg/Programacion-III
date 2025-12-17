public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // area=base*altura
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // perímetro = 2*(base+altura)
        return 2 * (base + altura);
    }
}