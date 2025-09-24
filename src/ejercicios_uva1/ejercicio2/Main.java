package ejercicios_uva1.ejercicio2;

public class Main {

    public static void main(String[] args) {
        //instancia1 de sistemaControlDeVuelo
        SistemaDeControlDeVuelo sistema1 = new SistemaDeControlDeVuelo("Alemania", 2, "pilotoAutomatico");
        System.out.println("El fabricante del sistema 1 es: " + sistema1.getFabricante());
        System.out.println("Número de modos: " + sistema1.getNumeroDeModos());
        System.out.println("Modo actual: " + sistema1.getModoActual());

        // Cambiar el número de modos
        sistema1.cambiarModo(1);

        //instancia2 de Sistema Control De Vuelo
        SistemaDeControlDeVuelo sistema2 = new SistemaDeControlDeVuelo("EEUU", 5, "manual");
        System.out.println("El fabricante del sistema 2 es: " + sistema2.getFabricante());
        System.out.println("Número de modos: " + sistema2.getNumeroDeModos());
        System.out.println("Modo actual: " + sistema2.getModoActual());

        // Cambiar el número de modos
        sistema2.cambiarModo(3);
    }
}
