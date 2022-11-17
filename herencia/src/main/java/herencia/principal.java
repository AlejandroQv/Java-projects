package herencia;


import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Estudiante Estudiante1;
        Docente Docente1;
        Administrativos admon1;

        int opc = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------------------\nSeleccione una opcion\n1.Estudiante\n2.Docente\n3.Administrativo\n4. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:

                    Estudiante1 = new Estudiante("", 0, 0, 0);

                    Estudiante1.ingresar();
                    Estudiante1.mostrar();

                    break;
                case 2:
                    Docente1 = new Docente("", 0, 0, "");
                    Docente1.ingresar();
                    Docente1.mostrar();
                    break;
                case 3:
                    admon1 = new Administrativos("", 0, 0, "");
                    admon1.ingresar();
                    admon1.mostrar();

                    break;
                default:
                    if (opc > 4) {
                        System.out.println("la opcion ingresada no es correcta ");
                    }
                    break;
            }
        } while (opc != 4);

    }

}
