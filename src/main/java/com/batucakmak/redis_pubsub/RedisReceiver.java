package com.batucakmak.redis_pubsub;

import org.springframework.stereotype.Component;

@Component
public class RedisReceiver {
    public void receiveMessage(String message){
        System.out.println("Got message:"+ message);
    }
}
