package br.com.dextra.marvel.service.impl;

import br.com.dextra.marvel.repository.ComicRepository;
import br.com.dextra.marvel.service.ComicService;
import br.com.dextra.marvel.service.dto.ComicDTO;
import br.com.dextra.marvel.service.mapper.ComicMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComicServiceImpl implements ComicService {

    private final ComicRepository comicRepository;
    private final ComicMapper comicMapper;

    @Override
    public Page<ComicDTO> findAllByCharacter(Long idCharacter, Pageable pageable) {

        Page<ComicDTO> comics = comicRepository.findAllByCharacter(idCharacter, pageable)
                                               .map(comicMapper::toDto);

        return comics;
    }
}
