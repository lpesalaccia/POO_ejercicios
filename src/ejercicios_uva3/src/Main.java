
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        System.out.println(veiculo1.acelerar(110));

        Coche coche1 = new Coche();
        System.out.println(coche1.acelerar(120));

        //aplicacion del tp
        Coche c = new Coche();
        c.desplazar(); // normal
        c.desplazar("automático"); // automatico
        c.desplazar("normal");

        Bicicleta b = new Bicicleta();
        b.desplazar();

    }
}