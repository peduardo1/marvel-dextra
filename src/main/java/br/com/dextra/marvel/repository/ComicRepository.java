package br.com.dextra.marvel.repository;

import br.com.dextra.marvel.domain.Comic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepository extends JpaRepository<Comic,Long> {

    @Query(value="SELECT * FROM COMIC CO " +
                  "JOIN CHARACTER_COMICS CC ON (CO.ID = CC.COMIC_ID) " +
                  "JOIN CHARACTER C ON (CC.CHARACTER_ID = C.ID) " +
                  "WHERE C.ID = ?1", nativeQuery = true)
    Page<Comic> findAllByCharacter(Long idCharacter, Pageable pageable);
}
