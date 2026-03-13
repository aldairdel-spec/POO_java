import java.util.Scanner;

public class Ejercicio9 {

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese edad:");
        int edad = sc.nextInt();

        if (edad <= 3)
            System.out.println("Bebe");
        else if (edad <= 8)
            System.out.println("Niño");
        else if (edad <= 17)
            System.out.println("Adolescente");
        else
            System.out.println("Adulto");
    }
}

