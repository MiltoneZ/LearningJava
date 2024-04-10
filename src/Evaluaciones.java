import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;
        double totalEvaluaciones = 0;

        // El bucle while se utiliza para repetir un bloque de código mientras una condición sea verdadera.
        while (nota != -1){
            System.out.println("Da una nota de la pelicula Matrix: ");
            nota = teclado.nextDouble();
            // Cuando digites el número -1, el bucle terminara.
            if (nota != -1){
                mediaEvaluacion += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluacion / totalEvaluaciones);
    }
}
