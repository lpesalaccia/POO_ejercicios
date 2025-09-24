package ejercicios_uva1.ejercicio2;

public class SistemaDeControlDeVuelo {

    // Atributos
    private String fabricante;
    private int numeroDeModos;
    private String tipoSistema;
    private int modoActual;  //para cambio de modos

    // Constructor
    public SistemaDeControlDeVuelo(String fabricante, int numeroDeModos, String tipoSistema) {
        this.fabricante = fabricante;
        this.numeroDeModos = numeroDeModos;
        this.tipoSistema = tipoSistema;
        this.modoActual = 1;
    }

    // getters
    public String getFabricante() {
        return fabricante;
    }

    public int getNumeroDeModos() {
        return numeroDeModos;
    }

    public String getTipoSistema() {
        return tipoSistema;
    }

    public int getModoActual() {
        return modoActual;
    }

    // cambiar de modo
    public void cambiarModo(int nuevoModo) {
        if (nuevoModo >= 1 && nuevoModo <= numeroDeModos) {
            modoActual = nuevoModo;
            System.out.println("Modo cambiado a: " + modoActual);
        }else {
            System.out.println("Modo inválido");
        }
    }

}
