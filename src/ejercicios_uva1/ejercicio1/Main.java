package ejercicios_uva1.ejercicio1;

public class Main {
    public static void main(String[] args) {

        //Crear un objeto o instancia de la clase Ala
        Ala ala1 = new Ala(15.50, "blanco", "material1");
        System.out.println("El color del ala1 es: " + ala1.getColor());
        System.out.println("Envergadura: " +ala1.getEnvergadura());
        System.out.println("Material: "+ala1.getTipoMaterial());
        ala1.flap();

        //Crear otro objeto o instancia de la clase Ala
        Ala ala2 = new Ala(23.80, "verde", "material2");
        System.out.println("El color del ala2 es: " + ala2.getColor());
        System.out.println("Envergadura: " + ala2.getEnvergadura());
        System.out.println("Material: " + ala2.getTipoMaterial());
        ala2.flap();





    }
}
