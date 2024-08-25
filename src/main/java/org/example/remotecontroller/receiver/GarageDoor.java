package org.example.remotecontroller.receiver;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + " 차고 문이 열렸습니다.");
    }

    public void down() {
        System.out.println(location + " 차고 문이 닫힙니다.");
    }

    public void stop() {
    }

    public void lightOn() {
    }

    public void lightOff() {
    }
}
