package ejercicios_uva1.ejercicio3;

public class MotorDeAvion {

    // Atributos
    private String marca;
    private int caballosDeFuerza;  //en hp
    private int empuje;  //en libras
    private boolean encendido;  //arrancar y detener

    // Constructor
    public MotorDeAvion(String marca, int caballosDeFuerza,int empuje, boolean encendido) {
        this.marca = marca;
        this.caballosDeFuerza = caballosDeFuerza;
        this.encendido = false;
        this.empuje = empuje;
    }

    // getters
    public String getMarca() {
        return marca;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public int getEmpuje() {
        return empuje;
    }

    // cambiar de estado
    public void arrancar() {
        encendido = true;
        System.out.println("Motor arrancado");
    }

    public void detener() {
        encendido = false;
        System.out.println("Motor detenido");
    }

}
