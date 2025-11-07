package com.example.guava.poc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PreconditionExamplesTest {

    private final PreconditionExamples preconditionExamples = new PreconditionExamples();

    @Test
    void testCheckArgument() {
        assertThrows(IllegalArgumentException.class, () -> {
            preconditionExamples.checkArgumentAndThrow(false);
        });
    }

    @Test
    void testCheckNotNull() {
        assertThrows(NullPointerException.class, () -> {
            preconditionExamples.checkNotNullAndThrow(null);
        });
    }
}