package kz.bitlab.techorda.finalproject.api;

import kz.bitlab.techorda.finalproject.model.Singer;
import kz.bitlab.techorda.finalproject.model.User;
import kz.bitlab.techorda.finalproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
@RequiredArgsConstructor
public class AdminRestController {
    private final UserService userService;
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping(value = "{id}")
    public User getUsers(@PathVariable(name = "id") Long id){
        return userService.getUsers(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


}
