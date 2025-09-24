package ejercicios_uva1.ejercicio1;

public class Ala {

    private Double envergadura;
    private String color;
    private String tipoMaterial;

    //Constructor
    public Ala(Double envergadura, String color, String tipoMaterial) {
        this.envergadura = envergadura;
        this.color = color;
        this.tipoMaterial = tipoMaterial;
    }

    public void flap(){
        System.out.println("Está encendido el flap");
    }

    public String getColor() {
        return color;
    }

    public Double getEnvergadura() {
        return envergadura;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }


}
