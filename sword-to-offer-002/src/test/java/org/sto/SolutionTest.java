package org.sto;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addBinary() {
        Solution soulution = new Solution();

        assertEquals("100", soulution.addBinary("11", "1"));
        assertEquals("10101", soulution.addBinary("1010", "1011"));

    }

    @Test
    void addTooLongBinary() {
        Solution soulution = new Solution();

        assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                soulution.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}