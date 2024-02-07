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
    public Boolean createRoom(RoomDto roomDto) {
        roomDao.createRoom(roomDto);

        int roomId = roomDto.getRoomId();
        Boolean isCreated = roomDao.findByRoomId(roomId) != null ? true : false; 
        
        return isCreated;
    }

    @Override
    public void updateRoom(RoomDto roomDto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteRoom(RoomDto roomDto) {
        // TODO Auto-generated method stub
        
    }



}
