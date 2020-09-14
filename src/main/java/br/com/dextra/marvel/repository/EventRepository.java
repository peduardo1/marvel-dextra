package br.com.dextra.marvel.repository;

import br.com.dextra.marvel.domain.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

    @Query(value="SELECT * FROM EVENT E " +
            "JOIN CHARACTER_EVENT CE (E.ID = CE.EVENT_ID) " +
            "JOIN CHARACTER C ON (CE.CHARACTER_ID = C.ID " +
            "WHERE C.ID = ?1", nativeQuery = true)
    Page<Event> findAllByCharacter(Long idCharacter, Pageable pageable);
}
