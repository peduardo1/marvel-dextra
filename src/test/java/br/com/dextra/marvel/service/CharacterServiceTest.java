package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.CharacterDTO;
import br.com.dextra.marvel.service.impl.CharacterServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CharacterServiceTest {
    @Autowired
    CharacterServiceImpl characterService;

    @Test
    public void checkIfCharacterExists(){
        CharacterDTO characterDTO = createTestCharacter();

        CharacterDTO character = characterService.findById(1l);
        character.setComics(new ArrayList<>());
        character.setEvents(new ArrayList<>());
        character.setStories(new ArrayList<>());
        character.setSeries(new ArrayList<>());

        assertThat(character).isEqualTo(characterDTO);
    }

    public CharacterDTO createTestCharacter(){
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setId(1l);
        characterDTO.setName("Homem Aranha");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        if(month < 10)
            characterDTO.setModified(year+"-0"+(month+1)+"-"+day+"T00:00:00.000-03:00");
        else
            characterDTO.setModified(year+"-"+(month+1)+"-"+day+"T00:00:00.000-03:00");

        characterDTO.setComics(new ArrayList<>());
        characterDTO.setEvents(new ArrayList<>());
        characterDTO.setStories(new ArrayList<>());
        characterDTO.setSeries(new ArrayList<>());
        return characterDTO;
    }
}
