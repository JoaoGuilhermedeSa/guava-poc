package com.example.guava.poc;

import com.google.common.collect.BiMap;
import com.google.common.collect.Multimap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionExamplesTest {

    private final CollectionExamples collectionExamples = new CollectionExamples();

    @Test
    void testCreateImmutableList() {
        assertEquals(3, collectionExamples.createImmutableList("a", "b", "c").size());
    }

    @Test
    void testCreateMultiset() {
        assertEquals(3, collectionExamples.createMultiset("a", "b", "a", "c", "b", "a").count("a"));
    }

    @Test
    void testCreateMultimap() {
        Multimap<String, String> multimap = collectionExamples.createMultimap();
        assertEquals(2, multimap.get("key1").size());
        assertEquals(1, multimap.get("key2").size());
    }

    @Test
    void testCreateBiMap() {
        BiMap<String, String> biMap = collectionExamples.createBiMap();
        assertEquals("value1", biMap.get("key1"));
        assertEquals("key2", biMap.inverse().get("value2"));
    }
}