package kz.bitlab.techorda.finalproject.api;


import kz.bitlab.techorda.finalproject.model.Singer;

import kz.bitlab.techorda.finalproject.service.SingersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeRestController {

    private  final SingersService singersService;

    @GetMapping
    public List<Singer> singerList(){
      return singersService.getSingers();
    }

    @PostMapping
    public Singer addSinger(@RequestBody Singer singer){
        return singersService.addSinger(singer);
    }

}
