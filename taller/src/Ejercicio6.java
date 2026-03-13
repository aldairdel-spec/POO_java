import java.util.Scanner;

public class Ejercicio6 {

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero telefonico:");
        String numero = sc.next();

        if (numero.startsWith("300"))
            System.out.println("Operador Claro");
        else if (numero.startsWith("310"))
            System.out.println("Operador Tigo");
        else if (numero.startsWith("320"))
            System.out.println("Operador Movistar");
        else
            System.out.println("Operador desconocido");
    }
}
