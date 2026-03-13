package ejecucion;
import animales.Mascotas;
import servicios.Servicios;
import facturacion.Factura;

public class Principal {
    public  static void main(String[] args){

        Mascotas miPerro = new Mascotas("scoot", "perro", 4);

        Servicios serv = new Servicios();
        String tipo = "consulta";
        double precio = serv.obtenerPrecio(tipo);

        Factura fact = new Factura();
        fact.generarRecibo(miPerro,tipo,precio);
    }


}
