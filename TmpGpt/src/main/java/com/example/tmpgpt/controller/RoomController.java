package com.example.tmpgpt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @GetMapping("/last")
    public int getLastRoomId() {
        return roomService.getLastRoomId();
    }
    
    @PostMapping
    public ResponseEntity<RoomDto> createRoom(@RequestBody RoomDto roomDto) {
        roomService.createRoom(roomDto);
        
        return ResponseEntity.ok(roomDto);
    }
    
    @PatchMapping("/{roomId}")
    public ResponseEntity<RoomDto> updateRoom(@PathVariable int roomId, @RequestBody RoomDto roomDto) {
        roomDto.setRoomId(roomId);
        roomService.updateRoom(roomDto);
        
        System.out.println(roomDto);
        return null;
    }
    
    @DeleteMapping("/{roomId}")
    public ResponseEntity<RoomDto> deleteRoom(@PathVariable int roomId) {
        roomService.deleteRoom(roomId);
        
        return null;
    }
}
