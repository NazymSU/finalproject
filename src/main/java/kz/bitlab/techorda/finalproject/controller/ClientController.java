package kz.bitlab.techorda.finalproject.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
   @PreAuthorize("hasAnyRole('ROLE_USER')")
    @GetMapping(value = "/client-panel")
    public String clientPanel(Model model){
        return "client";
    }
}
