package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void shouldNextChannel2() {
        int currentChannel = 15;
        radio.setCurrentChannel(currentChannel);
        radio.prevChannel();
        assertEquals(10, radio.getCurrentChannel());
    }

    @Test
    public void shouldPrevChannel3() {
        int currentChannel = -16;
        radio.setCurrentChannel(currentChannel);
        radio.prevChannel();
        assertEquals(10, radio.getCurrentChannel());
    }

    @Test
    public void shouldNextChannel() {
        int currentChannel = 6;
        radio.setCurrentChannel(currentChannel);
        radio.nextChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

    @Test
    public void shouldNextChannel1() {
        int currentChannel = 10;
        radio.setCurrentChannel(currentChannel);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldPrevChannel() {
        int currentChannel = 7;
        radio.setCurrentChannel(currentChannel);
        radio.prevChannel();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void shouldPrevChannel1() {
        int currentChannel = 0;
        radio.setCurrentChannel(currentChannel);
        radio.prevChannel();
        assertEquals(10, radio.getCurrentChannel());
    }

    @Test
    public void shouldInputNumberChannel() {
        int numberChannel = 10;
        int currentChannel = 1;
        radio.setCurrentChannel(currentChannel);
        radio.inputNumberChannel(numberChannel);
        assertEquals(10, radio.getCurrentChannel());

    }

    @Test
    public void shouldInputNumberChannel1() {
        int numberChannel = 15;
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

    //непонятно

    @Test
    public void shouldUpVolume() {
        int currentVolume = 100;
        radio.setCurrentVolume(currentVolume);
        radio.upVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpVolume3() {
        int currentVolume = 115;
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpVolume1() {
        int currentVolume = 54;
        radio.setCurrentVolume(currentVolume);
        radio.upVolume();
        assertEquals(55, radio.getCurrentVolume());
    }


    @Test
    public void shouldUpVolume2() {
        int currentVolume = -99;
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume2() {
        int currentVolume = -116;
        radio.setCurrentVolume(currentVolume);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume() {
        int currentVolume = 75;
        radio.setCurrentVolume(currentVolume);
        radio.downVolume();
        assertEquals(74, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume1() {
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }



}







