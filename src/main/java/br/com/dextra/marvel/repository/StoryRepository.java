package br.com.dextra.marvel.repository;

import br.com.dextra.marvel.domain.Series;
import br.com.dextra.marvel.domain.Story;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story,Long> {

    @Query(value="SELECT * FROM STORY S " +
            "JOIN CHARACTER_STORIES CS ON (S.ID = CS.STORY_ID) " +
            "JOIN CHARACTER C ON (CS.CHARACTER_ID = C.ID) " +
            "WHERE C.ID = ?1", nativeQuery = true)
    Page<Story> findAllByCharacter(Long idCharacter, Pageable pageable);
}
