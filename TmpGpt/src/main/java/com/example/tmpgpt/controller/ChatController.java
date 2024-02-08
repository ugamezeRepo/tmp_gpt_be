package com.example.tmpgpt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.tmpgpt.dto.ChatDto;
import com.example.tmpgpt.service.ChatService;

@RestController
@RequestMapping("/api/rooms/{roomId}/chat")
public class ChatController {
    @Autowired ChatService chatService;
    
    @GetMapping
    public List<ChatDto> findChats(@PathVariable int roomId) {
         return chatService.findChats(roomId);
    }
    
    @PostMapping
    public void createChat(@PathVariable int roomId, @RequestBody ChatDto chatDto) {
        chatDto.setRoomId(roomId);
        chatService.createChat(chatDto);
    }
    
}
