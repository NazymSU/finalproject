package kz.bitlab.techorda.finalproject.service;

import kz.bitlab.techorda.finalproject.dto.SingerDTO;
import kz.bitlab.techorda.finalproject.model.Singer;
import kz.bitlab.techorda.finalproject.repository.SingerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SingersService {

    public  final SingerRepository singerRepository;

    public List<Singer> getSingers(){
        return singerRepository.findAll();
    }
    public Singer addSinger(Singer singer){
        return  singerRepository.save(singer);
    }

}
