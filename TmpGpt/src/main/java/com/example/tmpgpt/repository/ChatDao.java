package com.example.tmpgpt.repository;

import java.util.List;
import com.example.tmpgpt.dto.ChatDto;

public interface ChatDao {
    public List<ChatDto> findChats(int roomId);
    
    public void createChat(List<ChatDto> qnaChat);
    
    public void updateChat(ChatDto chatDto);
    
    public void deleteChat(int chatId);
}
