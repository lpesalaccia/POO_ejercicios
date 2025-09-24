public class Coche extends Veiculo{

    //sobreescribo
    @Override
    public String acelerar(long velocidad) {
        return "El COCHE acelera a " +velocidad+"KMH";
    }
    
    //tp:
    @Override
    public void desplazar() {
        System.out.println("Coche desplazándose en modo normal");
    }

    //sobrecarga desplazar
    public void desplazar(String modo) {
        if ("automático".equalsIgnoreCase(modo)) {
            System.out.println("Coche desplazándose en modo automático");
        } else {
            System.out.println("Coche desplazándose en modo normal");
        }
    }
}
