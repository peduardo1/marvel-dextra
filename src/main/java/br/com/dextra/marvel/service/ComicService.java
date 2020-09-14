package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.ComicDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ComicService {
    Page<ComicDTO> findAllByCharacter(Long idCharacter, Pageable pageable);
}
