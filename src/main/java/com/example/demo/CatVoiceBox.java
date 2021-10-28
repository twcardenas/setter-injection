package com.example.demo;

import org.springframework.stereotype.Component;

@Component(CatVoiceBox.CAT_VOICE)
public class CatVoiceBox implements VoiceBox {
    public static final String CAT_VOICE = "CatVoice";
    @Override
    public String speak() {
        return "Meow!";
    }
}
