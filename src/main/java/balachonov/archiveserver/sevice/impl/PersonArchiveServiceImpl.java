package balachonov.archiveserver.sevice.impl;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;
import balachonov.archiveserver.entities.PersonArchive;
import balachonov.archiveserver.mappers.PersonArchiveMapper;
import balachonov.archiveserver.repositories.PersonArchiveRepository;
import balachonov.archiveserver.sevice.PersonArchiveService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

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

    @Override
    public Page<PersonArchive> getPersons(int pageNumber, int pageSize, String sort) {
        Pageable pageable = sort != null ? PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC, sort)
                : PageRequest.of(pageNumber, pageSize);
        List<PersonArchive> persons = personArchiveRepository.findAll();
        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), persons.size());
        List<PersonArchive> pageContent = persons.subList(start, end);
        return new PageImpl<>(pageContent, pageable, persons.size());
    }
}