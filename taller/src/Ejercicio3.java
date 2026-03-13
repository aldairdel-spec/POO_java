
import java.util.Scanner;

public class Ejercicio3 {

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es PAR");
        } else {
            System.out.println("Es IMPAR");
        }
    }
}
