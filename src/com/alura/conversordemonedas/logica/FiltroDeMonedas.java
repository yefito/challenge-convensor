package com.alura.conversordemonedas.logica;

import java.util.Scanner;

public class FiltroDeMonedas {

    public static void opciones() {
        System.out.println("--- Monedas Disponibles --- " );
        System.out.println(" 1- Peso Argentino (ARS)" );
        System.out.println(" 2- Boliviano boliviano (BOB)");
        System.out.println(" 3- Real brasileño (BRL)");
        System.out.println(" 4- Peso chileno (CLP)");
        System.out.println(" 5- Peso colombiano (COP)");
        System.out.println(" 6- Dólar estadounidense (USD)");
    }

    public static String codigoMoneda (int opcion, Scanner scanner){
        String moneda = "";
        switch (opcion) {
            case 1:
                moneda = "ARS";
                break;
            case 2:
                moneda = "BOB";
                break;
            case 3:
                moneda = "BRL";
                break;
            case 4:
                moneda = "CLP";
                break;
            case 5:
                moneda = "COP";
                break;
            case 6:
                moneda = "USD";
                break;

            default:
                System.out.println("Elija opcion valida." );
                break;
        }
        return moneda;
    }
}
