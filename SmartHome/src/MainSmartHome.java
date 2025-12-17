public class MainSmartHome {
    public static void main(String[] args) {
        LuzInteligente luzSala = new LuzInteligente("Luz de la Sala");
        LuzInteligente luzCocina = new LuzInteligente("Luz de la Cocina");
        TermostatoInteligente termostatoDorm = new TermostatoInteligente("Termostato Dormitorio", 25.5);
        Hogar miCasa = new Hogar();
        miCasa.agregarDispositivo(luzSala);
        miCasa.agregarDispositivo(luzCocina);
        miCasa.agregarDispositivo(termostatoDorm);
        miCasa.mostrarTodosLosEstados();
        miCasa.encenderTodasLasLuces();
        termostatoDorm.encender();
        termostatoDorm.fijarTemperatura(24.0);
        miCasa.mostrarTodosLosEstados();
        miCasa.establecerModoNoche();
        miCasa.mostrarTodosLosEstados();
    }
}