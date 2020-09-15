package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.ComicDTO;
import br.com.dextra.marvel.service.dto.EventDTO;
import br.com.dextra.marvel.service.impl.ComicServiceImpl;
import br.com.dextra.marvel.service.impl.EventServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EventServiceTest {

    @Autowired
    EventServiceImpl eventService;

    Pageable pageable = PageRequest.of(0,1);

    @Test
    public void checkEventsResult(){
        EventDTO eventDTO = createTestEvent();
        System.out.println(eventDTO);

        Page<EventDTO> foundEvent= eventService.findAllByCharacter(6l, pageable);
        System.out.println(foundEvent.getContent().get(0));
        assertThat(foundEvent.getContent().get(0)).isEqualTo(eventDTO);
    }

    public EventDTO createTestEvent(){
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(5l);
        eventDTO.setTitle("Homem Aranha - numero 154");
        eventDTO.setStart("1991-09-22T00:00:00.000-03:00");
        eventDTO.setEnd("1991-09-22T00:00:00.000-03:00");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        if(month < 10)
            eventDTO.setModified(year+"-0"+(month+1)+"-"+day+"T00:00:00.000-03:00");
        else
            eventDTO.setModified(year+"-"+(month+1)+"-"+day+"T00:00:00.000-03:00");

        return eventDTO;
    }
}
