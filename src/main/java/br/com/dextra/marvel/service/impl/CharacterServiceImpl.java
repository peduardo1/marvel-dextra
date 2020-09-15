package br.com.dextra.marvel.service.impl;

import br.com.dextra.marvel.domain.Character;
import br.com.dextra.marvel.repository.CharacterRepository;
import br.com.dextra.marvel.service.CharacterService;
import br.com.dextra.marvel.service.dto.CharacterDTO;
import br.com.dextra.marvel.service.mapper.CharacterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private final CharacterRepository characterRepository;

    @Autowired
    private final CharacterMapper characterMapper;

    public CharacterServiceImpl(CharacterRepository characterRepository, CharacterMapper characterMapper) {
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;
    }

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
