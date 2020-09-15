package br.com.dextra.marvel.service.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EventDTO implements Serializable {

    private Long id;
    private String title;
    private String description;
    private String modified;
    private String start;
    private String end;

}
