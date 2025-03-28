package com.local_chat.local_chat.service;

import com.local_chat.local_chat.DTO.request.ChatRoomCreationRequest;
import com.local_chat.local_chat.DTO.response.ChatRoomCredResponse;
import com.local_chat.local_chat.model.ChatRoom;
import com.local_chat.local_chat.repository.ChatRoomRepository;
import com.local_chat.local_chat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;
    private final UserRepository userRepository;

    public ChatRoomCredResponse proceedInChat(ChatRoom chatRoom){
        var chatRoomId = chatRoom.getId();
       chatRoom.setUserNumber(chatRoom.getUserNumber() - 1); //TODO EXCEPTION
       chatRoomRepository.save(chatRoom);
       return ChatRoomCredResponse.builder()
               .chatRoomId(chatRoomId)
               .build();
    }

    private ChatRoomCredResponse createChat(int userCreatorId, ChatRoomCreationRequest request){
        var chatRoom = ChatRoom
                .builder()
                .userIdCreator(userRepository.findUserById(userCreatorId))
                .timeStamp(new Date())
                .chatName(request.getChatName())
                .userNumber(request.getChatUserNumber())
                .build();
        chatRoomRepository.save(chatRoom);
        return ChatRoomCredResponse.builder()
                .chatRoomId(chatRoom.getId())
                .build();
    }
}
