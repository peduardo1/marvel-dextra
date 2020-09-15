package br.com.dextra.marvel.resources;

import br.com.dextra.marvel.service.*;
import br.com.dextra.marvel.service.mapper.CharacterMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CharacterResource.class)
public class CharacterResourceTest {

    @MockBean CharacterService characterService;
    @MockBean ComicService comicService;
    @MockBean EventService eventService;
    @MockBean SeriesService seriesService;
    @MockBean StoryService storyService;

    @Autowired MockMvc mockMvc;

    @Test
    public void checkIfReturnsStatusOk()throws Exception{

        mockMvc.perform(get("/character/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
