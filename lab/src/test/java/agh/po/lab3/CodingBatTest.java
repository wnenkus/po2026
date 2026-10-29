package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    private final CodingBat cb = new CodingBat();

    @Test
    public void sleepIn() {
        assertFalse(cb.sleepIn(true, false));
        assertTrue(cb.sleepIn(false, false));
        assertTrue(cb.sleepIn(true, true));
    }

    @Test
    public void diff21() {
        assertEquals(2, cb.diff21(19));
        assertEquals(0, cb.diff21(21));
        assertEquals(8, cb.diff21(25));
    }

    @Test
    public void firstLast6() {
        assertTrue(cb.firstLast6(new int[]{1, 2, 6}));
        assertTrue(cb.firstLast6(new int[]{6, 1, 2, 3}));
        assertFalse(cb.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }

    @Test
    public void withoutEnd2() {
        assertEquals("ell", cb.withoutEnd2("Hello"));
        assertEquals("b", cb.withoutEnd2("abc"));
        assertEquals("", cb.withoutEnd2("ab"));
    }
}