package br.com.dextra.marvel.service;

import br.com.dextra.marvel.domain.Character;
import br.com.dextra.marvel.repository.CharacterRepository;
import br.com.dextra.marvel.service.dto.CharacterDTO;
import br.com.dextra.marvel.service.impl.CharacterServiceImpl;
import br.com.dextra.marvel.service.mapper.CharacterMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class CharacterServiceTest {
    @Mock
    CharacterRepository characterRepository;

    @Mock
    CharacterMapper characterMapper;


    @InjectMocks
    CharacterServiceImpl characterService;

    @Test
    public void checkIfCharacterExists(){
        CharacterDTO characterDTO = createTestCharacter();
        //characterFound = characterRepository.findOne(1l);
       // CharacterDTO characterDTO = characterMapper.toDto(characterFound);
        System.out.println(characterDTO);

        CharacterDTO character = characterService.findById(1l);
        System.out.println(character);
        System.out.println(assertThat(character).isSameAs(characterDTO));
    }

    private CharacterDTO createTestCharacter(){
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setId(1l);
        characterDTO.setName("Homem Aranha");
        characterDTO.setModified(Calendar.getInstance().toString());

        return characterDTO;
    }
}
