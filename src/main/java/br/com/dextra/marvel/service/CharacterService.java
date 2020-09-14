package br.com.dextra.marvel.service;

import br.com.dextra.marvel.domain.Character;
import br.com.dextra.marvel.service.dto.CharacterDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CharacterService {
    Page<CharacterDTO> findAll(Pageable pageable);
    CharacterDTO findById(Long id);
}
