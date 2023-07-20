package kz.bitlab.techorda.finalproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "title")
    private  String title;
    @Column(name = "releaseYear")
    private  int releaseYear;

}
