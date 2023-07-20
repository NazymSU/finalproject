package kz.bitlab.techorda.finalproject.mapper;

import kz.bitlab.techorda.finalproject.dto.SingerDTO;
import kz.bitlab.techorda.finalproject.model.Singer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SingerMapper {
//    @Mapping(source = "name",target = "name")
//    @Mapping(source = "country",target = "country")
    SingerDTO toDto(Singer singer);
    Singer toModel(SingerDTO singerDTO);
    List<SingerDTO>  toDtoList(List<Singer> singerList);
    List<Singer> toModelList(List<SingerDTO> singerDTOList);
}
