package com.example.guava.poc;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multiset;

public class CollectionExamples {

    public ImmutableList<String> createImmutableList(String... elements) {
        return ImmutableList.copyOf(elements);
    }

    public Multiset<String> createMultiset(String... elements) {
        return HashMultiset.create(java.util.Arrays.asList(elements));
    }
}
