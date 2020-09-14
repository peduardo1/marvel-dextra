package br.com.dextra.marvel.service.mapper;

import br.com.dextra.marvel.domain.Event;
import br.com.dextra.marvel.service.dto.EventDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface EventMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="modified", source="modified"),
            @Mapping(target="start", source="start"),
            @Mapping(target="end", source="end")
    })
    EventDTO toDto(Event event);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="modified", source="modified"),
            @Mapping(target="start", source="start"),
            @Mapping(target="end", source="end")
    })
    Event toEntity(EventDTO eventDTO);
}
