package balachonov.archiveserver.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

import static balachonov.archiveserver.util.Constants.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = PERSONS_ARCHIVE)
public class PersonArchive {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = PERSON_ID,
            updatable = false)
    private UUID id;

    @Column(name = FIRST_NAME,
            nullable = false,
            length = 50)
    private String firstName;

    @Column(name = LAST_NAME,
            nullable = false,
            length = 50)
    private String lastName;

    @Column(name = EMAIL,
            nullable = false)
    private String email;

    @Column(name = TELEPHONE,
            nullable = false)
    private String telephone;

    @Column(name = DELETED_DATE,
            nullable = false)
    private LocalDate deleted_date;
}