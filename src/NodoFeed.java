/**
 * Nodo de la Lista Doblemente Enlazada.
 */
class NodoFeed {
    Contenido data;
    NodoFeed siguiente;
    NodoFeed anterior;

    public NodoFeed(Contenido data) {
        this.data = data;
        this.siguiente = null;
        this.anterior = null;
    }
}
