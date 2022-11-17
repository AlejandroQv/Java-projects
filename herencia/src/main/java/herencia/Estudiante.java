package herencia;

import java.util.Scanner;

public class Estudiante extends persona {

    private int codigo, nota;

    //constructor
    public Estudiante(String nombre, int edad, int codigo, int nota) {//atributos de la clase padre e hija
        super(nombre, edad);//le indicamos al programa que estos atributos ya estan inicializados 
        //inicializa los atributos nuevos de la clase estudiante
        this.codigo = codigo;
        this.nota = nota;
    }

   public void ingresar() {
     String n;
     int e, c, s;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nombre completo: ");
        n = sc.nextLine();
        System.out.println("Edad: ");
        e = sc.nextInt();
        System.out.println("Codigo estudiante: ");
        c = sc.nextInt();
           System.out.println("Semestre estudiante: ");
        s = sc.nextInt();
nombre=n;
edad=e;
codigo =c;
nota = s ;
    }


   void mostrar() { //funcion imprimir
        System.out.println("-----------------\nNombre: " + nombre + "\nEdad: " + edad + "\nCodigo Estudiante: " + codigo + "\nNota: " + nota);
    }
}
