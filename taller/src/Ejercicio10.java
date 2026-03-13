import java.util.Scanner;

public class Ejercicio10 {

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valor de venta:");
        double venta = sc.nextDouble();

        double iva = venta * 0.19;
        double descuento;

        if (venta > 150000)
            descuento = venta * 0.25;
        else
            descuento = venta * 0.10;

        double total = venta + iva - descuento;

        System.out.println("IVA: " + iva);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
    }
}

