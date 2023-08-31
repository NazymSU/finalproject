package kz.bitlab.techorda.finalproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "musics")
@Getter
@Setter
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "title")
    private  String title;
    @Column(name = "releaseYear")
    private  int releaseYear;
    @ManyToOne
    private Singer singer;
}
