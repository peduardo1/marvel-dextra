package br.com.dextra.marvel.service.dto;

import br.com.dextra.marvel.domain.Comic;
import br.com.dextra.marvel.domain.Event;
import br.com.dextra.marvel.domain.Series;
import br.com.dextra.marvel.domain.Story;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CharacterDTO implements Serializable {

    private Long id;
    private String name;
    private String description;
    private String modified;
    private List<ComicDTO> comics;
    private List<EventDTO> events;
    private List<SeriesDTO> series;
    private List<StoryDTO> stories;
}
