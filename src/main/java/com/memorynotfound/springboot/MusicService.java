

package com.memorynotfound.springboot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
@CacheConfig(cacheNames = "instruments")
public class MusicService {

    private static Logger log = LoggerFactory.getLogger(MusicService.class);

    @CacheEvict(allEntries = true)
    public void clearCache() {
    }

    @Cacheable(condition = "#instrument.equals('trombone')")
    // @Cacheable(value = "", key = "")
    public String play(String instrument) {
        log.info("Ehcache branch test");
        log.info("Executing: " + this.getClass().getSimpleName() + ".play(\"" + instrument + "\");");

        log.info("Ehcache branch test for Akhilesh");
        log.info("Ehcache branch test for Akhilesh1");
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }
        return "paying " + instrument + "!";
    }

}
