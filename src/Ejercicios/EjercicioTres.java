package Ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class EjercicioTres {
    public static Logger log = Logger.getLogger(EjercicioTres.class.getName());

    public static void main(String[] args) {
        /*
        Desarrolla un programa en Java que simule un sistema de acceso mejorado donde el usuario debe ingresa
        r:Usuario y contraseña (como en el ejercicio anterior).
        Si los datos son correctos, se le hará una pregunta de seguridad (ej: "¿Cuál es tu color favorito?").
        Intentos: Máximo 3 intentos para las credenciales. Si acierta, tiene 2 intentos para la pregunta de seguridad
         */
        Scanner sc = new Scanner(System.in);
        String nombreUs = "Ramiro";
        String contraseña = "R1R2R3";
        int intentos = 0;
        int intentosColor = 0;
        String colorFav = "azul";
        boolean accesoConcedido = false;
        while (intentos < 3 && !accesoConcedido) {
            log.info("ingrese nombre de usuario: ");
            String nombre = sc.next();
            log.info("ingrese contraseña: ");
            String intentoContraseña = sc.next();
            if (nombre.equals(nombreUs) && intentoContraseña.equals(contraseña)) {
                log.info("ACCESO CONCEDIDO ");
                accesoConcedido = true;

            } else {
                intentos++;
                log.warning("Usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
            }

        }
        if (accesoConcedido) {
            log.info("Ahora como pregunta de seguridad debe ingresar ¿cual es su color favorito?");
            String intentoColorFav = sc.next();
            do {
                log.info("Ahora como pregunta de seguridad debe ingresar ¿cual es su color favorito?");
                intentoColorFav = sc.next();
                if (intentoColorFav.equals(colorFav)) {
                    log.info("accedio al sistema");
                    break;
                } else {

                    intentosColor++;
                    log.warning("el color es incorrecto intentar otra vez " + intentosColor + "de 2");


                }
            }while (intentosColor < 2) ;
        } else
            log.severe("usuario bloqueado por superar el numero de intentos");


    }//cierre main
}
