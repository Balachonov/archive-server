package balachonov.archiveserver.controllers;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;
import balachonov.archiveserver.entities.PersonArchive;
import balachonov.archiveserver.sevice.PersonArchiveService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/archive")
public class PersonArchiveController {

    private final PersonArchiveService personArchiveService;

    @PostMapping(value = "/person")
    public void savePersonArchive(@Valid @RequestBody PersonArchiveRequest personArchiveRequest) {
        personArchiveService.savePersonArchive(personArchiveRequest);
    }

    @GetMapping(value = "/persons")
    public List<PersonArchive> getPersons(Pageable pageable) {
        return personArchiveService.getPersons(pageable);
    }
}