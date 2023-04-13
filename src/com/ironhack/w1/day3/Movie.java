package com.ironhack.w1.day3;

public class Movie {
    private String title;
    private int duration;

//    La palabra final hace que sea una constante y no una variable.
    public final boolean IS_GOOD = true;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Movie(String title) {
        this.title = title;
        this.duration = 90;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + this.title);
    }

//    EL MÉTODO STATIC HACE QUE NO SEA MODIFICABLE PARA VARIOS OBJETOS, SINO QUE TODOS SON EL MISMO.
//    NO HACE FALTA CREAR UN NUEVO OBJETO.
    public static void getAlert() {
        System.out.println("It's illegal to pirate this movie");
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
