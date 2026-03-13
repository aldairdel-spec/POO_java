import java.util.Random;

public class Ejercicio8 {

    public void ejecutar() {

        Random r = new Random();

        int numero = r.nextInt(21) + 50;

        System.out.println("Numero aleatorio: " + numero);
    }
}
