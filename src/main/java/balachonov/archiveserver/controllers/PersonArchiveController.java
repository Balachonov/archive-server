package balachonov.archiveserver.controllers;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;
import balachonov.archiveserver.entities.PersonArchive;
import balachonov.archiveserver.sevice.PersonArchiveService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
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

    @GetMapping(value = "/persons/{pageNumber}/{pageSize}")
    public List<PersonArchive> getPersons(@PathVariable Integer pageNumber,
                                          @PathVariable Integer pageSize) {
        Page<PersonArchive> data = personArchiveService.getPersons(pageNumber, pageSize, null);
        return data.getContent();
    }

    @GetMapping(value = "/persons/{pageNumber}/{pageSize}/{sort}")
    public List<PersonArchive> getPersons(@PathVariable Integer pageNumber,
                                          @PathVariable Integer pageSize,
                                          @PathVariable String sort) {
        Page<PersonArchive> data = personArchiveService.getPersons(pageNumber, pageSize, sort);
        return data.getContent();
    }
}