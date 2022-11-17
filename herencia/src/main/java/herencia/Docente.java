package herencia;

import java.util.Scanner;

public class Docente extends persona {

    private int cedula;
    private String maestria;

    //constructor
    public Docente(String nombre, int edad, int cedula, String maestria) {//atributos de la clase padre e hija
        super(nombre, edad);//le indicamos al programa que estos atributos ya estan inicializados 
        //inicializa los atributos nuevos de la clase estudiante
        this.cedula = cedula;
        this.maestria = maestria;
    }

    public void ingresar() {
        String n, s;
        int e, c;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Nombre completo : ");
        n = sc.nextLine();
        System.out.println("Edad : ");
        e = sc.nextInt();
        System.out.println("cedula : ");
        c = sc.nextInt();
        System.out.println("En que se especializa: ");
        s = sc.nextLine();
        s = sc.nextLine();
        nombre = n;
        edad = e;
        cedula = c;
        maestria = s;
    }

    void mostrar() { //funcion imprimir
        System.out.println("-----------------\n Nombre: " + nombre + "\nEdad: " + edad + "\nCedula del docente :  " + cedula + "\nEspecializacion: " + maestria);
    }
}
