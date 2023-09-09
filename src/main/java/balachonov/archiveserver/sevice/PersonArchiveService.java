package balachonov.archiveserver.sevice;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;
import balachonov.archiveserver.entities.PersonArchive;
import org.springframework.data.domain.Page;

public interface PersonArchiveService {

    void savePersonArchive(PersonArchiveRequest personArchiveRequest);

    Page<PersonArchive> getPersons(int PageNumber, int PageSize, String sort);
}