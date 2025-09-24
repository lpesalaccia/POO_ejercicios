package ejercicios_uva1.ejercicio4;

import ejercicios_uva1.ejercicio1.Ala;
import ejercicios_uva1.ejercicio2.SistemaDeControlDeVuelo;
import ejercicios_uva1.ejercicio3.MotorDeAvion;

public class Avion {
    private String marca;
    private String modelo;
    private MotorDeAvion motor;
    private SistemaDeControlDeVuelo sistemaDeControl;
    private Ala ala1;
    private Ala ala2;
    private int numeroDeAsientos;
    private boolean sistemaDeEntretenimiento;

    public Avion(String marca, String modelo, MotorDeAvion motor, SistemaDeControlDeVuelo sistemaDeControl,
                 Ala ala1, Ala ala2, int numeroDeAsientos, boolean sistemaDeEntretenimiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.sistemaDeControl = sistemaDeControl;
        this.ala1 = ala1;
        this.ala2 = ala2;
        this.numeroDeAsientos = numeroDeAsientos;
        this.sistemaDeEntretenimiento = true;
    }

    // getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public MotorDeAvion getMotor() {
        return motor;
    }
    public SistemaDeControlDeVuelo getSistemaDeControl() {
        return sistemaDeControl;
    }
    public Ala getAla1() {
        return ala1;
    }
    public Ala getAla2() {
        return ala2;
    }
    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public boolean getSistemaDeEntretenimiento() {
        return sistemaDeEntretenimiento;
    }
}
