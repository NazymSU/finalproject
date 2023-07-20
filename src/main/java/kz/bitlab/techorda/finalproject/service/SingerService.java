package kz.bitlab.techorda.finalproject.service;

import kz.bitlab.techorda.finalproject.dto.SingerDTO;
import kz.bitlab.techorda.finalproject.mapper.SingerMapper;
import kz.bitlab.techorda.finalproject.model.Singer;
import kz.bitlab.techorda.finalproject.repository.SingerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SingerService {
  public final SingerMapper singerMapper;
  public  final SingerRepository singerRepository;

  public List<SingerDTO> getSingers(){
      return singerMapper.toDtoList(singerRepository.findAll());
  }
  public SingerDTO addSinger(SingerDTO singerDTO){
      return  singerMapper.toDto(singerRepository.save(singerMapper.toModel(singerDTO)));
  }

  public SingerDTO getSinger(Long id){
      return  singerMapper.toDto(singerRepository.findById(id).orElse(new Singer()));
  }

  public  SingerDTO updateSinger(SingerDTO singerDTO){
      return  singerMapper.toDto(singerRepository.save(singerMapper.toModel(singerDTO)));
  }

  public void deleteSinger(Long id){
     singerRepository.deleteById(id);
  }

}
