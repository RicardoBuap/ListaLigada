public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        lista.ingresarNodoFinalLista(1);
        lista.ingresarNodoFinalLista(2);
        lista.ingresarNodoFinalLista(3);
        lista.ingresarNodoFinalLista(4);
        lista.ingresarNodoFinalLista(5);
        System.out.println("El tamaño de la lista: " + lista.tamañoLista());
        System.out.println("La lista está vacía: " + lista.listaVacia());
        System.out.println("El inicio de la lista es: " + lista.inicioLista());
        System.out.println("El final de la lista es: " + lista.finalLista());
        System.out.println(lista.imprimirLista());
        lista.ingresarNodoPosicionLista("Hello World!", 6);
        System.out.println(lista.imprimirLista());
    }
}
