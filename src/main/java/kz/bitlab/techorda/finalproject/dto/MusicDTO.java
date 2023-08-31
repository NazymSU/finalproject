package kz.bitlab.techorda.finalproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicDTO {
    private  Long id;
    private  String title;
    private  int releaseYear;
    private SingerDTO singer;

}
