package balachonov.archiveserver.repositories;

import balachonov.archiveserver.entities.PersonArchive;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonArchiveRepository extends JpaRepository<PersonArchive, UUID> {
}