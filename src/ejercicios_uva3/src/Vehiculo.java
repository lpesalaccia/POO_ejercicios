public class Veiculo {

    public String acelerar(long velocidad) {
        return "El veiculo acelera a " +velocidad+"KMH";
    }
    public String detener(){
       return "El veiculo esta detenido";
    }

    public String correr() {
        return "El veiculo esta corriendo";
    }

    //para tp
    public void desplazar() {
        System.out.println("Vehículo desplazándose");
    }
}
