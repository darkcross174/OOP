package ru.netology.domain;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentVolume;
    private int currentChannel;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }


    public void nextChannel() {
        int currentChannel = this.getCurrentChannel();
        if (currentChannel == maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel++;
    }

    public void prevChannel() {
        int currentRadioStation = this.getCurrentChannel();
        if (currentChannel == minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        this.currentChannel--;
    }

    public void inputNumberChannel(int numberChannel) {
        if (numberChannel > maxChannel) {
            return;
        }
        if (numberChannel < minChannel) {
            return;
        }
        this.currentChannel = numberChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void upVolume() {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void downVolume() {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }

}




