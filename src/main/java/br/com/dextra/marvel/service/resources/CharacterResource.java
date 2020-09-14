package br.com.dextra.marvel.service.resources;

import br.com.dextra.marvel.domain.Character;
import br.com.dextra.marvel.domain.Comic;
import br.com.dextra.marvel.service.*;
import br.com.dextra.marvel.service.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/character"})
public class CharacterResource {

    @Autowired
    private CharacterService characterService;

    @Autowired
    private ComicService comicService;

    @Autowired
    private EventService eventService;

    @Autowired
    private SeriesService seriesService;

    @Autowired
    private StoryService storyService;

    @GetMapping
    public ResponseEntity<Page<CharacterDTO>> getAllCharacters(Pageable pageable){
        Page<CharacterDTO> characters = characterService.findAll(pageable);

        return new ResponseEntity<>(characters, HttpStatus.OK);
    }

    @GetMapping("/{characterId}")
    public ResponseEntity<CharacterDTO>
                    findCharacterById(@PathVariable Long characterId)  {
        CharacterDTO character = characterService.findById(characterId);

        return new ResponseEntity<CharacterDTO>(character, HttpStatus.OK);
    }

    @GetMapping("/{characterId}/comics")
    public ResponseEntity<Page<ComicDTO>>
                    findComicsByCharacterId(@PathVariable Long characterId, Pageable pageable) {
        Page<ComicDTO> comics = comicService.findAllByCharacter(characterId, pageable);

        if(comics.getContent().isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(comics, HttpStatus.OK);
    }

    @GetMapping("/{characterId}/events")
    public ResponseEntity<Page<EventDTO>>
                    findEventsByCharacterId(@PathVariable Long characterId, Pageable pageable) {
        Page<EventDTO> events = eventService.findAllByCharacter(characterId, pageable);

        if (events.getContent().isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(events, HttpStatus.OK);
    }

    @GetMapping("/{characterId}/series")
    public ResponseEntity<Page<SeriesDTO>>
                    findSeriesByCharacterId(@PathVariable Long characterId, Pageable pageable) {
        Page<SeriesDTO> series = seriesService.findAllByCharacter(characterId, pageable);

        if (series.getContent().isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(series, HttpStatus.OK);
    }

    @GetMapping("/{characterId}/stories")
    public ResponseEntity<Page<StoryDTO>>
                    findStoriesByCharacterId(@PathVariable Long characterId, Pageable pageable) {
        Page<StoryDTO> stories = storyService.findAllByCharacter(characterId, pageable);

        if (stories.getContent().isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(stories, HttpStatus.OK);
    }
}
