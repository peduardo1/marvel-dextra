package br.com.dextra.marvel.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="event")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private String title;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modified;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar start;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar end;

    @ManyToMany(mappedBy = "events")
    List<Character> characters;

}
