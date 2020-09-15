package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.SeriesDTO;
import br.com.dextra.marvel.service.dto.StoryDTO;
import br.com.dextra.marvel.service.impl.SeriesServiceImpl;
import br.com.dextra.marvel.service.impl.StoryServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StoryServiceTest {
    @Autowired
    StoryServiceImpl storyService;

    Pageable pageable = PageRequest.of(0,1);

    @Test
    public void checkSeriesResult(){
        StoryDTO storyDTO = createTestStory();
        Page<StoryDTO> foundStory = storyService.findAllByCharacter(6l, pageable);
        assertThat(foundStory.getContent().get(0)).isEqualTo(storyDTO);
    }

    public StoryDTO createTestStory(){
        StoryDTO storyDTO = new StoryDTO();
        storyDTO.setId(4l);
        storyDTO.setTitle("X-men");
        storyDTO.setType("1991");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        if(month < 10)
            storyDTO.setModified(year+"-0"+(month+1)+"-"+day+"T00:00:00.000-03:00");
        else
            storyDTO.setModified(year+"-"+(month+1)+"-"+day+"T00:00:00.000-03:00");

        return storyDTO;
    }
}
