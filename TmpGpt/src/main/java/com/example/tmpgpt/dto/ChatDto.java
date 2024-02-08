package com.example.tmpgpt.dto;

import org.apache.ibatis.type.Alias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Alias("chatDto")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatDto {
    private int chatId;
    private int roomId;
    private String writer;
    private String msg;
}
