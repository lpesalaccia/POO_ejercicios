public class Bicicleta extends Vehiculo{

    //metodos publicos, lo que devuelve el metodo --> int, nombre del metodo, (tipo argumento, )
    public int multiplicar(int a, int b) {
        return a*b;
    }

    public int multiplicar(int a, int b, int c) {  //cuerpo del metodo
        return a*b*c;
    }


    //tp
    @Override
    public void desplazar() {
        System.out.println("Bicicleta a pedal");
    }
}
