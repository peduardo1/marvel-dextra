package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.EventDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EventService {
    Page<EventDTO> findAllByCharacter(Long idCharacter, Pageable pageable);
}
