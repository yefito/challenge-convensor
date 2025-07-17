package com.alura.conversordemonedas.logica;

public class CalcularConversion {


    public static double convertir(double cantidad, double conversion) {
        return cantidad * conversion;
    }

    public static void resultadoMoneda(double cantidad,
                                       String base,
                                       String destino,
                                       double resultado,
                                       String actualizacion) {
        System.out.printf("- %.2f %s equivale a %.2f %s%n", cantidad, base, resultado, destino);
        System.out.println("Última actualización de la moneda: " + actualizacion);
    }
}
