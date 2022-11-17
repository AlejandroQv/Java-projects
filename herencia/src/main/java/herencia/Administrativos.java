package herencia;

import java.util.Scanner;

public class Administrativos extends persona {

    private int cedula;
    private String cargo;

    //constructor
    public Administrativos(String nombre, int edad, int cedula, String cargo) {//atributos de la clase padre e hija
        super(nombre, edad);//le indicamos al programa que estos atributos ya estan inicializados 
        //inicializa los atributos nuevos de la clase estudiante
        this.cedula = cedula;
        this.cargo = cargo;
    }

    public void ingresar() {
        String n, s;
        int e, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre completo : ");
        n = sc.nextLine();
        System.out.println("Edad : ");
        e = sc.nextInt();
        System.out.println("cedula : ");
        c = sc.nextInt();
        System.out.println("Cargo : ");
        s = sc.nextLine();
        s = sc.nextLine();
        nombre = n;
        edad = e;
        cedula = c;
        cargo = s;
    }

    void mostrar() { //funcion imprimir
        System.out.println("-----------------\n Nombre: " + nombre + "\nEdad: " + edad + "\nCedula del administrativo :  " + cedula + "\n Cargo : " + cargo);
    }
}
