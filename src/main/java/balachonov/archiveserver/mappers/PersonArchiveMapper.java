package balachonov.archiveserver.mappers;

import balachonov.archiveserver.dto.requests.PersonArchiveRequest;
import balachonov.archiveserver.entities.PersonArchive;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Component
@Mapper(componentModel = SPRING,
        nullValuePropertyMappingStrategy = IGNORE)
public interface PersonArchiveMapper {
    PersonArchive mapToPersonArchive(PersonArchiveRequest personArchiveRequest);
}