package com.example.tmpgpt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.tmpgpt.repository.RoomDao;

@Controller
public class HomeController {
    @Autowired RoomDao roomDao;

    @GetMapping({"/", "/home", "/index"})
    public String home() {
        
        return "home";
    }
    
}
