package org.example.remotecontroller.receiver;

public class Stereo {
    String location;
    int volume;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " 오디오가 켜졌습니다.");
    }

    public void off() {
        System.out.println(location + " 오디오가 꺼졌습니다.");
    }

    public void setCD() {
    }

    public void setDVD() {
    }

    public void setRadio() {
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
