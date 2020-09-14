package br.com.dextra.marvel.service.mapper;

import br.com.dextra.marvel.domain.Series;
import br.com.dextra.marvel.service.dto.SeriesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface SeriesMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="modified", source="modified"),
            @Mapping(target="startYear", source="startYear"),
            @Mapping(target="endYear", source="endYear")
    })
    SeriesDTO toDto(Series series);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="title", source="title"),
            @Mapping(target="description", source="description"),
            @Mapping(target="modified", source="modified"),
            @Mapping(target="startYear", source="startYear"),
            @Mapping(target="endYear", source="endYear")
    })
    Series toEntity(SeriesDTO seriesDTO);
}
