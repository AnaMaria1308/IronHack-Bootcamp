package com.ironhack.w1.day4;

public interface IPlayable {
    public abstract void play();
    void pause();
    void mute();
    void increaseVolume();

//    Está claro que es una constante porque en las interfaces no pueden haber variables.

    final double MAX_VOLUME = 1;


}
