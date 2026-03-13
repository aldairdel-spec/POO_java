
import java.util.Scanner;
import java.time.LocalDate;

public class Ejercicio5 {

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese año de nacimiento:");
        int anio = sc.nextInt();

        int edad = LocalDate.now().getYear() - anio;

        System.out.println("Edad: " + edad);
    }
}
