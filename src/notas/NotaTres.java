package notas;

import java.util.Random;

/**
 * @author Lautaro Toloza
 */
public class NotaTres {
    
    public static void main(String[] args) {
        /* Consigna:
           Cargar 4 notas aleatorias en una lista, calcular el promedio y redondearlo.
           Si el redondeo es 7 o mayor que devuelva "Promoción",
           sino si el redondeo es mayor a 4 y menor a 7 que devuelva "aprobado".
           si la nota es 4 o menor devuelva "Reprobado".
        */
        double acumulador = 0;
        Random rdo = new Random();
        int[] notas = new int [4];
        for (int i = 0; i < notas.length; i++) {
            // Genero notas aleatorias
            notas[i] = rdo.nextInt(1,11);
            acumulador += notas[i];
            String texto = "La nota ("+(i+1)+") es: "+notas[i];
            System.out.println(texto);
        }
        
        // Calculo del promedio de las notas
        double promedio = acumulador/ 4;
        
        // Redondeo el promedio
        int redondeo = (int) Math.round(promedio);
        System.out.println("\n***********************");
        System.out.println("Promedio final: "+redondeo);
        
        // Estado del alumno..
        if (redondeo >= 7) {
            System.out.println("Estado del alumno: Promoción");
        } else if (redondeo > 4) {
            System.out.println("Estado del alumno: Aprobado");
        } else {
            System.out.println("Estado del alumno: Reprobado");
        }
        System.out.println("***********************");
    }
}
