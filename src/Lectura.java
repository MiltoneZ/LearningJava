import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {

        // Utilizamos Scanner para leer datos del usuario,
        // Es decir que escriba datos en la consola.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita: ");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe el año de lanzamiento: ");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Da una nota de la pelicula: ");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
