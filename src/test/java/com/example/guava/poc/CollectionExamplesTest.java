package com.example.guava.poc;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multiset;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectionExamplesTest {

    private final CollectionExamples collectionExamples = new CollectionExamples();

    @Test
    public void testCreateImmutableList() {
        ImmutableList<String> expected = ImmutableList.of("a", "b", "c");
        assertEquals(expected, collectionExamples.createImmutableList("a", "b", "c"));
    }

    @Test
    public void testCreateMultiset() {
        Multiset<String> multiset = collectionExamples.createMultiset("a", "b", "a", "c", "b", "a");
        assertEquals(3, multiset.count("a"));
        assertEquals(2, multiset.count("b"));
        assertEquals(1, multiset.count("c"));
    }
}
