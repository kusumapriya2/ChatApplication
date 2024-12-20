package com.chatAppl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chatAppl.model.Message;
import com.chatAppl.repository.MessageRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class ChatController {

    @Autowired
    private MessageRepository messageRepository;

    // This method will handle the form submission
    @PostMapping("/insertMessage")
    public String insertMessage(@RequestParam String sender, @RequestParam String content) {

        // Create a new message
        Message message = new Message();
        message.setSender(sender);
        message.setContent(content);
        message.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        // Save the message to the database
        messageRepository.save(message);

        // Return a success response
        return "Message saved successfully!";
    }
}
