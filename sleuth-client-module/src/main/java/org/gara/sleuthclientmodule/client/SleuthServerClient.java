package org.gara.sleuthclientmodule.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "sleuth-server", url = "http://localhost:8080")
public interface SleuthServerClient {

    @GetMapping
    String getText();

}
