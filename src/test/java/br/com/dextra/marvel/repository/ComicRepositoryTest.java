package br.com.dextra.marvel.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ComicRepositoryTest {

    @Autowired private ComicRepository comicRepository;

    @Test
    void injectedComponentAreNotNull(){
        assertThat(comicRepository).isNotNull();
    }

    @Test
    void queryIsValid(){

       // assertThat(comicRepository.findAllByCharacter()).isNotEmpty();
    }
}
