package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Adivina el numero:");


        int numeroSecreto = random.nextInt(100) + 1; // entre 1 y 100
        int maxIntentos   = 7;

        Juego juego = new Juego(numeroSecreto, maxIntentos);

        System.out.println("Adivina el número entre 1 y 100.");
        System.out.println("Tienes " + maxIntentos + " intentos.");

        while (juego.quedanIntentos() && !juego.isGanado()) {
            System.out.print("\nIntento " + (juego.getIntentos() + 1)
                    + "/" + maxIntentos + " → ");
            int intento = sc.nextInt();

            String resultado = juego.adivinar(intento);

            switch (resultado) {
                case "CORRECTO"    -> System.out.println("🎉 ¡Correcto! Lo adivinaste en "
                        + juego.getIntentos() + " intentos.");
                case "MAYOR"       -> System.out.println(" El número es MAYOR.");
                case "MENOR"       -> System.out.println(" El número es MENOR.");
                case "SIN_INTENTOS"-> System.out.println("Sin intentos disponibles.");
            }
        }

        if (!juego.isGanado()) {
            System.out.println("\n ¡Perdiste! El número era: "
                    + juego.getNumeroSecreto());
        }

        sc.close();
    }
}