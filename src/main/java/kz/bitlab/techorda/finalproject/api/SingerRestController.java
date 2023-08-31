package kz.bitlab.techorda.finalproject.api;

import kz.bitlab.techorda.finalproject.dto.SingerDTO;
import kz.bitlab.techorda.finalproject.service.SingerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/singer")
@RequiredArgsConstructor
public class SingerRestController {

    private  final SingerService singerService;

    @GetMapping
    public List<SingerDTO> singerList(){

        return singerService.getSingers();
    }
    @GetMapping("/{id}")
    public  SingerDTO getSinger(@PathVariable Long id){
        return  singerService.getSinger(id);
    }

    @PostMapping
//    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public  SingerDTO addSinger(@RequestBody SingerDTO singerDTO){

        return singerService.addSinger(singerDTO);
    }
    @PutMapping
//    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public SingerDTO updateSinger(@RequestBody SingerDTO singerDTO){

        return  singerService.updateSinger(singerDTO);
    }
    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public  void  deleteSinger(@PathVariable Long id){
        singerService.deleteSinger(id);
    }
}
