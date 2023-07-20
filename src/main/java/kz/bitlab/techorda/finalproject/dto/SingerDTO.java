package kz.bitlab.techorda.finalproject.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingerDTO {
    private Long id;
    private String name;
    private  String country;
}
