package agh.po.lab3;
import java.util.HashMap;
import java.util.Map;
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
    @Test
    public void mapAB_1() {
        Map<String, String> map = new HashMap<>(Map.of("a", "Hi", "b", "There"));
        Map<String, String> expected = Map.of("a", "Hi", "b", "There", "ab", "HiThere");
        assertEquals(expected, cb.mapAB(map));
    }

    @Test
    public void mapAB_2() {
        Map<String, String> map = new HashMap<>(Map.of("a", "Hi"));
        assertEquals(Map.of("a", "Hi"), cb.mapAB(map));
    }

    @Test
    public void mapAB_3() {
        Map<String, String> map = new HashMap<>(Map.of("b", "There"));
        assertEquals(Map.of("b", "There"), cb.mapAB(map));
    }
    @Test
    public void wordLen_1() {
        assertEquals(Map.of("a", 1, "bb", 2),
                cb.wordLen(new String[]{"a", "bb", "a", "bb"}));
    }

    @Test
    public void wordLen_2() {
        assertEquals(Map.of("this", 4, "and", 3, "that", 4),
                cb.wordLen(new String[]{"this", "and", "that", "and"}));
    }

    @Test
    public void wordLen_3() {
        assertEquals(Map.of("code", 4, "bug", 3),
                cb.wordLen(new String[]{"code", "code", "code", "bug"}));
    }

}