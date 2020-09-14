package br.com.dextra.marvel.service.mapper;

import br.com.dextra.marvel.domain.Comic;
import br.com.dextra.marvel.service.dto.ComicDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ComicMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="modified", source="modified"),
            @Mapping(target="format", source="format"),
            @Mapping(target="pageCount", source="pageCount")
    })
    ComicDTO toDto(Comic comic);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="modified", source="modified"),
            @Mapping(target="format", source="format"),
            @Mapping(target="pageCount", source="pageCount")
    })
    Comic toEntity(ComicDTO comicDTO);

}
