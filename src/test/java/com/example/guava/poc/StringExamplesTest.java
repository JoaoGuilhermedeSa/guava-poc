package com.example.guava.poc;

import com.google.common.base.CharMatcher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringExamplesTest {

    private final StringExamples stringExamples = new StringExamples();

    @Test
    void testPadEnd() {
        assertEquals("12300", stringExamples.padEnd("123", 5, '0'));
    }

    @Test
    void testRetainFrom() {
        assertEquals("123456", stringExamples.retainFrom("abc123xyz456", CharMatcher.inRange('0', '9')));
    }

    @Test
    void testSplit() {
        assertEquals("[a, b, c, d]", stringExamples.split("a, b,, c,  d").toString());
    }
}