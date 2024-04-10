import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;

        // El bucle for se utiliza para repetir un bloque de código un número determinado de veces.

        for (int i = 0; i < 3; i++) {
            System.out.println("Da una nota de la pelicula Matrix: ");
            nota = teclado.nextDouble();
            mediaEvaluacion += nota;
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluacion / 3);
    }
}