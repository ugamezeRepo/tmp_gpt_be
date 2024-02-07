package com.example.tmpgpt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.tmpgpt.dto.RoomDto;
import com.example.tmpgpt.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    @Autowired RoomService roomService;

    @GetMapping
    public List<RoomDto> findRooms() {
        return roomService.findAllRooms();
    }
    
    @GetMapping("/{roomId}")
    public RoomDto findByRoomId(@PathVariable int roomId) {
        return roomService.findByRoomId(roomId);
    }
    
    @PostMapping
    public String createRoom(RoomDto roomDto) {
        Boolean isCreated = roomService.createRoom(roomDto);
        
        return isCreated ? "방이 생성됐습니다!" : "방 생성에 실패했습니다!";
    }
}
