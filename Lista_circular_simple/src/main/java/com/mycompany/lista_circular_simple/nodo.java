package com.mycompany.lista_circular_simple;

import javax.swing.JOptionPane;

public class nodo {

    public class node {

        int dato;
        node sig;

        public node(int dato) {
            this.dato = dato;
        }

    }
    public node cabeza = null;
    public node ultimo = null;
    public int tamaño;

    public void add(int dato) {

        node node1 = new node(dato);
        if (cabeza == null) {
            cabeza = node1;
            ultimo = node1;
            node1.sig = cabeza;
        } else {
            ultimo.sig = node1;
            ultimo = node1;
            ultimo.sig = cabeza;
        }
        tamaño++;
    }

    public void insertmd(int dato) {
        node node2 = new node(dato);
        if (cabeza == null) {
            cabeza = node2;
            ultimo = node2;
            node2.sig = cabeza;
        } else {
            node temporal;
            node actual;
            int revisor = (tamaño % 2);
            if (revisor == 0) {
                tamaño = tamaño / 2;
            } else {
                tamaño = (tamaño + 1) / 2;
            }
            temporal = cabeza;
            actual = null;
            while (tamaño > 0) {
                actual = temporal;
                temporal = temporal.sig;
                tamaño -= 1;
            }
            actual.sig = node2;
            node2.sig = temporal;
        }
        tamaño++;
    }

    public void insertfinal(int dato) {
        if (cabeza == null) {
            node nuevo = new node(dato);
            ultimo = cabeza;
        } else {
          ultimo.sig=new node (dato);
           ultimo = ultimo.sig;

        }

    }

    public void mostrar() {
        node actual = cabeza;
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "la lista esta vacia");
        } else {
            do {
                JOptionPane.showMessageDialog(null, " " + actual.dato);
                actual = actual.sig;
            } while (actual != cabeza);

        }
    }
}
