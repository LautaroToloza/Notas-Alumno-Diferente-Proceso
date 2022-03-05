package notas;

import java.util.*;

/**
 * @author Lautaro Toloza
 */
public class NotasCuatro {

    public static void main(String[] args) {
        /* Consigna:
           Cargar 4 notas aleatorias en una lista, calcular el promedio y redondearlo.
           Si el redondeo es 7 o mayor que devuelva "Promoción",
           sino si el redondeo es mayor a 4 y menor a 7 que devuelva "aprobado".
           si la nota es 4 o menor devuelva "Reprobado".
        */
        List<Integer> notas = new ArrayList<>();
        Random rdo = new Random();

        // Agrego una nota aleatoria al Array
        for (int i = 0; i < 4; i++) {
            notas.add(rdo.nextInt(1, 11));
        }
        int contador = 1;
        double acumulador = 0;

        //Muestreo de la lista y acumulo las notas
        for (Integer nota : notas) {
            String texto = "La nota (" + contador + ") es: ";
            System.out.println(texto + nota);
            acumulador += nota;
            contador++;
        }
        double promedio = acumulador / 4;
        System.out.println("\n****************************************");
        int redondeo = (int) Math.round(promedio);
        System.out.println("Promedio final: " + redondeo);

        // Estado del alumno..
        if (redondeo >= 7) {
            System.out.println("Estado del alumno: Promoción");
        } else if (redondeo > 4) {
            System.out.println("Estado del alumno: Aprobado");
        } else {
            System.out.println("Estado del alumno: Reprobado");
        }
        System.out.println("****************************************");
    }

}
