package com.ironhack.w1.day3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 100);
        Movie elSeñordeLosAnillos = new Movie("El señor de los anillos", 200);
//        Movie newMovie = movieCreator("Star Wars", 120);

        System.out.println("Title: " + harryPotter.getTitle() + " Duration: " + harryPotter.getDuration());
        System.out.println("Title: " + elSeñordeLosAnillos.getTitle() + " Duration: " + elSeñordeLosAnillos.getDuration());
        System.out.println("Harry Potter: " + harryPotter);
        harryPotter.play();
        elSeñordeLosAnillos.play();
        Movie.getAlert();

        HorrorMovie scream = new HorrorMovie("Scream", 130, false);
        System.out.println(scream.getTitle() + " " + scream.isReallyScary());
    }

//    public static Movie movieCreator(String title, int duration) {
//        return new Movie (title, duration);
//    }
}
