package Ejercicios;

//Realizar un programa que genere un número aleatorio, entre 1 y 10, y le pida al usuario que adivine el número, sin límite de intentos.
//Ayuda: para generar el nro:  (int)(Math.random() * 10 + 1);

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static  final Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nroAzar = (int) (Math.random() * 10 + 1);
        int intento;
        System.out.printf("HAY QUE ADIVINAR EL NUMERO DEL 1 AL 10");

       do {
        intento = sc.nextInt();

        if (intento != nroAzar) {
            System.out.println("Incorrecto. Probá otra vez.");
        }

    } while(intento != nroAzar);

        log.info("¡Correcto! El número era: "+ nroAzar);

}
}