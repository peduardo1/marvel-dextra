package br.com.dextra.marvel.service;

import br.com.dextra.marvel.domain.Character;
import br.com.dextra.marvel.repository.CharacterRepository;
import br.com.dextra.marvel.service.dto.CharacterDTO;
import br.com.dextra.marvel.service.impl.CharacterServiceImpl;
import br.com.dextra.marvel.service.mapper.CharacterMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CharacterServiceTest {
    @Mock
    CharacterRepository characterRepository;

    @Mock
    CharacterMapper characterMapper;

    @Autowired
    CharacterServiceImpl characterService;

    CharacterDTO characterDTO;

    @Before
    public void init(){
        characterDTO = createTestCharacter();

        when(characterService.findById(1l)).thenReturn(characterDTO);
    }

    @Test
    public void checkIfCharacterExists(){
        CharacterDTO characterDTO = createTestCharacter();
        //characterFound = characterRepository.findOne(1l);
       // CharacterDTO characterDTO = characterMapper.toDto(characterFound);
        System.out.println(characterDTO);

        CharacterDTO character = characterService.findById(1l);
        character.setComics(new ArrayList<>());
        character.setEvents(new ArrayList<>());
        character.setStories(new ArrayList<>());
        character.setSeries(new ArrayList<>());

        System.out.println(character);
        System.out.println(assertThat(character).isEqualTo(characterDTO));
    }

    private CharacterDTO createTestCharacter(){
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setId(1l);
        characterDTO.setName("Homem Aranha");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        characterDTO.setModified(year+"-0"+(month+1)+"-"+day+"T00:00:00.000-03:00");
        characterDTO.setComics(new ArrayList<>());
        characterDTO.setEvents(new ArrayList<>());
        characterDTO.setStories(new ArrayList<>());
        characterDTO.setSeries(new ArrayList<>());
        return characterDTO;
    }
}
