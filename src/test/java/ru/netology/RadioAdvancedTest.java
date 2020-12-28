package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioAdvancedTest {

    @Test
    public void shouldGetandSet() {
        RadioAdvanced Radio = new RadioAdvanced();
        String expectedName = "Радио";

        assertNull(Radio.getName());
        Radio.setName(expectedName);
        assertEquals(expectedName, Radio.getName());
    }

    @Test
    public void shoulCheckChangeVolume() {
        RadioAdvanced Radio = new RadioAdvanced();
        String expectedName = "Радио";

        assertEquals(0, Radio.getCurrentVolume());
        Radio.setCurrentVolume(-10);
        assertEquals(0, Radio.getCurrentVolume());
    }
}
