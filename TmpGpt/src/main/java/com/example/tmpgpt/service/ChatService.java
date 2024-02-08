package com.example.tmpgpt.service;

import java.util.List;
import com.example.tmpgpt.dto.ChatDto;

public interface ChatService {
    public List<ChatDto> findChats(int roomId);
    
    public void createChat(ChatDto qnaChat);
    
    public void updateChat(ChatDto roomDto);
    
    public void deleteChat(int roomId);

}
