package Ejercicios;

//Realizar un programa que indique usuario y  contraseña con un máximo de 3 intentos. Si supera la cantidad de intentos con datos
//inválidos: mostrar un mensaje indicando que  se ha bloqueado el usuario.

import java.util.Scanner;
import java.util.logging.Logger;

public class EjercicioDos {
    public static Logger log = Logger.getLogger(EjercicioDos.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreUs = "Ramiro";
        String contraseña = "R1R2R3";
        int intentos = 0;
        boolean accesoConcedido = false;
        while (intentos < 3 && !accesoConcedido) {
            System.out.printf("ingrese nombre de usuario: ");
            String nombre = sc.next();
            System.out.printf("ingrese contraseña: ");
            String intentoContraseña = sc.next();
            if (nombre.equals(nombreUs) && intentoContraseña.equals(contraseña)) {
                log.info("ACCESO CONCEDIDO ");
                accesoConcedido = true;
                
            } else {
                intentos++;
                log.warning("Usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
            }

        }
        if (!accesoConcedido) {
            log.severe("USUARIO BLOQUEADO POR SUPERAR LOS INTENTOS");
        }

    }//cierre main
}
