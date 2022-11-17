package arboles;

import java.util.Scanner;

class Nodo {//creacion del nodo

    private int dato;
    private Nodo izquierda, derecha;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    public int getDato() {// getDato mostrar  valor de  atributo
        return dato;
    }

    public Nodo getIzquierda() {// getIzquierda mostrar  valor de  atributo
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {//setIzquierda modificar valor de atributo
        this.izquierda = izquierda;//estos datos pueden ser nulos o tener otro guardado
    }

    public Nodo getDerecha() {//mostrar  valor de  atributo
        return derecha;
    }

    public void setDerecha(Nodo derecha) {//modificar valor de atributo
        this.derecha = derecha;//estos datos pueden ser nulos o tener otro guardado
    }

    public void imprimirDato() {
        System.out.println(this.getDato());//guarda cada nodo
    }
}

class Arbol {

    private Nodo raiz;

    public Arbol() {

    }

    public void insertar(int dato) {
        if (this.raiz == null) {//si la raiz no tiene dato 
            this.raiz = new Nodo(dato);//asigna el valor a raiz
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    /*En caso de que la raíz ya tenga 
            un dato, se comprueba si el dato es menor, y si es así,
            se asigna al nodo izquierda de la raíz y viceversa si es mayor.*/

    //recibe el nodo en el que se inserta y lo acomoda aplique recursividad 
    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {//si derecha no tiene dato 
                padre.setDerecha(new Nodo(dato));//asigna el valor a derecha
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {//si izquierda no tiene dato 
                padre.setIzquierda(new Nodo(dato));//asigna el valor a izquierda
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }
//metodos para imprimir cada orden 

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
            //se imprime el actual y luego izquierda y derecha
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
            /* primero se visitan todos los nodos izquierda, 
luego el central y finalmente el de la derecha.*/
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
            /* primero recorre la izquierda, luego 
            la derecha y finalmente el nodo actual.*/
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }

}

class Main {

    public static void main(String[] argumentos) {
        int opc, dato = 0;
        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();
        do {
            System.out.println("Las opciones son\n1.Ingrese un numero \n2.IN ORDEN\n3.POST ORDEN\n4.PRE ORDEN\n5.Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Digite su numero: \n");
                    dato = sc.nextInt();
                    arbol.insertar(dato);//guarda los numeros ingresados por el usuario

                }
                case 2 -> {
                    System.out.println("Recorriendo inorden:");
                    arbol.inorden();//llamado al metodo
                }
                case 3 -> {
                    System.out.println("Recorriendo postorden:");
                    arbol.postorden();//llamado al metodo
                }
                case 4 -> {
                    System.out.println("Recorriendo preorden:");
                    arbol.preorden();//llamado al metodo
                }

            }
        } while (opc != 5);

    }
}
