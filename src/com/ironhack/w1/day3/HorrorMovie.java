package com.ironhack.w1.day3;

public class HorrorMovie extends Movie{

    private boolean isReallyScary;

    public HorrorMovie(String title, int duration, boolean isReallyScary) {
        super(title, duration);
        this.isReallyScary = isReallyScary;
    }

    public boolean isReallyScary() {
        return isReallyScary;
    }

    public void setReallyScary(boolean reallyScary) {
        isReallyScary = reallyScary;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
