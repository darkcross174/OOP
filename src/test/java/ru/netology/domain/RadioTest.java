package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();



    @Test
    public void shouldNextChannel() {
        int currentChannel = 9;
        radio.setCurrentChannel(currentChannel);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldNextChannel1() {
        int currentChannel = 5;
        radio.setCurrentChannel(currentChannel);
        radio.nextChannel();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void shouldPrevChannel() {
        int currentChannel = 0;
        radio.setCurrentChannel(currentChannel);
        radio.prevChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void shouldPrevChannel1() {
        int currentChannel = 5;
        radio.setCurrentChannel(currentChannel);
        radio.prevChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void shouldInputNumberChannel() {
        int numberChannel = 7;
        int currentChannel = 2;
        radio.setCurrentChannel(currentChannel);
        radio.inputNumberChannel(numberChannel);
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    public void shouldInputNumberChannel1() {
        int numberChannel = 10;
        int currentChannel = 2;
        radio.setCurrentChannel(currentChannel);
        radio.inputNumberChannel(numberChannel);
        assertEquals(2, radio.getCurrentChannel());
    }

    @Test
    public void shouldInputNumberChannel2() {
        int numberChannel = -1;
        int currentChannel = 2;
        radio.setCurrentChannel(currentChannel);
        radio.inputNumberChannel(numberChannel);
        assertEquals(2, radio.getCurrentChannel());
    }

    @Test
    public void shouldUpVolume() {
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.upVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpVolume1() {
        int currentVolume = 1;
        radio.setCurrentVolume(currentVolume);
        radio.upVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume() {
        int currentVolume = 5;
        radio.setCurrentVolume(currentVolume);
        radio.downVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume1() {
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


}







