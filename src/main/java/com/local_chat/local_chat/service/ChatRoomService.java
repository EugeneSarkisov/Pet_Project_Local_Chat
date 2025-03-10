package com.local_chat.local_chat.service;

import com.local_chat.local_chat.model.ChatRoom;
import com.local_chat.local_chat.repository.ChatRoomRepository;
import com.local_chat.local_chat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;
    private final UserRepository userRepository;

    public Optional<Integer> getChatRoomId(int userCreatorId, boolean createIfNotExist){
        return chatRoomRepository
                .findByUserIdCreator(userRepository.findUserById(userCreatorId))
                .map(ChatRoom::getId)
                .or(() -> {
                    if(createIfNotExist){
                        ChatRoom chat = createChat(userCreatorId);
                        return Optional.of(chat.getId());
                    }
                    return Optional.empty();
                });

    }

    private ChatRoom createChat(int userCreatorId){
        var chatRoom = ChatRoom
                .builder()
                .userIdCreator(userRepository.findUserById(userCreatorId))
                .timeStamp(new Date())
                .build();
        chatRoomRepository.save(chatRoom);
        return chatRoom;
    }
}
