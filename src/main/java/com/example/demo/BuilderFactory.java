package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BuilderFactory {
    public Builder newBuilder(){
        return new Builder();
    }

    public static class Builder {
        private String name;
        private VoiceBox voiceBox;

        Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setVoiceBox(VoiceBox voiceBox) {
            this.voiceBox = voiceBox;
            return this;
        }

        public Animal build() {
            Animal animal = new Animal(name, voiceBox);
            return animal;
        }

    }
}
