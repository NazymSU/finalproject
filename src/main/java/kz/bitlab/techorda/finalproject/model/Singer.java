package kz.bitlab.techorda.finalproject.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "singers")
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "country")
    private  String country;
//    @OneToMany
//    private List<Album> albums;
}
