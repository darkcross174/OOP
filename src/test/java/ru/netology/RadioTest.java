package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldCreate() {
        Radio RadioVolume = new Radio();

    }

    @Test
    public void shouldInitFieldToZeroValues() {
        Radio RadioVolume = new Radio();
        assertNull(RadioVolume.name);
        assertEquals(10, RadioVolume.maxVolume);
        assertEquals(0, RadioVolume.minVolume);
        assertEquals(0, RadioVolume.currentVolume);
        assertFalse(RadioVolume.on);
    }
}










