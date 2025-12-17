public class LuzInteligente extends DispositivoInteligente {
    private int brillo; // 0-100

    public LuzInteligente(String nombre) {
        super(nombre);
        this.brillo = 0;
    }
    @Override
    public void encender() {
        this.estaEncendido = true;
        this.brillo = 50;
        System.out.println(nombre + " ENCENDIDA (Brillo por defecto: " + brillo + "%)");
    }

    public void fijarBrillo(int nuevoBrillo) {
        if (estaEncendido) {
            this.brillo = Math.min(100, Math.max(0, nuevoBrillo));
            System.out.println(nombre + " brillo ajustado a: " + brillo + "%");
        } else {
            System.out.println(nombre + " debe estar encendida para ajustar el brillo.");
        }
    }
    public void apagarParaNoche() {
        super.apagar();
        this.brillo = 0;
    }
    @Override
    public void mostrarEstado() {
        String estado = estaEncendido ? "ENCENDIDA" : "APAGADA";
        System.out.println(nombre + " [Estado: " + estado + ", Brillo: " + brillo + "%]");
    }
}