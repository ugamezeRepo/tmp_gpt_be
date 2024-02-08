package com.example.tmpgpt.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tmpgpt.dto.ChatDto;
import com.example.tmpgpt.dto.RoomDto;
import com.example.tmpgpt.repository.ChatDao;
import com.example.tmpgpt.repository.RoomDao;

@Service
public class ChatServiceImpl implements ChatService {
    @Autowired ChatDao chatDao;
    @Autowired RoomDao roomDao;

    @Override
    public List<ChatDto> findChats(int roomId) {
        return chatDao.findChats(roomId);
    }

    @Override
    public void createChat(ChatDto chatDto) {
        List<ChatDto> qnaChat = new ArrayList<>();
        int roomId = chatDto.getRoomId();
        
        if (roomId == 0) {
            roomId = roomDao.getLastRoomId() + 1;
            RoomDto roomDto = new RoomDto(roomId, chatDto.getMsg());
            roomDao.createRoom(roomDto);
        }
        
        ChatDto answerChatDto = new ChatDto().builder().roomId(roomId).writer("tmpGPT").msg("모르겠습니다").build();
        
        qnaChat.add(chatDto);
        qnaChat.add(answerChatDto);

        
        
        chatDao.createChat(qnaChat);
        
    }

    @Override
    public void updateChat(ChatDto roomDto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteChat(int roomId) {
        // TODO Auto-generated method stub
        
    }

}
