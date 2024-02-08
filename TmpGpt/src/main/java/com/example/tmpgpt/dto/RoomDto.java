package com.example.tmpgpt.dto;

import org.apache.ibatis.type.Alias;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("roomId")
    private int roomId;
    @JsonProperty("roomName")
    private String roomName;
}
