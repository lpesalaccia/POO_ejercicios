package ejercicios_uva1.ejercicio4;

import ejercicios_uva1.ejercicio1.Ala;
import ejercicios_uva1.ejercicio2.SistemaDeControlDeVuelo;
import ejercicios_uva1.ejercicio3.MotorDeAvion;

public class Main {
    public static void main(String[] args) {
        MotorDeAvion motor = new MotorDeAvion ("Marca A", 20000, 8, true);
        SistemaDeControlDeVuelo sistema = new SistemaDeControlDeVuelo ("Aleman", 4, "pilotoAutomatico");
        Ala ala1 = new Ala (15.0, "Blanco", "material1");
        Ala ala2 = new Ala (15.0, "Blanco", "material2");


        //creo avion
        Avion avion = new Avion(
                "Marca 1",
                "2.1",
                motor,
                sistema,
                ala1,
                ala2,
                180,
                true
        );

        System.out.println(avion);
        System.out.println("Marca: " + avion.getMarca());
        System.out.println("Modelo: " + avion.getModelo());
        System.out.println("Motor: " + avion.getMotor());
        System.out.println("Sistema de control: " + avion.getSistemaDeControl());
        System.out.println("Ala 1: " + avion.getAla1());
        System.out.println("Ala 2: " + avion.getAla2());
        System.out.println("Número de asientos: " + avion.getNumeroDeAsientos());
        System.out.println("Sistema de entretenimiento: " + avion.getSistemaDeEntretenimiento());
    }
}