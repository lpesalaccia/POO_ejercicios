package ejercicios_uva1.ejercicio3;

public class Main {

    public static void main(String[] args) {

        //motor 1
        MotorDeAvion motor1 = new MotorDeAvion("Marca A", 50000, 30000, false);

        System.out.println("Marca: " + motor1.getMarca() + ", Empuje: " + motor1.getEmpuje());
        motor1.arrancar();

        //motor 2
        MotorDeAvion motor2 = new MotorDeAvion ("Marca B", 60000, 35000, false);

        System.out.println("Marca: " + motor2.getMarca() + ", Empuje: " + motor2.getEmpuje());
        motor2.detener();
    }

}
