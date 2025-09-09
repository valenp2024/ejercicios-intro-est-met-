public class listaArreglo implements Lista {
    // implementa el TAD Lista usando arreglos, memoria estatica
    //agregar elemnto
    void insertarFin (T item);
    void insertarInicio (T elem);
    void insertarPos (T elem, int pos);
    //eliminar elemento
    T eliminarUltimo();
    T eliminarPrimero ();
    T eliminarPos (int pos);
    //ontener un elemento
    T obtenerUltimo();
    T obtenerPrimero ();
    T obtenerPos (int pos);
    //metodos auxiliares
    int buscar (T item);
    int longitud ();
    boolean esVacia ();
    void imprimir ();
}
