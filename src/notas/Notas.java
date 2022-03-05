package notas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Lautaro Toloza
 */
public class Notas {

    public static void main(String[] args) {
        
        /* Consigna:
           Cargar 4 notas, calcular el promedio y redondearlo.
           Si el redondeo es 7 o mayor que devuelva "Promoción",
           sino si el redondeo es mayor a 4 y menor a 7 que devuelva "aprobado".
           si la nota es 4 o menor devuelva "Reprobado".
        */
        try {
            double n1 = cargarNota("Ingrese la primera nota: ");
            double n2 = cargarNota("Ingrese la segunda nota: ");
            double n3 = cargarNota("Ingrese la tercera nota: ");
            double n4 = cargarNota("Ingrese la cuarta nota: ");
            double sumatoria = (n1 + n2 + n3 + n4) / 4;
            int promedio = (int) Math.round(sumatoria);
            System.out.println("\n******************************");
            if (promedio >= 7) {
                System.out.println("Promocion");
                System.out.println("Su promedio fue: " + promedio);
            } else if (promedio > 4 && promedio < 7) {
                System.out.println("Aprobado");
                System.out.println("Su promedio fue: " + promedio);
            } else {
                System.out.println("Reprobado");
                System.out.println("Su promedio fue: " + promedio);
            }
            System.out.println("******************************");
        } catch (InputMismatchException tipo) {
            System.out.println("Error de ingreso: " + tipo);
        }

    }

    public static int cargarNota(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.print(texto);
        int nota = leer.nextInt();
        return nota;

    }

}
