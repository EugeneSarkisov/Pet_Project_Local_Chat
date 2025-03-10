package com.local_chat.local_chat.controller;

import com.local_chat.local_chat.model.Message;
import com.local_chat.local_chat.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ChatController {
    private final MessageService messageService;

    @MessageMapping("/chat")
    public void processMessage(@Payload Message message){
        messageService.save(message);
    }
}
