package com.example.tmpgpt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.tmpgpt.dto.ChatDto;
import com.example.tmpgpt.dto.RoomDto;
import com.example.tmpgpt.repository.RoomDao;

@Controller
public class HomeController {
    @Autowired RoomDao roomDao;

    @GetMapping({"/", "/home", "/index"})
    public String home() {
        
        return "home";
    }
    
    @PostMapping("/")
    public String firstChat(ChatDto chatDto) {
        int roomId = chatDto.getRoomId();
        
        if (roomId == 0) {
            roomId = roomDao.getLastRoomId() + 1;
            RoomDto roomDto = new RoomDto(roomId, chatDto.getMsg());
            roomDao.createRoom(roomDto);
            
            return String.format("redirect:http://localhost:9191/tmpgpt/api/rooms/%d/chat", roomId);
        }
        return "";
    }
}
