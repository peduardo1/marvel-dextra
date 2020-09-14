package br.com.dextra.marvel.repository;

import br.com.dextra.marvel.domain.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character,Long> {

    @Query(value="SELECT * FROM CHARACTER c where c.id = ?1", nativeQuery = true)
    Character findOne(Long id);
}
