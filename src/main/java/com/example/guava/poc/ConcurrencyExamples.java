package com.example.guava.poc;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ConcurrencyExamples {

    public LoadingCache<String, String> createCache() {
        return CacheBuilder.newBuilder()
                .maximumSize(100)
                .expireAfterAccess(1, TimeUnit.MINUTES)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) {
                        return "Value for " + key;
                    }
                });
    }

    public String getValueFromCache(LoadingCache<String, String> cache, String key) throws ExecutionException {
        return cache.get(key);
    }

    public RateLimiter createRateLimiter() {
        return RateLimiter.create(1.0);
    }

    public boolean tryAcquire(RateLimiter rateLimiter) {
        return rateLimiter.tryAcquire();
    }
}
