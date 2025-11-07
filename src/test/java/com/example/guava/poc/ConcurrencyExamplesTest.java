package com.example.guava.poc;

import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.RateLimiter;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcurrencyExamplesTest {

    private final ConcurrencyExamples concurrencyExamples = new ConcurrencyExamples();

    @Test
    void testCreateCache() throws ExecutionException {
        LoadingCache<String, String> cache = concurrencyExamples.createCache();
        assertNotNull(cache);
        assertEquals("Value for key1", concurrencyExamples.getValueFromCache(cache, "key1"));
    }

    @Test
    void testCreateRateLimiter() {
        RateLimiter rateLimiter = concurrencyExamples.createRateLimiter();
        assertNotNull(rateLimiter);
        assertTrue(concurrencyExamples.tryAcquire(rateLimiter));
    }
}
