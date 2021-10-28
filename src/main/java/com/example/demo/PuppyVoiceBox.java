package com.example.demo;

import org.springframework.stereotype.Component;

@Component(PuppyVoiceBox.PUPPY_VOICE)
public class PuppyVoiceBox implements VoiceBox {
    public static final String PUPPY_VOICE = "PuppyVoice";
    @Override
    public String speak() {
        return "Bark!";
    }
}
