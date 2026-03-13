public class Principal {

    public static void main(String[] args) {

        // Crear operador
        Operador operador = new Operador("Claro");

        operador.mostrarOperador();

        System.out.println();

        // Crear plan
        Plan plan1 = new Plan("Plan 10GB", 30000, 10);

        // Crear usuario
        Usuario usuario1 = new Usuario(
                "Aldair de los reys",
                "aldairdelosreys@gmail.com",
                315493242L,
                plan1
        );

        usuario1.mostrarDatos();
    }
}