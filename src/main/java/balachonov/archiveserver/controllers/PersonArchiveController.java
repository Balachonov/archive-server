package balachonov.archiveserver.controllers;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;
import balachonov.archiveserver.sevice.PersonArchiveService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/archive")
public class PersonArchiveController {

    private final PersonArchiveService personArchiveService;

    @PostMapping(value = "/person")
    public void savePersonArchive(@Valid @RequestBody PersonArchiveRequest personArchiveRequest) {

        personArchiveService.savePersonArchive(personArchiveRequest);
    }
}