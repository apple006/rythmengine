package org.rythmengine.cache;

import org.rythmengine.extension.ICacheService;

public class SimpleCacheServiceTest extends CacheServiceTestBase {
    @Override
    protected ICacheService cacheService() {
        return SimpleCacheService.INSTANCE;
    }
}
