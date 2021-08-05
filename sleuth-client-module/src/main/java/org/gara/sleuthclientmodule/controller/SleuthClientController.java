package org.gara.sleuthclientmodule.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gara.sleuthclientmodule.client.SleuthServerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SleuthClientController {

    private final SleuthServerClient sleuthServerClient;

    @GetMapping
    public String getText() {
        log.info("Handling client");
        return sleuthServerClient.getText();
    }

}
