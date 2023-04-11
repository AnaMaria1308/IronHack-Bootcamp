package com.ironhack.w1.day1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        DATA TYPES

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 999999;
        double myDouble = 10.1234;
        boolean isBoolean = true;
        char myChar = 100;

        String myString = "Hola Ironhack!";
        String myName;
        myName = "Adrián";

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("isBoolean: " + isBoolean);
        System.out.println("myChar: " + myChar);
        System.out.println("myString: " + myString);

        myInt = 1234;



        //Conditionals

        int number = 101;

        if (number >= 1000) {
            System.out.println("Number es mayor o igual que 1000");
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        double mark = 5;
        boolean hasPassed = mark >= 5 ? true : false;

        System.out.println(hasPassed);

        myMethod();

        System.out.println(getInfo(4));

        stringMethods();

        //    WRAPPERS

        Integer myInteger = 100;

        System.out.println(myInteger.equals(1000));

        System.out.println(productFormatter("   La cómoda de color blanco   ", "22022023"));

    }


    // METHODS

    public static void myMethod() {
        System.out.println("this ");
        System.out.println("is ");
        System.out.println("inside ");
        System.out.println("myMethod ");
    }

    public static String getInfo(int option) {
        if (option == 1) return "My name is Adrián";
        else if (option == 2) return "This is an Ironhack bootcamp";
        else return "Option " + option + " provides no info";
    }

    // STRING METHODS

    public static void stringMethods() {
        String address = "C/ falsa nº 123";

        System.out.println("address length: " + address.length());
        System.out.println(address.toUpperCase());

        System.out.println(address.toUpperCase().replace("A", "-"));

        String address2 = "Gran vía, 27";

        if (address.equals(address2)) System.out.println("It's the same street");
        else System.out.println("They are different streets");
    }

//    EJERCICIOS
//    Create a method named productFormatter that receives a String name productName and a String date as parameters.
//    This method should return the productName trimmed, change spaces by _ and append the date at the end of the string.
//    The result must be given in uppercase.

    public static String productFormatter(String productName, String date) {
        return productName.trim().replace(" ", "_").concat(" ").concat(date).toUpperCase();
    }





}