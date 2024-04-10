public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 2021;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";
        // Codigo que prueba los operadores relacionales
        if (fechaDeLanzamiento >= 2022){
            System.out.println("La peliculas mas populares");
        } else {
            System.out.println("La pelicula retro que aun valen la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de la pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
