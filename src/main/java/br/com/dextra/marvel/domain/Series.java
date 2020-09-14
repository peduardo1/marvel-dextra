package br.com.dextra.marvel.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="series")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modified;

    @Column(name="start_year")
    private Integer startYear;

    @Column(name="end_year")
    private Integer endYear;

    @ManyToMany(mappedBy = "series")
    List<Character> characters;
}
