package ejercicios_uva2;

public class Main {

    public static void main(String[] args) {

        // instancias
        Pantalla pantallaCompartida = new Pantalla("4k",55);
        Televisor tv1 = new Televisor("Samsung", "Series 9", 2025, "O", 55, "4K", true);
        Televisor tv2 = new Televisor("LG", "Series 4", 2016, "L", 50, "1080p", false);

        pantallaCompartida.

        // mostrar info
        System.out.println(tv1);
        System.out.println(tv2);

        // encender tv1 y mostrar estado invocar el metodo
        tv1.encender();
        System.out.println("¿El TV1 está encendido? " + tv1.isEncendido());

        // apagar tv1
        tv1.apagar();
        System.out.println("¿El TV1 está encendido? " + tv1.isEncendido());

    }

}
