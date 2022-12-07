package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 *
 * @author Vladimir Domalega and Daria Sorokovih
 *
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Max_min Main = new Max_min();

        assertEquals(Main.Max(2, 3), 3);
        assertEquals(Main.Max(10, 20), 20);
        assertEquals(Main.Max(20, 10), 20);
        assertEquals(Main.Max(100, 3), 100);

        assertEquals(Main.Min(2, 3), 2);
        assertEquals(Main.Min(10, 20), 10);
        assertEquals(Main.Min(20, 10), 10);
        assertEquals(Main.Min(100, 3), 3);
    }
}