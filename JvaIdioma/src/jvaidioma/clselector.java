package jvaidioma;

import java.util.Scanner;

public class clselector {

    public static int mostrar() {
        Scanner scnTeclado = new Scanner(System.in);
        int op = 1;
        int opi;
        do {
            System.out.println("1 Todos");
            System.out.println("2 Edad");
            System.out.println("3 Sexo");
            System.out.println("0 Salir");
            System.out.println("Que opcion decidio: ");
            opi = scnTeclado.nextInt();

        } while (op == 0);

        return opi;
    }
        //Matriz 1 Español
    public static void ffmuestramatriz1() {
        int preguntas = 0;
        int pvmatriz = 0;
        int aux = 0;
        String nombre[][];
        int sexo[][];
        String estatura[][];
        String correo[][];
        int edad[][];
        nombre = new String[5][10];
        sexo = new int[5][10];
        estatura = new String[5][10];
        correo = new String[5][10];
        edad = new int[5][10];
        Scanner scnTeclado = new Scanner(System.in);
        do {
            System.out.println("\tMatriz en espaniol\n");
            System.out.println("Vamos a comenzar\n");
            System.out.println("1 Captura informacion");
            System.out.println("2 Mostrar informacion");
            System.out.println("0 Salir");
            System.out.println("Opcion: ");
            pvmatriz = scnTeclado.nextInt();
            switch (pvmatriz) {
                //CONDICIONAL
                case 1:
                    for (int i = 0; i < edad.length; i++) {
                        for (int j = 0; j < 2; j++) {
                            aux++; //contador
                            System.out.println("Persona " + aux); //imprimir el contador del numero de persona

                            //preguntas            
                            System.out.println("Dame tu nombre: ");
                            nombre[i][j] = scnTeclado.next();
                            do {
                                System.out.println("Dame tu sexo(1 si es hombre y 2 si es mujer): ");
                                sexo[i][j] = scnTeclado.nextInt();
                            } while (sexo[i][j] < 0 || sexo[i][j] > 2);

                            System.out.println("Dame tu estatura: ");
                            estatura[i][j] = scnTeclado.next();
                            System.out.println("Dame tu edad: ");
                            edad[i][j] = scnTeclado.nextInt();
                            System.out.println("Dame tu correo electronico: ");
                            correo[i][j] = scnTeclado.next();
                        }

                    }

                    break;
                case 2:
                    do {
                        preguntas = mostrar();
                        switch (preguntas) {
                            case 1:
                                System.out.println("NOMBRE" + "\t" + "SEXO" + "\t" + "EDAD" + "\t" + "ESTATURA" + "\t" + "CORREO");
                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        System.out.print(nombre[i][j] + "\t");
                                        System.out.print(sexo[i][j] + "\t");
                                        System.out.print(edad[i][j] + "\t");
                                        System.out.print(estatura[i][j] + "\t");
                                        System.out.print(correo[i][j] + "\t");
                                        System.out.println("");
                                    }

                                }
                                break;
                            case 2:
                                int filtro0;
                                System.out.println("Edad: ");
                                filtro0 = scnTeclado.nextInt();
                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        if (edad[i][j] == filtro0) {
                                            System.out.println(nombre[i][j] + "\t" + sexo[i][j] + "\t" + edad[i][j] + "\t" + estatura[i][j] + "\t" + correo[i][j] + "\t");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                int filtro1;
                                System.out.println("Genero: ");
                                filtro1 = scnTeclado.nextInt();

                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        if (sexo[i][j] == filtro1) {
                                            System.out.println(nombre[i][j] + "\t" + sexo[i][j] + "\t" + edad[i][j] + "\t" + estatura[i][j] + "\t" + correo[i][j] + "\t");
                                        }
                                    }
                                }
                                break;
                        }
                    } while (preguntas != 0);
                    break;
            }
            if (pvmatriz == 0) {
                break;
            }
        } while (pvmatriz != 0);
    }

    //matriz 2 ingles
    public static void ffmuestramatriz2() {
        int preguntas = 0;
        int pvmatriz = 0;
        int aux = 0;
        String nombre[][];
        int sexo[][];
        String estatura[][];
        String correo[][];
        int edad[][];
        nombre = new String[5][10];
        sexo = new int[5][10];
        estatura = new String[5][10];
        correo = new String[5][10];
        edad = new int[5][10];
        Scanner scnTeclado = new Scanner(System.in);
        do {
            System.out.println("\tMatrix in english\n");
            System.out.println("Let's start\n");
            System.out.println("1 Capture information");
            System.out.println("2 Show information");
            System.out.println("0 Get out");
            System.out.println("Option: ");
            pvmatriz = scnTeclado.nextInt();
            switch (pvmatriz) {
                //CONDICIONAL
                case 1:
                    for (int i = 0; i < edad.length; i++) {
                        for (int j = 0; j < 2; j++) {
                            aux++; //contador
                            System.out.println("Persona " + aux); //imprimir el contador del numero de persona

                            //preguntas            
                            System.out.println("Give me your name: ");
                            nombre[i][j] = scnTeclado.next();
                            do {
                                System.out.println("Give me your sex(1 if it's a man and 2 if it's a woman): ");
                                sexo[i][j] = scnTeclado.nextInt();
                            } while (sexo[i][j] < 0 || sexo[i][j] > 2);

                            System.out.println("Give me your height: ");
                            estatura[i][j] = scnTeclado.next();
                            System.out.println("Give me your age: ");
                            edad[i][j] = scnTeclado.nextInt();
                            System.out.println("Give me your email: ");
                            correo[i][j] = scnTeclado.next();
                        }

                    }

                    break;
                case 2:
                    do {
                        preguntas = mostrar();
                        switch (preguntas) {
                            case 1:
                                System.out.println("NAME" + "\t" + "SEX" + "\t" + "AGE" + "\t" + "HEIGHT" + "\t" + "EMAIL");
                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        System.out.print(nombre[i][j] + "\t");
                                        System.out.print(sexo[i][j] + "\t");
                                        System.out.print(edad[i][j] + "\t");
                                        System.out.print(estatura[i][j] + "\t");
                                        System.out.print(correo[i][j] + "\t");
                                        System.out.println("");
                                    }

                                }
                                break;
                            case 2:
                                int filtro0;
                                System.out.println("AGE: ");
                                filtro0 = scnTeclado.nextInt();
                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        if (edad[i][j] == filtro0) {
                                            System.out.println(nombre[i][j] + "\t" + sexo[i][j] + "\t" + edad[i][j] + "\t" + estatura[i][j] + "\t" + correo[i][j] + "\t");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                int filtro1;
                                System.out.println("SEX: ");
                                filtro1 = scnTeclado.nextInt();

                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        if (sexo[i][j] == filtro1) {
                                            System.out.println(nombre[i][j] + "\t" + sexo[i][j] + "\t" + edad[i][j] + "\t" + estatura[i][j] + "\t" + correo[i][j] + "\t");
                                        }
                                    }
                                }
                                break;
                        }
                    } while (preguntas != 0);
                    break;
            }
            if (pvmatriz == 0) {
                break;
            }
        } while (pvmatriz != 0);
    }
    
    //Matriz 3 Frances
    
    public static void ffmuestramatriz3() {
        int preguntas = 0;
        int pvmatriz = 0;
        int aux = 0;
        String nombre[][];
        int sexo[][];
        String estatura[][];
        String correo[][];
        int edad[][];
        nombre = new String[5][10];
        sexo = new int[5][10];
        estatura = new String[5][10];
        correo = new String[5][10];
        edad = new int[5][10];
        Scanner scnTeclado = new Scanner(System.in);
        do {
            System.out.println("\tMatrice en francais\n");
            System.out.println("On va commencer\n");
            System.out.println("1 Saisir des informations");
            System.out.println("2 Montrer I'information");
            System.out.println("0 Sortir");
            System.out.println("Option: ");
            pvmatriz = scnTeclado.nextInt();
            switch (pvmatriz) {
                //CONDICIONAL
                case 1:
                    for (int i = 0; i < edad.length; i++) {
                        for (int j = 0; j < 2; j++) {
                            aux++; //contador
                            System.out.println("Persona " + aux); //imprimir el contador del numero de persona

                            //preguntas            
                            System.out.println("Donne-moi ton nom: ");
                            nombre[i][j] = scnTeclado.next();
                            do {
                                System.out.println("Donne moi ton sexe(1 si c'est un homme et 2 si c'est une femme): ");
                                sexo[i][j] = scnTeclado.nextInt();
                            } while (sexo[i][j] < 0 || sexo[i][j] > 2);

                            System.out.println("Donne moi ta taille: ");
                            estatura[i][j] = scnTeclado.next();
                            System.out.println("Donne moi ton age: ");
                            edad[i][j] = scnTeclado.nextInt();
                            System.out.println("Donne moi ton adresse mail: ");
                            correo[i][j] = scnTeclado.next();
                        }

                    }

                    break;
                case 2:
                    do {
                        preguntas = mostrar();
                        switch (preguntas) {
                            case 1:
                                System.out.println("NOM" + "\t" + "SEXE" + "\t" + "AGE" + "\t" + "LA TAILLE" + "\t" + "COURRIER ELECTRONIQUE");
                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        System.out.print(nombre[i][j] + "\t");
                                        System.out.print(sexo[i][j] + "\t");
                                        System.out.print(edad[i][j] + "\t");
                                        System.out.print(estatura[i][j] + "\t");
                                        System.out.print(correo[i][j] + "\t");
                                        System.out.println("");
                                    }

                                }
                                break;
                            case 2:
                                int filtro0;
                                System.out.println("AGE: ");
                                filtro0 = scnTeclado.nextInt();
                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        if (edad[i][j] == filtro0) {
                                            System.out.println(nombre[i][j] + "\t" + sexo[i][j] + "\t" + edad[i][j] + "\t" + estatura[i][j] + "\t" + correo[i][j] + "\t");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                int filtro1;
                                System.out.println("GENERAL: ");
                                filtro1 = scnTeclado.nextInt();

                                for (int i = 0; i < edad.length; i++) {
                                    for (int j = 0; j < 2; j++) {
                                        if (sexo[i][j] == filtro1) {
                                            System.out.println(nombre[i][j] + "\t" + sexo[i][j] + "\t" + edad[i][j] + "\t" + estatura[i][j] + "\t" + correo[i][j] + "\t");
                                        }
                                    }
                                }
                                break;
                        }
                    } while (preguntas != 0);
                    break;
            }
            if (pvmatriz == 0) {
                break;
            }
        } while (pvmatriz != 0);
    }

}
