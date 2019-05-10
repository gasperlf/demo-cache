package lf.com.ontopsolution.democache.resources;

import lf.com.ontopsolution.democache.resources.dtos.Version;
import lf.com.ontopsolution.democache.services.VersionService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionResource {

    private final VersionService versionService;

    VersionResource(VersionService versionService){
        this.versionService = versionService;
    }

    @GetMapping(path = "/version", produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
    public ResponseEntity<Version> getVersion(){
        return ResponseEntity.ok(versionService.getVersion());
    }
}
