import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        int posicion;
        Object informacion;
        while(continuar){
            System.out.println("- - - - - - - - - Menú - - - - - - - - -");
            System.out.println("Ingresar nodo al inicio de la lista:   1");
            System.out.println("Ingresar nodo al final de la lista:    2");
            System.out.println("Ingresar nodo en posición de la lista: 3");
            System.out.println("Eliminar inicio de la lista ligada:    4");
            System.out.println("Imprimir lista ligada: 5");
            System.out.println("Imprimir inicio de la lista: 6");
            System.out.println("Imprimir final de la lista:  7");
            System.out.println("Tamaño de la lista ligada: 8");
            System.out.println("¿La lista ligada está vacía?: 9");
            System.out.println("Salir del programa: 10");
            System.out.print("\nIngresa una opción del menú:");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un valor para el nodo: ");
                    informacion = teclado.nextLine();
                    informacion = teclado.nextLine();
                    lista.ingresarNodoInicioLista(informacion);
                    break;

                case 2:
                    System.out.print("Ingresa un valor para el nodo: ");
                    informacion = teclado.nextLine();
                    informacion = teclado.nextLine();
                    lista.ingresarNodoFinalLista(informacion);
                    break;

                case 3:
                    System.out.print("Ingresa la posición a la que deseas insertar el nodo: ");
                    posicion = teclado.nextInt();
                    System.out.print("Ingresa un valor para el nodo: ");
                    informacion = teclado.nextLine();
                    informacion = teclado.nextLine();
                    lista.ingresarNodoPosicionLista(informacion, posicion);
                    break;

                case 4:
                    if(lista.listaVacia()){
                        System.out.println("La lista ligada está vacía.");
                    }
                    else{
                        System.out.println("Se ha eliminado el nodo inicial con información: " + lista.eliminarNodoInicioLista());
                    }
                    break;

                case 5: 
                    if(lista.listaVacia()){
                        System.out.println("La lista ligada está vacía.");
                    }
                    else{
                        System.out.println(lista.imprimirLista());
                    }
                    break;

                case 6:
                    if(lista.listaVacia()){
                        System.out.println("La lista ligada está vacía.");
                    }
                    else{
                        System.out.println("Inicio de la lista: " + lista.inicioLista());
                    }
                    break;

                case 7:
                    if(lista.listaVacia()){
                        System.out.println("La lista ligada está vacía.");
                    }
                    else{
                        System.out.println("Final de la lista: " + lista.finalLista());
                    }
                    break;

                case 8:
                    if(lista.listaVacia()){
                        System.out.println("La lista ligada está vacía.");
                    }
                    else{
                        System.out.println("Tamaño de la lista: " + lista.tamañoLista());
                    }
                    break;

                case 9:
                    if(lista.listaVacia()){
                        System.out.println("La lista ligada está vacía.");
                    }
                    else{
                        System.out.println("La lista ligada no está vacía.");
                    }
                    break;

                case 10:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
            
                default:
                    break;
            }
        }
        teclado.close();
    }
}
