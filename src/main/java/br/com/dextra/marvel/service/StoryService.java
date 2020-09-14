package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.StoryDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StoryService {
    Page<StoryDTO> findAllByCharacter(Long idCharacter, Pageable pageable);
}
