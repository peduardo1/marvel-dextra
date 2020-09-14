package br.com.dextra.marvel.service.mapper;

import br.com.dextra.marvel.domain.Character;
import br.com.dextra.marvel.service.dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;


@Component
@Mapper(componentModel = "spring",
        uses = {ComicMapper.class,
                EventMapper.class,
                SeriesMapper.class,
                StoryMapper.class})
public interface CharacterMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="name", source="name"),
            @Mapping(target="description", source="description"),
            @Mapping(target="modified", source="modified"),
            @Mapping(target="comics", source="comics"),
            @Mapping(target="events", source="events"),
            @Mapping(target="series", source="series"),
            @Mapping(target="stories", source="stories"),
    })
    CharacterDTO toDto(Character character);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="name", source="name"),
            @Mapping(target="description", source="description"),
            @Mapping(target="modified", source="modified"),
            @Mapping(target="comics", source="comics"),
            @Mapping(target="events", source="events"),
            @Mapping(target="series", source="series"),
            @Mapping(target="stories", source="stories"),
    })
    Character toEntity(CharacterDTO characterDTO);
}
