public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        lista.ingresarNodoInicioLista(0);
        lista.ingresarNodoFinalLista(1);
        lista.ingresarNodoInicioLista(-1);
        lista.ingresarNodoFinalLista(2);
        lista.ingresarNodoFinalLista(3);
        lista.ingresarNodoFinalLista(4);
        lista.ingresarNodoFinalLista(5);
        lista.ingresarNodoInicioLista(-2);
        
        System.out.println("El tamaño de la lista: " + lista.tamañoLista());
        System.out.println("La lista está vacía: " + lista.listaVacia());
        System.out.println(lista.imprimirLista());
    }
}
