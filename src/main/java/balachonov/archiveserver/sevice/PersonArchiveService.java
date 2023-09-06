package balachonov.archiveserver.sevice;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;

public interface PersonArchiveService {

    void savePersonArchive(PersonArchiveRequest personArchiveRequest);
}