public class ListaLigada {
    private Nodo inicioLista;
    private Nodo finalLista;
    private int tamaño;
    private String lista;

    public ListaLigada(){
        this.inicioLista =  null;
        this.finalLista = null;
        this.tamaño = 0;
        this.lista = "";
    }

    public boolean listaVacia(){
        return inicioLista == null;
    }

    public int tamañoLista(){
        return tamaño;
    } 

    public String imprimirLista(){
        Nodo recorrido = inicioLista;
        lista = "";
        while(recorrido != null){
            lista += recorrido.informacion + " - > ";
            recorrido = recorrido.siguiente; 
        }
        return lista;
    }

    public void ingresarNodoFinalLista(Object informacion){
        Nodo nuevoNodo = new Nodo(informacion);
        if(listaVacia()){
            inicioLista = nuevoNodo;
        }
        else{
            finalLista.siguiente = nuevoNodo;
        }
        finalLista = nuevoNodo;
        tamaño++;
    }

    public void ingresarNodoInicioLista(Object informacion){
        if(listaVacia()){
            ingresarNodoFinalLista(informacion);
        }
        else{
            Nodo nuevoNodo = new Nodo(informacion);
            nuevoNodo.siguiente = inicioLista;
            inicioLista = nuevoNodo;
            tamaño++;
        }
    }
}

