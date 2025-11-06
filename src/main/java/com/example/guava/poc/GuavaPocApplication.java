package com.example.guava.poc;

import com.google.common.collect.ImmutableList;
import com.google.common.base.Strings;

public class GuavaPocApplication {

    public static void main(String[] args) {
        StringExamples stringExamples = new StringExamples();
        CollectionExamples collectionExamples = new CollectionExamples();

        // Example of using ImmutableList
        ImmutableList<String> immutableList = collectionExamples.createImmutableList("a", "b", "c");
        System.out.println("ImmutableList: " + immutableList);

        // Example of using Strings.isNullOrEmpty
        String str1 = null;
        String str2 = "";
        String str3 = "hello";
        System.out.println("Strings.isNullOrEmpty(str1): " + com.google.common.base.Strings.isNullOrEmpty(str1));
        System.out.println("Strings.isNullOrEmpty(str2): " + com.google.common.base.Strings.isNullOrEmpty(str2));
        System.out.println("Strings.isNullOrEmpty(str3): " + com.google.common.base.Strings.isNullOrEmpty(str3));

        // Example of using Strings.padEnd
        String originalString = "123";
        String paddedString = stringExamples.padEnd(originalString, 5, '0');
        System.out.println("Padded string: " + paddedString);

        // Example of using CharMatcher
        String stringWithLettersAndNumbers = "abc123xyz456";
        String digitsOnly = stringExamples.retainFrom(stringWithLettersAndNumbers, com.google.common.base.CharMatcher.inRange('0', '9'));
        System.out.println("Digits only: " + digitsOnly);

        // Example of using Splitter
        String toSplit = "a, b,, c,  d";
        Iterable<String> split = stringExamples.split(toSplit);
        System.out.println("Split string: " + split);

        // Example of using Multiset
        com.google.common.collect.Multiset<String> multiset = collectionExamples.createMultiset("a", "b", "a", "c", "b", "a");
        System.out.println("Multiset count of 'a': " + multiset.count("a"));
        System.out.println("Multiset: " + multiset);
    }
}
