package ru.netology;

public class RadioAdvanced {

    private String name;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume+1) {
            return;
        }
        if (currentVolume < minVolume-1) {
            return;
        }

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
