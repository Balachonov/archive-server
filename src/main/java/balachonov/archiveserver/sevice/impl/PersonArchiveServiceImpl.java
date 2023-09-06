package balachonov.archiveserver.sevice.impl;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;
import balachonov.archiveserver.entities.PersonArchive;
import balachonov.archiveserver.mappers.PersonArchiveMapper;
import balachonov.archiveserver.repositories.PersonArchiveRepository;
import balachonov.archiveserver.sevice.PersonArchiveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class PersonArchiveServiceImpl implements PersonArchiveService {

    private final PersonArchiveRepository personArchiveRepository;
    private final PersonArchiveMapper personArchiveMapper;

    public void savePersonArchive(PersonArchiveRequest personArchiveRequest) {

        PersonArchive personArchive = personArchiveMapper.mapToPersonArchive(personArchiveRequest);
        personArchive.setDeleted_date(LocalDate.now());
        personArchiveRepository.save(personArchive);
    }
}