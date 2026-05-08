public class Main {
    public static void main(String[] args) {
        GreenFeedPlayer feed = new GreenFeedPlayer();
        int totalElementos = 1_000_000;

        System.out.println("Cargando " + totalElementos + " contenidos...");
        for (int i = 1; i <= totalElementos; i++) {
            feed.agregarAlFeed(new Contenido("Video " + i, 60, "1080p"));
        }

        for (int i = 0; i < 999_999; i++) {
            feed.siguienteVideo();
        }

        System.out.println("--- Inicio de Simulación de Retroceso ---");

        long inicioO1 = System.nanoTime();
        Contenido anterior = feed.videoAnterior();
        long finO1 = System.nanoTime();

        if (anterior != null) {
            System.out.println("Retrocedimos: " + anterior.titulo);
            System.out.println("Tiempo en O(1) con puntero 'anterior': " + (finO1 - inicioO1) + " nanosegundos.");
        }

    }
}
