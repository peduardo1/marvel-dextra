package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.ComicDTO;
import br.com.dextra.marvel.service.impl.ComicServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ComicServiceTest {

    @Autowired
    ComicServiceImpl comicService;

    Pageable pageable = PageRequest.of(0,1);

    ComicDTO comic;

    @Test
    public void checkComicsResult(){
        comic = createTestComic();
        Page<ComicDTO> foundComic = comicService.findAllByCharacter(6l, pageable);
        assertThat(foundComic.getContent().get(0)).isEqualTo(comic);
    }

    public ComicDTO createTestComic(){
        ComicDTO comicDTO = new ComicDTO();
        comicDTO.setId(4l);
        comicDTO.setTitle("X-men");
        comicDTO.setFormat("Almanaque");
        comicDTO.setPageCount(128);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        if(month < 10)
            comicDTO.setModified(year+"-0"+(month+1)+"-"+day+"T00:00:00.000-03:00");
        else
            comicDTO.setModified(year+"-"+(month+1)+"-"+day+"T00:00:00.000-03:00");

        return comicDTO;
    }
}
