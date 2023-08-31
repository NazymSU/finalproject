package kz.bitlab.techorda.finalproject.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
   @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping(value = "/admin-panel")
    public String adminPanel(Model model){
        return "profile";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER')")
    @GetMapping(value = "/client-panel")
    public String clientPanel(Model model){
        return "profile";
    }



}
