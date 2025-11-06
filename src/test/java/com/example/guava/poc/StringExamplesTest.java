package com.example.guava.poc;

import com.google.common.base.CharMatcher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringExamplesTest {

    private final StringExamples stringExamples = new StringExamples();

    @Test
    public void testPadEnd() {
        assertEquals("12300", stringExamples.padEnd("123", 5, '0'));
    }

    @Test
    public void testRetainFrom() {
        assertEquals("123456", stringExamples.retainFrom("abc123xyz456", CharMatcher.inRange('0', '9')));
    }

    @Test
    public void testSplit() {
        assertEquals("[a, b, c, d]", stringExamples.split("a, b,, c,  d").toString());
    }
}
