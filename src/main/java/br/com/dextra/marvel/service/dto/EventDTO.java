package br.com.dextra.marvel.service.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
public class EventDTO implements Serializable {

    private Long id;
    private String title;
    private String description;
    private String modified;
    private String start;
    private String end;

}
