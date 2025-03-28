package com.local_chat.local_chat.service;

import com.local_chat.local_chat.model.Message;
import com.local_chat.local_chat.repository.ChatRoomRepository;
import com.local_chat.local_chat.repository.MessageRepository;
import com.local_chat.local_chat.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;
    private final ChatRoomRepository chatRoomRepository;
    private final UserRepository userRepository;

    public Message save(Message message) {
        var chatId = message.getChatRoomId();
        message.setChatRoomId(chatId);
        messageRepository.save(message);
        return message;
    }

    public List<Message> findChatRoomMessages(int senderId) {
        var chatRoom = chatRoomRepository.findByUserIdCreator(userRepository.findUserById(senderId));
        return messageRepository.findMessagesByChatRoomId(chatRoom);
    }
}



