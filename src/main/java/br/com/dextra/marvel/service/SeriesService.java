package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.SeriesDTO;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public interface SeriesService {
    Page<SeriesDTO> findAllByCharacter(Long idCharacter, Pageable pageable);

}
