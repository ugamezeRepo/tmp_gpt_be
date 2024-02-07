package com.example.tmpgpt.service;

import java.util.List;
import com.example.tmpgpt.dto.RoomDto;

public interface RoomService {
    public List<RoomDto> findAllRooms();
    
    public RoomDto findByRoomId(int roomId);
    
    public Boolean createRoom(RoomDto roomDto);
    
    public void updateRoom(RoomDto roomDto);
    
    public void deleteRoom(RoomDto roomDto);
}
