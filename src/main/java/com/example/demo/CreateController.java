package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateController {
    private final BuilderFactoryAutowired factory;
    @GetMapping(path = "cat-no-voicebox")
    public String catSpeak() {
        return factory.newBuilder().setName("Mojo").build().speak();
    }
    @GetMapping(path = "cat")
    public String catSpeakWithVoiceBox() {
        return factory.newBuilder()
                .setName("Roger")
                .setVoiceBox(CatVoiceBox.CAT_VOICE)
                .build()
                .speak();
    }
    @GetMapping(path = "puppy")
    public String puppySpeak() {
        return factory.newBuilder()
                .setName("Auggie")
                .setVoiceBox(PuppyVoiceBox.PUPPY_VOICE)
                .build()
                .speak();
    }
}
