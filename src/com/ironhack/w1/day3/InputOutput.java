package com.ironhack.w1.day3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) throws IOException {

//        INPUT / OUTPUT

//        System.out.println("Prueba de salida normal por consola");
//        System.err.println("Prueba de salida de error por consola");

        Scanner scanner = new Scanner(System.in);

        String name;

        do {
            System.out.println("Please write your name");
            name = scanner.nextLine();
        } while (name.length() < 3);

        System.out.println("Your name is: " + name);
//        System.out.println("Please write your age");
//        if (scanner.nextLine().length() > 0) {
//            do {
//                System.out.println("Esto no es lo que esperaba");
//                System.out.println("Please write your age");
//                scanner.nextLine();
//            } while (scanner.nextLine().length() > 0);
//        } else {
//            int age = Integer.parseInt(scanner.nextLine());
//            System.out.println("Your age is: " + age);
//        }

        scanner.close();


//        FILE HANDLING

        String filePath = "src/com/ironhack/w1/day3/fichero.txt";

        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya existía");
        }

        FileWriter fileWriter = new FileWriter(filePath, true);
        fileWriter.write("Esto es una línea\n");
//        \n es el símbolo del salto de línea.
        fileWriter.write("Esto es otra línea\n");
        fileWriter.close();

        Scanner fileScanner = new Scanner(file);
        String str = "";

        while (fileScanner.hasNextLine()) {
            str += fileScanner.nextLine() + "\n";
            System.out.println(str);
        }
        fileScanner.close();

    }
}
