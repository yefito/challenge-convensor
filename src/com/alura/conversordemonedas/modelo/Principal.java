import com.alura.conversordemonedas.logica.CalcularConversion;
import com.alura.conversordemonedas.logica.BuscarMoneda;
import com.alura.conversordemonedas.logica.FiltroDeMonedas;
import com.alura.conversordemonedas.modelo.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BuscarMoneda buscar = new BuscarMoneda();

        int opcion;
        do {
            System.out.println("*************************************");
            System.out.println("\n *** Bienvenido al conversor de monedas ***");
            System.out.println(" 1️ Convertir moneda" );
            System.out.println(" 2 Salir" );
            System.out.println(" Elija una opcion valida : ");
            System.out.println("*************************************");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione la moneda base: ");
                    System.out.println("Ingrese la cantidad a convertir: ");
                    FiltroDeMonedas.opciones();
                    int opcionBase = scanner.nextInt();
                    String base = FiltroDeMonedas.codigoMoneda(opcionBase, scanner);

                    System.out.println( "Seleccione la moneda destino: " );
                    FiltroDeMonedas.opciones();
                    int opcionDestino = scanner.nextInt();
                    String destino = FiltroDeMonedas.codigoMoneda(opcionDestino, scanner);

                    System.out.println("Ingrese la cantidad a convertir: " );
                    double cantidad = scanner.nextDouble();

                    try {
                        Moneda moneda = buscar.moneda(base, destino);
                        double resultado = CalcularConversion.convertir(cantidad, moneda.conversion_rate());
                        CalcularConversion.resultadoMoneda(cantidad, base, destino, resultado, moneda.time_last_update_utc());

                    } catch (IllegalArgumentException e){
                        System.out.println(" Error en  valor ingresado: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println(" Error de conversión: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println(" Gracias por usar el conversor. ¡Hasta la próxima! ");
                    break;
                default:
                    System.out.println(" Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 2);

        System.out.println(" Cierre de aplicación");
        scanner.close();
    }
}
