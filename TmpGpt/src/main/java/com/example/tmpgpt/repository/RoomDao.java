package com.example.tmpgpt.repository;

import java.util.List;
import com.example.tmpgpt.dto.RoomDto;

public interface RoomDao {
    public List<RoomDto> findAllRooms();

    public int getLastRoomId();
    
    public RoomDto findByRoomId(int roomId);
    
    public void createRoom(RoomDto roomDto);
    
    public void updateRoom(RoomDto roomDto);
    
    public void deleteRoom(int roomId);
}
