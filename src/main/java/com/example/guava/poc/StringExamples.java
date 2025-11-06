package com.example.guava.poc;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;

public class StringExamples {

    public String padEnd(String originalString, int minLength, char padChar) {
        return Strings.padEnd(originalString, minLength, padChar);
    }

    public String retainFrom(String input, CharMatcher charMatcher) {
        return charMatcher.retainFrom(input);
    }

    public Iterable<String> split(String toSplit) {
        return Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split(toSplit);
    }
}
