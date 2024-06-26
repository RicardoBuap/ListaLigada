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

    public Object inicioLista(){
        return inicioLista.informacion;
    }

    public Object finalLista(){
        return finalLista.informacion;
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

    public void ingresarNodoPosicionLista(Object informacion, int posicion){
        if(listaVacia()){
            ingresarNodoFinalLista(informacion);
        }
        else if(posicion > tamañoLista()){
            ingresarNodoFinalLista(informacion);
        }
        else if(posicion <= 1){
            ingresarNodoInicioLista(informacion);
        }
        else{
            Nodo nuevoNodo = new Nodo(informacion);
            Nodo recorrido = inicioLista;
            for(int i = 1; i < posicion - 1; i++ ){
                recorrido = recorrido.siguiente;
            }
            nuevoNodo.siguiente= recorrido.siguiente;
            recorrido.siguiente = nuevoNodo;
            tamaño++;
        }
    }

    public Object eliminarNodoInicioLista(){
        Object eliminado = inicioLista.informacion;
        inicioLista = inicioLista.siguiente;
        tamaño--;
        return eliminado;
    }

    public void vaciarLista(){
        while(!listaVacia())
            eliminarNodoInicioLista();
    }

    public Object eliminarNodoFinalLista(){
        Object eliminado = finalLista.informacion;
        if(tamañoLista() == 1){
            vaciarLista();
        }
        else{
            Nodo recorrido = inicioLista;
            while(recorrido.siguiente.siguiente != null){
                recorrido = recorrido.siguiente;
            }
            recorrido.siguiente = recorrido.siguiente.siguiente;
            finalLista = recorrido;
            tamaño--;
        }
        return eliminado;
    }

    public Object eliminarNodoPosicionLista(int posicion){
        Object eliminado = null;
        if(posicion >= tamañoLista()){
            eliminado = eliminarNodoFinalLista();
        }
        else if(posicion <= 1){
            eliminado = eliminarNodoInicioLista();
        }
        else{
            Nodo recorrido = inicioLista;
            for(int i = 1; i < posicion - 1; i++){
                recorrido = recorrido.siguiente;
            }
            eliminado = recorrido.siguiente.informacion;
            recorrido.siguiente = recorrido.siguiente.siguiente;
            tamaño--;
        }
        return eliminado;
    }
}

