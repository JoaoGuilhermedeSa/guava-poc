package com.example.guava.poc;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

public class CollectionExamples {

    public ImmutableList<String> createImmutableList(String... elements) {
        return ImmutableList.copyOf(elements);
    }

    public Multiset<String> createMultiset(String... elements) {
        return HashMultiset.create(java.util.Arrays.asList(elements));
    }

    public Multimap<String, String> createMultimap() {
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("key1", "value1");
        multimap.put("key1", "value2");
        multimap.put("key2", "value3");
        return multimap;
    }

    public BiMap<String, String> createBiMap() {
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("key1", "value1");
        biMap.put("key2", "value2");
        return biMap;
    }
}