/**
 * Motor de navegación optimizado.
 */
public class GreenFeedPlayer {
    private NodoFeed primero;
    private NodoFeed ultimo;
    private NodoFeed reproduciendoActual;

    public void agregarAlFeed(Contenido c) {
        NodoFeed nuevo = new NodoFeed(c);
        if (primero == null) {
            primero = ultimo = reproduciendoActual = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
    }

    // TAREA: Implementar navegación O(1)
    public Contenido siguienteVideo() {
        if (reproduciendoActual != null && reproduciendoActual.siguiente != null) {
            reproduciendoActual = reproduciendoActual.siguiente;
            return reproduciendoActual.data;
        }
        return null;
    }

    public Contenido videoAnterior() {
        if (reproduciendoActual != null && reproduciendoActual.anterior != null) {
            reproduciendoActual = reproduciendoActual.anterior;
            return reproduciendoActual.data;
        }
        return null;
    }
}