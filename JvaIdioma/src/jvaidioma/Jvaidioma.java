package jvaidioma;

import java.util.Scanner;

public class Jvaidioma {
    //C L A S E  S E L E C C I O N  D E  I D I O M A

    public static int ffmuestramenu() {
        int pvOpc;
        Scanner scnTeclado = new Scanner(System.in);
        do {
            System.out.println("Menu de opciones\n");
            System.out.println("1 ESPANIOL");
            System.out.println("2 INGLES");
            System.out.println("3 FRANCES");
            System.out.println("0 Salir");
            System.out.println("Opcion: ");
            pvOpc = scnTeclado.nextInt();
            if (pvOpc < 0 || pvOpc > 3) {
                System.out.println("Lectura invalida");
            }
        } while (pvOpc < 0 || pvOpc > 3);
        return pvOpc;
    }

    //programa selector
    public static void ffpreguntas() {
        clselector clselx = new clselector();
        int pvOpcion;
        do {
            pvOpcion = ffmuestramenu();
            if (pvOpcion != 0) {
                switch (pvOpcion) {
                    case 1:
                        clselx.ffmuestramatriz1();
                        break;
                    case 2:
                        clselx.ffmuestramatriz2();
                        break;
                    case 3:
                        clselx.ffmuestramatriz3();
                        break;
                }
            }
        } while (pvOpcion != 0);
    }

    // P R I N C I P A L
    public static void main(String[] args) {
        ffpreguntas();
    }

}
