import java.util.Scanner;

public class Ejercicio7 {

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer numero:");
        int a = sc.nextInt();

        System.out.println("Ingrese segundo numero:");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Intercambiados:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
