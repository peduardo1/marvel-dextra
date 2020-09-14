package br.com.dextra.marvel.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="story")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String type;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modified;

    @ManyToMany(mappedBy = "stories")
    List<Character> characters;
}
