public class Main {
    public static void main(String[] args) {
        GestorFiguras gestor = new GestorFiguras();
        Figura miCirculo = new Circulo("Rojo", 5.0);
        Figura miRectangulo = new Rectangulo("Azul", 4.0, 6.0);
        Figura miTriangulo = new Triangulo("Verde", 5.0, 8.0, 5.0, 5.0, 5.0);
        gestor.anadirFigura(miCirculo);
        gestor.anadirFigura(miRectangulo);
        gestor.anadirFigura(miTriangulo);
        gestor.mostrarResultados();
    }
}