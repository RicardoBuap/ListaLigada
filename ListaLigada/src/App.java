public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        lista.ingresarNodoFinalLista(5);
        lista.ingresarNodoFinalLista(4);
        lista.ingresarNodoFinalLista(3);
        lista.ingresarNodoFinalLista(2);
        lista.ingresarNodoFinalLista(1);
        System.out.println("El tamaño de la lista: " + lista.tamañoLista());
        System.out.println("La lista está vacía: " + lista.listaVacia());
        System.out.println(lista.imprimirLista());
    }
}
