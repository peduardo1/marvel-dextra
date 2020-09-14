package br.com.dextra.marvel.service.impl;

import br.com.dextra.marvel.repository.SeriesRepository;
import br.com.dextra.marvel.service.SeriesService;
import br.com.dextra.marvel.service.dto.SeriesDTO;
import br.com.dextra.marvel.service.mapper.SeriesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeriesServiceImpl implements SeriesService {
    private final SeriesRepository seriesRepository;
    private final SeriesMapper seriesMapper;

    @Override
    public Page<SeriesDTO> findAllByCharacter(Long idCharacter, Pageable pageable) {
        Page<SeriesDTO> series = seriesRepository.findAllByCharacter(idCharacter, pageable)
                .map(seriesMapper::toDto);

        return series;
    }

}
