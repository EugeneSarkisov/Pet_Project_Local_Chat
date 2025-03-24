package com.local_chat.local_chat.DTO.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Schema(description = "Create Chatroom")
public class ChatRoomCreationRequest {
    @Schema(description = "Chat name")
    @Size(min = 5, max = 50, message = "Must contain min 5 letters")
    @NotBlank(message = "Chat name mustn't be blanked")
    private String chatName;
    @Schema(description = "Number of users")
    @Size(min = 2, max = 16, message = "Must contain min 2 users")
    private int chatUserNumber;
}
