package br.com.dextra.marvel.repository;

import br.com.dextra.marvel.domain.Event;
import br.com.dextra.marvel.domain.Series;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends JpaRepository<Series,Long> {

    @Query(value="SELECT * FROM SERIES S " +
            "JOIN CHARACTER_SERIES CS (S.ID = CS.SERIES_ID) " +
            "JOIN CHARACTER C ON (CS.CHARACTER_ID = C.ID " +
            "WHERE C.ID = ?1", nativeQuery = true)
    Page<Series> findAllByCharacter(Long idCharacter, Pageable pageable);
}
