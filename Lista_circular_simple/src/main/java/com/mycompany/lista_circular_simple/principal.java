package com.mycompany.lista_circular_simple;

import javax.swing.JOptionPane;

public class principal {

    static int opc = -1;

    public static void main(String[] args) {
        nodo nodo1 = new nodo();

        do {
            //Try catch para evitar que el programa termine si hay un error
            try {
                String lectura = JOptionPane.showInputDialog(null, "************************\nElige opción:\n1.- Ingresar Nodo"
                        + "\n2.- Ingresar Nodo al Medio"
                        + "\n3.- Ingresar Nodo al Final"
                        + "\n4.- Imprimir lista \n"
                        + "0.- Salir\n************************");
                //Recoger una variable por consola
                opc = Integer.parseInt(lectura);
                switch (opc) {
                    case 1:
                        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del nodo a crear : "));
                        nodo1.add(dato);
                        break;
                    case 2:
                        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del nodo a añadir en medio : "));
                        nodo1.insertmd(dato);

                        break;
                    case 3:
dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del nodo a añadir al final : "));
                        nodo1.insertfinal(dato);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "la lista actual es: ");
                        nodo1.mostrar();
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Uoop! Error!>.<");
            }

        } while (opc != 0);
    }
}
