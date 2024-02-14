package com.example.tmpgpt.repository;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.tmpgpt.dto.ChatDto;

@Repository
public class ChatDaoImpl implements ChatDao {
    @Autowired SqlSession session;

    @Override
    public List<ChatDto> findChats(int roomId) {
        return session.selectList("chat.findChats", roomId);
    }

    @Override
    public void createChat(List<ChatDto> qnaChat) {
        ChatDto questionChatDto = qnaChat.get(0);
        ChatDto answerChatDto = qnaChat.get(1);
        session.insert("chat.createChat", questionChatDto);
        session.insert("chat.createChat", answerChatDto);
        
    }

    @Override
    public void updateChat(ChatDto chatDto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteChatByRoomId(int roomId) {
        session.delete("chat.deleteChat", roomId);
    }

}
