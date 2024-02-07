package com.example.tmpgpt.repository;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.tmpgpt.dto.RoomDto;

@Repository
public class RoomDaoImpl implements RoomDao {
    @Autowired SqlSession session;

    @Override
    public List<RoomDto> findAllRooms() {
        return session.selectList("room.findAllRooms");
    }
    
    @Override
    public RoomDto findByRoomId(int roomId) {        
        return session.selectOne("room.findByRoomId", roomId);
    }

    @Override
    public void createRoom(RoomDto roomDto) {
        session.insert("room.createRoom", roomDto);
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
