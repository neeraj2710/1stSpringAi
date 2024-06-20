package com.spring_ai.spring_ai_1;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    private final ChatClient chatClient;


    public ApiController(ChatClient.Builder chatClient){
        this.chatClient =  chatClient.build();
    }

    @GetMapping("/prompt")
    public String prompt(String message){
        return chatClient.call(message);
    }
}
