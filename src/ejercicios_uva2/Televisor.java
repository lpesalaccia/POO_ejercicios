package ejercicios_uva2;

public class Televisor {

    // atributos - caracteristicas
    private String marca;
    private String modelo;
    private int añoDeFabricacion;
    private String tipo;   //(P: plasma, L: LCD, O: OLED)
    private String tamañoDePantalla;  // en pulgadas
    private String resolucion;  // por ej: 1080p, 4k
    private boolean smart;
    private boolean encendido;
    private Pantalla pantalla;

    //constructor
    public Televisor(String marca, String modelo, int añoDeFabricacion, String tipo, String tamañoDePantalla,
                     String resolucion, boolean smart) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoDeFabricacion = añoDeFabricacion;
        this.tipo = tipo;
        this.tamañoDePantalla = tamañoDePantalla;
        this.resolucion = resolucion;
        this.smart = smart;
        this.encendido = false;
        this.pantalla = pantalla;

    }

    //métodos para encender y apagar - comportamientos
    public void encender() {
        encendido = true;
        System.out.println(marca + " " + modelo + " está ahora ENCENDIDO.");
    }
    public void apagar() {
        encendido = false;
        System.out.println(marca + " " + modelo + " está ahora APAGADO.");
    }
    //método para consultar estado
    public boolean isEncendido() {
        return encendido;
    }

    // getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() { return modelo; }
    public int getAñoDeFabricacion() { return añoDeFabricacion;}
    public String getTipo() {return tipo; }
    public String getTamañoDePantalla() {return tamañoDePantalla; }
    public String getResolucion() {return resolucion; }
    public boolean getSmart() {return smart;}

    //tostring para mostrar info
    @Override
    public String toString() {
        return "Televisor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoDeFabricacion=" + añoDeFabricacion +
                ", tipo='" + tipo + '\'' +
                ", tamañoDePantalla='" + tamañoDePantalla + '\'' +
                ", resolucion='" + resolucion + '\'' +
                ", smart=" + smart +
                ", encendido=" + encendido +
                '}';
    }
}