package com.example.demo;

public class Animal {
    private String name;
    private VoiceBox voiceBox;

    public Animal(String name, VoiceBox voiceBox) {
        this.name = name;
        this.voiceBox = voiceBox;
    }


    public String getName() {
        return name;
    }

    public String speak() {
        if(null == voiceBox) return String.format("%s doesn't have a voicebox!", name);
        return String.format("%s says: %s", getName(), voiceBox.speak());
    }
}
