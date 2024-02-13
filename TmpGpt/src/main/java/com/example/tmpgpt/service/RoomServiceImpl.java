package com.example.tmpgpt.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tmpgpt.dto.RoomDto;
import com.example.tmpgpt.repository.RoomDao;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired RoomDao roomDao;

    @Override
    public List<RoomDto> findAllRooms() {
        return roomDao.findAllRooms();
    }
    
    @Override
    public RoomDto findByRoomId(int roomId) {
        return roomDao.findByRoomId(roomId);
    }

    @Override
    public int getLastRoomId() {
        return roomDao.getLastRoomId();
    }
    
    @Override
    public void createRoom(RoomDto roomDto) {
        roomDao.createRoom(roomDto);
    }

    @Override
    public void updateRoom(RoomDto roomDto) {
        roomDao.updateRoom(roomDto);
    }

    @Override
    public void deleteRoom(int roomId) {
        roomDao.deleteRoom(roomId);
    }


}
