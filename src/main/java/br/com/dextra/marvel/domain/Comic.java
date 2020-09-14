package br.com.dextra.marvel.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="comic")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private String title;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar modified;
    private String format;

    @Column(name="page_count")
    private Integer pageCount;

    @ManyToMany(mappedBy = "comics")
    List<Character> characters;
}
