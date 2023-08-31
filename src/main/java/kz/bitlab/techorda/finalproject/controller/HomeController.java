package kz.bitlab.techorda.finalproject.controller;

import kz.bitlab.techorda.finalproject.model.User;
import kz.bitlab.techorda.finalproject.repository.PermissionRepository;
import kz.bitlab.techorda.finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    public UserService userService;
    @Autowired
    public PermissionRepository permissionRepository;

    @GetMapping(value = "/")
    public String indexPage(){
        return "index";
    }

    @GetMapping(value = "/sign-in-page")
    public String signinPage(){
        return "signin";
    }
    @GetMapping(value = "/sign-up-page")
    public String signupPage(){
        return "signup";
    }
    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/profile")
    public String profilePage(){
        return "profile";
    }
    @GetMapping(value = "/music")
    public  String musicPage(){
        return "music";
    }
    @PostMapping(value = "/to-sign-up")
    public String toSignUp(@RequestParam (name = "user_fullname") String fullname,
                           @RequestParam (name = "username") String username,
                           @RequestParam (name = "password") String password,
                           @RequestParam (name = "repassword") String repassword){
        if(password.equals(repassword)){
            User user = new User();
            user.setFullName(fullname);
            user.setUsername(username);
            user.setPassword(password);
            user.setRepassword(repassword);
            User newUser = userService.addUser(user);
            if(newUser!=null){
                return "redirect:/sign-up-page?success";
            }else {
                return "redirect:/sign-up-page?emailerror";
            }
        }else {
            return "redirect:/sign-up-page?passworderror";
        }
    }

}
