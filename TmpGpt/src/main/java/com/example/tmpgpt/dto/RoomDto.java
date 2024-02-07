package com.example.tmpgpt.dto;

import org.apache.ibatis.type.Alias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Alias("roomDto")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDto {
    private int roomId;
    private String roomName;
}
