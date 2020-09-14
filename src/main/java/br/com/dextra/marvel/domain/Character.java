package br.com.dextra.marvel.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="character")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private String name;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modified;

    @ManyToMany
    @JoinTable(
            name = "character_comics",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "comic_id"))
    private List<Comic> comics;

    @ManyToMany
    @JoinTable(
            name = "character_events",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id"))
    private List<Event> events;

    @ManyToMany
    @JoinTable(
            name = "character_series",
            indexes = {},
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "series_id"))
    private List<Series> series;

    @ManyToMany
    @JoinTable(
            name = "character_stories",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "story_id"))
    private List<Story> stories;

}
