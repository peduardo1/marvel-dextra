package br.com.dextra.marvel.service.impl;

import br.com.dextra.marvel.repository.EventRepository;
import br.com.dextra.marvel.service.EventService;
import br.com.dextra.marvel.service.dto.ComicDTO;
import br.com.dextra.marvel.service.dto.EventDTO;
import br.com.dextra.marvel.service.mapper.EventMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Override
    public Page<EventDTO> findAllByCharacter(Long idCharacter, Pageable pageable) {
        Page<EventDTO> events = eventRepository.findAllByCharacter(idCharacter, pageable)
                                               .map(eventMapper::toDto);

        return events;
    }
}
