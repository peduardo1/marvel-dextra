package br.com.dextra.marvel.service.impl;

import br.com.dextra.marvel.domain.Character;
import br.com.dextra.marvel.repository.CharacterRepository;
import br.com.dextra.marvel.service.CharacterService;
import br.com.dextra.marvel.service.dto.CharacterDTO;
import br.com.dextra.marvel.service.mapper.CharacterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;


    @Override
    public Page<CharacterDTO> findAll(Pageable pageable) {
        Page<CharacterDTO> characters = characterRepository.findAll(pageable)
                                            .map(characterMapper::toDto);

        return characters;
    }

    @Override
    public CharacterDTO findById(Long id) {
        Character character = characterRepository.findOne(id);

        return characterMapper.toDto(character);
    }
}
