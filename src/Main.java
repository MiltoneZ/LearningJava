public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");

        // Asi se declaran las variables, tienen que llevar el tipo de variable que va a ser.
        // No puedes declarar una variable sin decirle que tipo de variable es.

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 9.2 + 9.0) /3;
        System.out.println("La media de las notas es: " + media);

        String sinopsis = """
                Matrix es una paradoja.
                La mejor pelicula del fin del milenio.
                Fue lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        // Se pueden convertir diferentes tipos de datos en otro, pero para ello.
        // Se necesita revisar las tablas de conversiones de tipos de datos.

        int clasificacion = (int) (media / 2);
        System.out.println("Estrellas: " + clasificacion);


    }
}