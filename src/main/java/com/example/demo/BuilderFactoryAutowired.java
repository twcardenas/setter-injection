package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class BuilderFactoryAutowired {
    private final Map<String, VoiceBox> voiceBoxes;

    public Builder newBuilder(){
        return new Builder(voiceBoxes);
    }

    public static class Builder {
        private Map<String, VoiceBox> voiceBoxes;
        private String name;
        private VoiceBox voiceBox;

        Builder(Map<String, VoiceBox> voiceBoxes) {
            this.voiceBoxes = voiceBoxes;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setVoiceBox(String voiceBoxName) {
            this.voiceBox = this.voiceBoxes.get(voiceBoxName);
            return this;
        }

        public Animal build() {
            Animal animal = new Animal(name, voiceBox);
            return animal;
        }

    }
}
