import java.util.Scanner;

public class Ejercicio4 {

    public void ejecutar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num = sc.nextInt();

        if(num % 2 == 0 && num > 0)
            System.out.println("Par positivo");
        else if(num % 2 == 0 && num < 0)
            System.out.println("Par negativo");
        else if(num % 2 != 0 && num > 0)
            System.out.println("Impar positivo");
        else
            System.out.println("Impar negativo");

    }

}

