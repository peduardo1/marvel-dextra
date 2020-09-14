package br.com.dextra.marvel.service.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Calendar;

@Getter
@Setter
@EqualsAndHashCode
public class StoryDTO implements Serializable {
    private Long id;
    private String title;
    private String description;
    private String type;
    private String modified;
}
