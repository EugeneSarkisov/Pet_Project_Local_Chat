package com.local_chat.local_chat.DTO.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Answer from chat")
public class ChatRoomCredResponse {
    private int chatRoomId;

}
