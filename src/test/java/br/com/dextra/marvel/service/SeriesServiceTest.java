package br.com.dextra.marvel.service;

import br.com.dextra.marvel.service.dto.SeriesDTO;
import br.com.dextra.marvel.service.impl.SeriesServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Calendar;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SeriesServiceTest {

    @Autowired
    SeriesServiceImpl seriesService;

    Pageable pageable = PageRequest.of(0,1);

    @Test
    public void checkSeriesResult(){
        SeriesDTO eventDTO = createTestSeries();
        Page<SeriesDTO> foundSeries = seriesService.findAllByCharacter(6l, pageable);
        assertThat(foundSeries.getContent().get(0)).isEqualTo(eventDTO);
    }

    public SeriesDTO createTestSeries(){
        SeriesDTO seriesDTO = new SeriesDTO();
        seriesDTO.setId(4l);
        seriesDTO.setTitle("X-men");
        seriesDTO.setStartYear(1991);
        seriesDTO.setEndYear(1993);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        if(month < 10)
            seriesDTO.setModified(year+"-0"+(month+1)+"-"+day+"T00:00:00.000-03:00");
        else
            seriesDTO.setModified(year+"-"+(month+1)+"-"+day+"T00:00:00.000-03:00");

        return seriesDTO;
    }
}
