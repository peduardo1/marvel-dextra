package br.com.dextra.marvel.service.impl;

import br.com.dextra.marvel.repository.StoryRepository;
import br.com.dextra.marvel.service.StoryService;
import br.com.dextra.marvel.service.dto.SeriesDTO;
import br.com.dextra.marvel.service.dto.StoryDTO;
import br.com.dextra.marvel.service.mapper.StoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoryServiceImpl implements StoryService {
    private final StoryRepository storyRepository;
    private final StoryMapper storyMapper;

    @Override
    public Page<StoryDTO> findAllByCharacter(Long idCharacter, Pageable pageable) {
        Page<StoryDTO> stories = storyRepository.findAllByCharacter(idCharacter, pageable)
                                                .map(storyMapper::toDto);
        return stories;
    }
}
