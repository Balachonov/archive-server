package balachonov.archiveserver.sevice;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;
import balachonov.archiveserver.entities.PersonArchive;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonArchiveService {

    void savePersonArchive(PersonArchiveRequest personArchiveRequest);

    List<PersonArchive> getPersons(Pageable pageable);
}