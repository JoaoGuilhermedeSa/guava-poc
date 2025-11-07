package com.example.guava.poc;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class PreconditionExamples {

    public void checkArgumentAndThrow(boolean expression) {
        checkArgument(expression);
    }

    public void checkNotNullAndThrow(Object reference) {
        checkNotNull(reference);
    }
}