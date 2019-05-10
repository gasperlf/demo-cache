package lf.com.ontopsolution.democache.services.impl;

import lf.com.ontopsolution.democache.resources.dtos.Version;
import lf.com.ontopsolution.democache.services.VersionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class VersionServiceImpl implements VersionService {

    @Cacheable(cacheNames = "versions")
    public Version getVersion(){
        log.info("Call versions");
        Version version = Version.builder().version("1.0.0").build();
        log.info("Call versions");
        return  version;
    }
}
