package notas;

import java.util.*;

/**
 * @author Lautaro Toloza
 */
public class NotasDos {

    public static void main(String[] args) {
        /* Consigna:
           Usar un while y cargar 4 notas aleatorias, calcular el promedio
           y redondearlo.
           Si el redondeo es 7 o mayor que devuelva "Promoción",
           sino si el redondeo es mayor a 4 y menor a 7 que devuelva "aprobado".
           si la nota es 4 o menor devuelva "Reprobado".
        */
        Random r1 = new Random();
        int contador = 1;
        double acumulador = 0;
        while (contador <= 4) {
            // Usamos la variable del Random para los número aleatorios.
            int nota = r1.nextInt(1, 11);
            System.out.println("La nota (" + contador + ") es: " + nota);
            acumulador += nota;
            contador += 1;

        }
        double resultado = acumulador / 4;
        System.out.println("Resultado: " + resultado);
        // Redondeo del resultado
        int promedio = (int) Math.round(resultado);
        System.out.println("\n----------------------------");
        System.out.println("Promedio: " + promedio);
        // Codición del estudiante..
        if (promedio >= 7) {
            System.out.println("Promoción");
        } else if (promedio > 4) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

}
