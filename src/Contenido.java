/**
 * Representa un video o audio en el feed multimedia.
 */
class Contenido {
    String titulo;
    int duracionSegundos;
    String calidad; // ej. "4K", "1080p"
    public Contenido(String titulo, int duracion, String calidad) {
        this.titulo = titulo;
        this.duracionSegundos = duracion;
        this.calidad = calidad;
    }
}